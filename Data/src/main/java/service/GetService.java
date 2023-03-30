package service;

import dataManager.AccountManager;
import dataManager.CourseManager;
import dataManager.StudentManager;
import grpc.GetServiceGrpc.GetServiceImplBase;
import grpc.Reservation.AccountList;
import grpc.Reservation.CourseList;
import grpc.Reservation.Null;
import grpc.Reservation.StudentList;
import grpc.Reservation.UserId;
import io.grpc.stub.StreamObserver;

public class GetService extends GetServiceImplBase{

	private StudentManager studentManager;
	private CourseManager courseManager;
	private AccountManager accountManager;
	
	public GetService(StudentManager studentManager, CourseManager courseManager, AccountManager accountManager) {
		this.studentManager = studentManager;
		this.courseManager = courseManager;
		this.accountManager = accountManager;
	}

	@Override
	public void getAllStudent(UserId request, StreamObserver<StudentList> responseObserver) {
		StudentList.Builder studentList = this.studentManager.getStudentList();
		responseObserver.onNext(studentList.build());
        responseObserver.onCompleted();  
	}

	@Override
	public void getAllCourse(UserId request, StreamObserver<CourseList> responseObserver) {
		CourseList.Builder courseList = this.courseManager.getCourseList();
		responseObserver.onNext(courseList.build());
        responseObserver.onCompleted(); 
	}

	@Override
	public void getAllAccount(UserId request, StreamObserver<AccountList> responseObserver) {
		AccountList.Builder accountList = this.accountManager.getAccountList();
		responseObserver.onNext(accountList.build());
        responseObserver.onCompleted(); 	
    }
}
