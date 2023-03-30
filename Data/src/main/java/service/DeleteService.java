package service;

import dataManager.CourseManager;
import dataManager.StudentManager;
import grpc.DeleteServiceGrpc.DeleteServiceImplBase;
import grpc.Reservation.DataInfo;
import grpc.Reservation.ExceptionMessage;
import io.grpc.stub.StreamObserver;

public class DeleteService extends DeleteServiceImplBase{

	private StudentManager studentManager;
	private CourseManager courseManager;
	
	public DeleteService(StudentManager studentManager, CourseManager courseManager) {
		this.studentManager = studentManager;
		this.courseManager = courseManager;
	}
	@Override
	public void deleteStudent(DataInfo request, StreamObserver<ExceptionMessage> responseObserver) {
		this.studentManager.deleteStudent(request.getInfo());
		responseObserver.onNext(ExceptionMessage.newBuilder().build());
		responseObserver.onCompleted();	
	}

	@Override
	public void deleteCourse(DataInfo request, StreamObserver<ExceptionMessage> responseObserver) {
		this.courseManager.deleteCourse(request.getInfo());
		responseObserver.onNext(ExceptionMessage.newBuilder().build());	
		responseObserver.onCompleted();	
	}
	
}
