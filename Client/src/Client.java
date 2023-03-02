import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Client {

	public static void main(String[] args) throws NotBoundException, IOException {
		ServerIF server;		
		BufferedReader objReader = new BufferedReader(new InputStreamReader(System.in));		
		try {
			server = (ServerIF)Naming.lookup("Server");
			while(true) {
				printMenu();				
				String sChoice = objReader.readLine().trim();
				switch(sChoice) {
				case "1":
					showList(server.getAllStudentData());
					break;
				case "2" :
					showList(server.getAllCourseData());
					break;
				case "3" :
					addStudent(server, objReader);
					break;
				case "4" :
					deleteStudent(server, objReader);
					break;
				case "5" :
					addCourse(server, objReader);
					break;
				case "6" :
					deleteCourse(server, objReader);
					break;
				case "7" :
					showList(server.getAllReservationData());
					break;
				case "8" :
					makeReservation(server, objReader); //server에서 할 일(studentId 체크, courseId 체크, 선수과목 체크, Exception 처리)
					break;
				case "x" : 
					return;
				default:
					System.out.println("Invalid Choice !!!");
				}
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NullDataException e) {
			e.printStackTrace();
		}

	}
	private static void printMenu() {
		System.out.println("******************** MENU *********************");
		System.out.println("1. List Students");
		System.out.println("2. List Courses");
		System.out.println("3. Add Student");
		System.out.println("4. Delete Student");
		System.out.println("5. Add Course");
		System.out.println("6. Delete Course");
		System.out.println("7. List Reservations");
		System.out.println("8. Make Reservation");
		System.out.println("x. Exit");
	}	
	private static void showList(ArrayList<?> dataList) {
		String list = "";
		for(int i = 0; i<dataList.size(); i++) {
			list += dataList.get(i) + "\n";
		}
		System.out.println(list);
	}
	private static void addStudent(ServerIF server, BufferedReader objReader) throws RemoteException, IOException {
		System.out.println("-----------Student Information----------");
		System.out.print("Student ID: "); String studentId = objReader.readLine().trim();
		System.out.print("Student Name: "); String studentName = objReader.readLine().trim();
		System.out.print("Student Department: "); String studentDept = objReader.readLine().trim();
		System.out.print("Student Completed Coures List: "); String completedCourses = objReader.readLine().trim();
		
		if(server.addStudent(studentId+" "+studentName+" "+studentDept+" "+completedCourses)) System.out.println("SUCCESS");
		else System.out.println("FAIL");
	}
	private static void deleteStudent(ServerIF server, BufferedReader objReader) throws RemoteException, IOException {
		System.out.print("Student ID: ");
		if(server.deleteStudent(objReader.readLine().trim())) System.out.println("SUCCESS");
		else System.out.println("FAIL");
	}
	private static void addCourse(ServerIF server, BufferedReader objReader) throws RemoteException, IOException {
		System.out.println("-----------Course Information----------");
		System.out.print("Course ID: "); String courseId = objReader.readLine().trim();
		System.out.print("Course Professor Name: "); String professorName = objReader.readLine().trim();
		System.out.print("Course Name: "); String courseName = objReader.readLine().trim();
		System.out.print("Course Prerequisites: "); String prerequisites = objReader.readLine().trim();
		
		if(server.addCourse(courseId+" "+professorName+" "+courseName+" "+prerequisites)) System.out.println("SUCCESS");
		else System.out.println("FAIL");
	}
	private static void deleteCourse(ServerIF server, BufferedReader objReader) throws RemoteException, IOException {
		System.out.print("Course ID: ");
		if(server.deleteCourse(objReader.readLine().trim())) System.out.println("SUCCESS");
		else System.out.println("FAIL");
	}
	private static void makeReservation(ServerIF server, BufferedReader objReader) throws RemoteException ,IOException, NullDataException {
		System.out.print("Student ID: "); String studentId = objReader.readLine().trim();
		System.out.print("Course ID: "); String courseId = objReader.readLine().trim();
        LocalDateTime now = LocalDateTime.now();
        String date = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd-HH:mm:ss"));
		if(server.makeReservation(studentId+" "+courseId+" "+date)) System.out.println("SUCCESS");
		else System.out.println("FAIL");
	}
}