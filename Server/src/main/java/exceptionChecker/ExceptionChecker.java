package exceptionChecker;

import java.util.List;
import java.util.StringTokenizer;
import exception.DuplicateDataException;
import exception.NullDataException;
import grpc.Reservation.Account;
import grpc.Reservation.AccountList;
import grpc.Reservation.Course;
import grpc.Reservation.CourseList;
import grpc.Reservation.Student;
import grpc.Reservation.StudentList;

public class ExceptionChecker {

	public void checkNullData(StudentList studentList) throws NullDataException {
		if(studentList.getStudentCount()==0) throw new NullDataException("StudentList is null");
	}
	
	public void checkNullData(CourseList courseList) throws NullDataException {
		if(courseList.getCourseCount()==0) throw new NullDataException("CourseList is null");
	}
	
	public void checkNullData(AccountList accountList) throws NullDataException {
		if(accountList.getAccountCount()==0) throw new NullDataException("AccountList is null");		
	}
	
	public void checkDuplicateId(StudentList studentList, String studentId) throws DuplicateDataException, NullDataException {
		this.checkNullData(studentList);
		for(int i = 0; i<studentList.getStudentCount(); i++) {
			if(studentList.getStudent(i).getStudentId().equals(studentId)) throw new DuplicateDataException("Student ID is duplicated");
		}
	}
	
	public void checkDuplicateId(CourseList courseList, String id) throws DuplicateDataException, NullDataException {
		this.checkNullData(courseList);
		for(int i = 0; i<courseList.getCourseCount(); i++) {
			if(courseList.getCourse(i).getCourseId().equals(id)) throw new DuplicateDataException("Course ID is duplicated");
		}
	}
	
	public void checkDuplicateId(AccountList accountList, String accountId) throws DuplicateDataException, NullDataException {
		this.checkNullData(accountList);
		for(int i = 0; i<accountList.getAccountCount(); i++) {
			if(accountList.getAccount(i).getId().equals(accountId)) throw new DuplicateDataException("Account Id is duplicated");
		}
	}
	
	public void checkNullId(StudentList studentList, String studentId) throws NullDataException {
		this.checkNullData(studentList);
		for(int i = 0; i<studentList.getStudentCount(); i++) {
			if(studentList.getStudent(i).getStudentId().equals(studentId)) return;
		}	
		throw new NullDataException("Student ID does not exist");
	}
	
	
	public void checkNullId(CourseList courseList, String id) throws NullDataException {
		this.checkNullData(courseList);
		for(int i = 0; i<courseList.getCourseCount(); i++) {
			if(courseList.getCourse(i).getCourseId().equals(id)) return;
		}	
		throw new NullDataException("Course ID does not exist");
	}
	
	public void checkNullId(AccountList accountList, String accountInfo) throws NullDataException {
		this.checkNullData(accountList);
        StringTokenizer stringTokenizer = new StringTokenizer(accountInfo);
		String Id = stringTokenizer.nextToken();
		String password = stringTokenizer.nextToken();
		for(int i = 0; i<accountList.getAccountCount(); i++) {
			if(accountList.getAccount(i).getId().equals(Id)) {
				this.checkNullPassword(accountList.getAccount(i), password); return;
			}
		}
		throw new NullDataException("Account ID does not exist");
	}
	
	public void checkNullPassword(Account account, String password) throws NullDataException {
		if(account.getPassword().equals(password)) return;
		throw new NullDataException("Wrong Password");
	}
	
	public void checkReservation(StudentList studentList, CourseList courseList, 
			String studentId, String courseId) throws DuplicateDataException, NullDataException {
		this.checkNullData(studentList);
		this.checkNullData(courseList);
		this.checkNullId(studentList, studentId);
		this.checkNullId(courseList, courseId);	
		Student student = null; 
		Course course = null; 			
		for(int i = 0; i<studentList.getStudentCount(); i++) {
			if(studentList.getStudent(i).getStudentId().equals(studentId)) student = studentList.getStudent(i);
		}		
		for(int i = 0; i<courseList.getCourseCount(); i++) {
			if(courseList.getCourse(i).getCourseId().equals(courseId)) course = courseList.getCourse(i);
		}			
		this.checkDuplicateReservation(student, course);
		this.checkPrerequisite(student, course);
	}
	
	public void checkPrerequisite(Student student, Course course) throws NullDataException {
		List<String> completedCourseList = student.getCompletedCourseList();
		List<String> checkPrerequisiteList = course.getPrerequisiteList();
		if(!completedCourseList.containsAll(checkPrerequisiteList)) throw new NullDataException("Prerequisite Incompleted"); 

	}
	
	public void checkDuplicateReservation(Student student, Course course) throws DuplicateDataException {
		for(int i = 0; i<course.getReservedStudentCount(); i++) {
			if(course.getReservedStudent(i).equals(student.getStudentId())) throw new DuplicateDataException("Reservation is duplicated");
		}
	}
}
