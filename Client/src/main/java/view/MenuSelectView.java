package view;

import java.io.BufferedReader;
import java.io.IOException;

import grpc.AddServiceGrpc.AddServiceBlockingStub;
import grpc.DeleteServiceGrpc.DeleteServiceBlockingStub;
import grpc.GetServiceGrpc.GetServiceBlockingStub;
import grpc.Reservation.Course;
import grpc.Reservation.CourseList;
import grpc.Reservation.DataInfo;
import grpc.Reservation.ExceptionMessage;
import grpc.Reservation.Null;
import grpc.Reservation.Student;
import grpc.Reservation.StudentList;
import grpc.Reservation.UserId;

public class MenuSelectView {

	private GetServiceBlockingStub getServiceStub;
	private AddServiceBlockingStub addServicestub;
	private DeleteServiceBlockingStub deleteServicestub;
	private BufferedReader userInputReader;
	private String userId;
	
	public MenuSelectView(String userId, GetServiceBlockingStub getServiceStub, AddServiceBlockingStub addServicestub, 
			DeleteServiceBlockingStub deleteServicestub, BufferedReader userInputReader) {
		this.getServiceStub = getServiceStub;
		this.addServicestub = addServicestub;
		this.deleteServicestub = deleteServicestub;
		this.userInputReader = userInputReader;
		this.userId = userId;
	}
	
	public void view() throws IOException {
        while(true) {
			printMenu();
			String userChoice = userInputReader.readLine().trim();
			switch(userChoice) {
				case "1": printAllStudent(); break;
				case "2" : printAllCourse(); break;
				case "3" : addStudent(); break;
				case "4" : deleteStudent(); break;
				case "5" : addCourse(); break;
				case "6" : deleteCourse(); break;
				case "7" : makeReservation(); break;
				case "x" : userInputReader.close(); return;
				default: System.err.println("Invalid Choice !!!");
			}
        }
	}
	
	public void makeReservation() throws IOException {
		String reservationInfo = "";
		String input = "";
		System.out.print("Student ID: "); input = userInputReader.readLine().trim();
		if(input.contains(" ")||input.isEmpty()) {System.err.println("blank is not allowed"); return;}
		else{reservationInfo += input + " ";}
		System.out.print("Course ID: "); input = userInputReader.readLine().trim();
		if(input.contains(" ")||input.isEmpty()) {System.err.println("blank is not allowed"); return;}
		else{reservationInfo += input;}
		DataInfo dataInfo = DataInfo.newBuilder().setUserId(this.userId).setInfo(reservationInfo).build();
		ExceptionMessage exceptionMessage = addServicestub.makeReservation(dataInfo);
		if(exceptionMessage.getMessage().isEmpty()) System.out.println("SUCEESS");
		else System.err.println(exceptionMessage.getMessage());	
	}

	public void addStudent() throws IOException {
		String studentInfo = "";
		String input = "";
		System.out.println("-----------Student Information----------");
		System.out.print("Student ID: "); input = userInputReader.readLine().trim();
		if(input.contains(" ")||input.isEmpty()) {System.err.println("blank is not allowed"); return;}
		else{studentInfo += input+" ";}		
		System.out.print("Student Last Name: "); input = userInputReader.readLine().trim();
		if(input.contains(" ")||input.isEmpty()) {System.err.println("blank is not allowed"); return;}
		else{studentInfo += input+" ";}	
		System.out.print("Student First Name: "); input = userInputReader.readLine().trim();
		if(input.contains(" ")||input.isEmpty()) {System.err.println("blank is not allowed"); return;}
		else{studentInfo += input+" ";}	
		System.out.print("Student Department: "); input = userInputReader.readLine().trim();
		if(input.contains(" ")||input.isEmpty()) {System.err.println("blank is not allowed"); return;}
		else{studentInfo += input+" ";}	
		System.out.println("**** Put Spacebar Between Courses ****");
		System.out.println("**** If you dont have any completed course, just press enter ****");
		System.out.print("Student Completed Courses: "); studentInfo += userInputReader.readLine().trim();
		DataInfo dataInfo = DataInfo.newBuilder().setUserId(this.userId).setInfo(studentInfo).build();
		ExceptionMessage exceptionMessage = addServicestub.addStudent(dataInfo);
		if(exceptionMessage.getMessage().isEmpty()) System.out.println("SUCEESS");
		else System.err.println(exceptionMessage.getMessage());	
	}
	
	public void deleteStudent() throws IOException {
		System.out.print("Student ID: "); String input = userInputReader.readLine().trim();
		if(input.contains(" ")||input.isEmpty()) {System.err.println("blank is not allowed"); return;}	
		DataInfo dataInfo = DataInfo.newBuilder().setUserId(this.userId).setInfo(input).build();
		ExceptionMessage exceptionMessage = deleteServicestub.deleteStudent(dataInfo);
		if(exceptionMessage.getMessage().isEmpty()) System.out.println("SUCEESS");
		else System.err.println(exceptionMessage.getMessage());	
	}
	
