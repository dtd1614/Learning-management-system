import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Data extends UnicastRemoteObject implements DataIF{

	protected static StudentList studentList;
	protected static CourseList courseList;
	protected static ReservationList reservationList;

	private static final long serialVersionUID = 1L;

	protected Data() throws RemoteException {
		super();
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try {
			Data data = new Data();
			Naming.rebind("Data", data);
			System.out.println("Data is ready !!!");
			
			studentList = new StudentList("src/Students.txt");
			courseList = new CourseList("src/Courses.txt");
			reservationList = new ReservationList("src/Reservation.txt");
			
			
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Student> getAllStudentData() throws RemoteException, NullDataException {
		return studentList.getAllStudentRecords();
	}

	@Override
	public ArrayList<Course> getAllCourseData() throws RemoteException, NullDataException {
		return courseList.getAllCourseRecords();
	}

	@Override
	public boolean addStudent(String studentInfo) throws RemoteException {
		if(studentList.addStudentRecords(studentInfo)) return true;
		else return false;
	}

	@Override
	public boolean deleteStudent(String studentId) throws RemoteException {
		if(studentList.deleteStudentRecords(studentId)) return true;
		else return false;
	}

	@Override
	public boolean addCourse(String courseInfo) throws RemoteException {
		if(courseList.addCourseRecords(courseInfo)) return true;
		else return false;	
		}

	@Override
	public boolean deleteCourse(String courseId) throws RemoteException {
		if(courseList.deleteCourseRecords(courseId)) return true;
		else return false;	
		}

	@Override
	public boolean makeReservation(String reservationInfo) throws RemoteException {
		if(reservationList.addReservationRecords(reservationInfo)) return true;
		else return false;		
		}

	@Override
	public ArrayList<Reservation> getAllReservationData() throws RemoteException, NullDataException {
		return reservationList.getAllReservationRecords();
	}

}
