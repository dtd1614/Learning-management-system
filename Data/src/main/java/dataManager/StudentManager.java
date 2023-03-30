package dataManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import grpc.Reservation.Student;
import grpc.Reservation.StudentList;

public class StudentManager {
	
	private StudentList.Builder studentList;
	
	public StudentManager(String fileName) throws IOException {
		this.studentList = StudentList.newBuilder();
		BufferedReader objStudentFile = new BufferedReader(new FileReader(fileName));
		while (objStudentFile.ready()) {
			String stuInfo = objStudentFile.readLine();
			if (!stuInfo.equals("")) this.studentList.addStudent(this.setStudent(stuInfo));
		}
		this.studentList.setException("");
		objStudentFile.close();
	}
	
	public Student.Builder setStudent(String inputString) {
		Student.Builder student = Student.newBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(inputString);
    	student.setStudentId(stringTokenizer.nextToken())
    	.setName(stringTokenizer.nextToken() + " " + stringTokenizer.nextToken())
    	.setDepartment(stringTokenizer.nextToken());
    	while (stringTokenizer.hasMoreTokens()) student.addCompletedCourse(stringTokenizer.nextToken());
    	return student;
	}
	
	public StudentList.Builder getStudentList() {
		return this.studentList;
	}
	
	public void addStudent(String studentInfo){
		this.studentList.addStudent(this.setStudent(studentInfo));
	}
	
	public void deleteStudent(String studentId){
		for (int i = 0; i < this.studentList.getStudentCount(); i++) {
			Student.Builder student = this.studentList.getStudentBuilder(i);
			if (student.getStudentId().equals(studentId)) {
				this.studentList.removeStudent(i); return;
			}
		}
	}
	
	public void makeReservation(String reservationInfo) {
        StringTokenizer stringTokenizer = new StringTokenizer(reservationInfo);
		String studentId = stringTokenizer.nextToken();
		String courseId = stringTokenizer.nextToken();
		for (int i = 0; i < this.studentList.getStudentCount(); i++) {
			Student.Builder student = this.studentList.getStudentBuilder(i);
			if (student.getStudentId().equals(studentId)) {
				student.addReservedCourse(courseId); return;
			}
		}
	}
}
