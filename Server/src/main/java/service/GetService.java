package service;

import java.time.LocalDateTime;

import exception.NullDataException;
import exceptionChecker.ExceptionChecker;
import grpc.AddServiceGrpc.AddServiceBlockingStub;
import grpc.GetServiceGrpc.GetServiceBlockingStub;
import grpc.GetServiceGrpc.GetServiceImplBase;
import grpc.Reservation.CourseList;
import grpc.Reservation.DataInfo;
import grpc.Reservation.Null;
import grpc.Reservation.StudentList;
import grpc.Reservation.UserId;
import io.grpc.stub.StreamObserver;

public class GetService extends GetServiceImplBase{

	private ExceptionChecker exceptionChecker;
	private GetServiceBlockingStub getServiceStub;
	private AddServiceBlockingStub addServiceStub;
	
	public GetService(ExceptionChecker exceptionChecker, GetServiceBlockingStub getServiceStub, AddServiceBlockingStub addServiceStub) {
		this.exceptionChecker = exceptionChecker;
		this.getServiceStub = getServiceStub;
		this.addServiceStub = addServiceStub;
	}

	@Override
	public void getAllStudent(UserId request, StreamObserver<StudentList> responseObserver) {	
		StudentList.Builder studentList = this.getServiceStub.getAllStudent(request).toBuilder();
		try {
			this.exceptionChecker.checkNullData(studentList.build());
			String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
			this.writeLog(request, methodName);
		}catch (NullDataException e) {
			studentList.setException(e.getErrorMessage());
			e.printStackTrace();
		}
		responseObserver.onNext(studentList.build());
		responseObserver.onCompleted();
	}

	@Override
	public void getAllCourse(UserId request, StreamObserver<CourseList> responseObserver) {
		CourseList.Builder courseList = this.getServiceStub.getAllCourse(request).toBuilder();
		try {
			this.exceptionChecker.checkNullData(courseList.build());
			String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
			this.writeLog(request, methodName);
		}catch (NullDataException e) {
			courseList.setException(e.getErrorMessage());
			e.printStackTrace();
		}
		responseObserver.onNext(courseList.build());
		responseObserver.onCompleted();
	}
	
	public void writeLog(UserId request, String methodName) {
		DataInfo.Builder logInfo = DataInfo.newBuilder()
				.setUserId(request.getUserId())
				.setInfo(methodName + " " + LocalDateTime.now().toString());			
		this.addServiceStub.addLog(logInfo.build());
	}
}
