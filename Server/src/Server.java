import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Server extends UnicastRemoteObject implements ServerIF{

	/**
	 * 
	 */
	private static DataIF data;
	private static final long serialVersionUID = 1L;

	protected Server() throws RemoteException {
		super();
	}

	public static void main(String[] args) throws NotBoundException {
		try {
			Server server = new Server();
			Naming.rebind("Server", server);
			System.out.println("Server is ready !!!");			
			
			data = (DataIF)Naming.lookup("Data");
									
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Student> getAllStudentData() throws RemoteException, NullDataException {
		return data.getAllStudentData();
	}

	@Override
	public ArrayList<Course> getAllCourseData() throws RemoteException, NullDataException {
		return data.getAllCourseData();
	}

	@Override
	public boolean addStudent(String studentInfo) throws RemoteException {
		if(data.addStudent(studentInfo)) return true;
		else return false;
	}

	@Override
	public boolean deleteStudent(String studentId) throws RemoteException {
		if(data.deleteStudent(studentId)) return true;
		else return false;
	}

	@Override
	public boolean addCourse(String courseInfo) throws RemoteException {
		if(data.addCourse(courseInfo)) return true;
		else return false;	
	}

	@Override
	public boolean deleteCourse(String courseId) throws RemoteException {
		if(data.deleteCourse(courseId)) return true;
		else return false;	
	}

	@Override
	public boolean makeReservation(String reservationInfo) throws RemoteException, NullDataException {
		if(checkPrerequisites(reservationInfo) && data.makeReservation(reservationInfo)) return true;
		else return false;	
	}

	@Override
	public ArrayList<Reservation> getAllReservationData() throws RemoteException, NullDataException {
		return data.getAllReservationData();
	}
	
	public Student getStudent(String studentId) throws RemoteException, NullDataException {
		for(Student student : data.getAllStudentData()) {
			if(student.match(studentId)) return student;
		}
		return null;
	}
	
	public Course getCourse(String courseId) throws RemoteException, NullDataException {
		for(Course course : data.getAllCourseData()) {
			if(course.match(courseId)) return course;
		}
		return null;
	}	
	public boolean checkPrerequisites(String reservationInfo) throws RemoteException, NullDataException {
		Reservation reservation = new Reservation(reservationInfo);
		Student student = getStudent(reservation.studentId);
		Course course = getCourse(reservation.courseId);
		if(student==null||course==null) return false;
		if(student.completedCoursesList.containsAll(course.prerequisites)) return true;
		else return false;
	}
}