	public void addCourse() throws IOException {
		String courseInfo = "";
		String input = "";
		System.out.println("-----------Course Information----------");
		System.out.print("Course ID: "); input = userInputReader.readLine().trim();
		if(input.contains(" ")||input.isEmpty()) {System.err.println("blank is not allowed"); return;}
		else{courseInfo += input+" ";}
		System.out.print("Course Professor Name: "); input = userInputReader.readLine().trim();
		if(input.contains(" ")||input.isEmpty()) {System.err.println("blank is not allowed"); return;}
		else{courseInfo += input+" ";}
		System.out.print("Course Name: "); input = userInputReader.readLine().trim();
		if(input.contains(" ")||input.isEmpty()) {System.err.println("blank is not allowed"); return;}
		else{courseInfo += input+" ";}
		System.out.println("**** Put Spacebar Between Prerequisites ****");
		System.out.println("**** If you dont have any prerequisite, just press enter ****");
		System.out.print("Course Prerequisites: "); courseInfo += userInputReader.readLine().trim();	
		DataInfo dataInfo = DataInfo.newBuilder().setUserId(this.userId).setInfo(courseInfo).build();
		ExceptionMessage exceptionMessage = addServicestub.addCourse(dataInfo);
		if(exceptionMessage.getMessage().isEmpty()) System.out.println("SUCEESS");
		else System.err.println(exceptionMessage.getMessage());	
	}
	
	public void deleteCourse() throws IOException {
		System.out.print("Course ID: ");String input = userInputReader.readLine().trim();
		if(input.contains(" ")||input.isEmpty()) {System.err.println("blank is not allowed"); return;}
		DataInfo dataInfo = DataInfo.newBuilder().setUserId(this.userId).setInfo(input).build();
		ExceptionMessage exceptionMessage = deleteServicestub.deleteCourse(dataInfo);
		if(exceptionMessage.getMessage().isEmpty()) System.out.println("SUCEESS");
		else System.err.println(exceptionMessage.getMessage());	
	}

	public void printAllStudent() {
		StudentList studentList = getServiceStub.getAllStudent(UserId.newBuilder().setUserId(this.userId).build());
		if(!studentList.getException().isEmpty()) {
			System.err.println(studentList.getException()); 
			return;
		}
		System.out.println("******************** STUDENT LIST *********************");
		for(int i = 0; i<studentList.getStudentList().size(); i++) {
			Student student = studentList.getStudent(i);
		    System.out.print(student.getStudentId() + " ");
		    System.out.print(student.getName() + " ");
		    System.out.print(student.getDepartment() + " ");
		    for(int j = 0; j<student.getCompletedCourseList().size(); j++) {
		        System.out.print(student.getCompletedCourse(j) + " ");
		    }
		    System.out.print("\n");
		    System.out.print("Reserved Courses : ");
		    for(int j = 0; j<student.getReservedCourseList().size(); j++) {
		        System.out.print(student.getReservedCourse(j) + " ");
		    }
		    System.out.print("\n\n");
		}		
	}
	
	public void printAllCourse() {
		CourseList courseList = getServiceStub.getAllCourse(UserId.newBuilder().setUserId(this.userId).build());
		if(!courseList.getException().isEmpty()) {
			System.err.println(courseList.getException()); 
			return;
		}
		System.out.println("******************** COURSE LIST *********************");
		for(int i = 0; i<courseList.getCourseList().size(); i++) {		
			Course course = courseList.getCourse(i);
		    System.out.print(course.getCourseId() + " ");
		    System.out.print(course.getProfessorName() + " ");
		    System.out.print(course.getCourseName() + " ");
		    for(int j = 0; j<course.getPrerequisiteList().size(); j++) {
		        System.out.print(course.getPrerequisite(j) + " ");
		    }
		    System.out.print("\n");
		    System.out.print("Reserved Students : ");
		    for(int j = 0; j<course.getReservedStudentList().size(); j++) {
		        System.out.print(course.getReservedStudent(j) + " ");
		    }
		    System.out.print("\n\n");
		}
	}

	public void printMenu() {
		System.out.println("******************** MENU *********************");
		System.out.println("1. List Students");
		System.out.println("2. List Courses");
		System.out.println("3. Add Student");
		System.out.println("4. Delete Student");
		System.out.println("5. Add Course");
		System.out.println("6. Delete Course");
		System.out.println("7. Make Reservation");
		System.out.println("x. Exit");
	}
}
