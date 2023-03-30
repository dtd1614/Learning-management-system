package service;

import java.time.LocalDateTime;

import exception.NullDataException;
import exceptionChecker.ExceptionChecker;
import grpc.AddServiceGrpc.AddServiceBlockingStub;
import grpc.DeleteServiceGrpc.DeleteServiceBlockingStub;
import grpc.DeleteServiceGrpc.DeleteServiceImplBase;
import grpc.GetServiceGrpc.GetServiceBlockingStub;
import grpc.Reservation.CourseList;
import grpc.Reservation.DataInfo;
import grpc.Reservation.ExceptionMessage;
import grpc.Reservation.Null;
import grpc.Reservation.StudentList;
import grpc.Reservation.UserId;
import io.grpc.stub.StreamObserver;

public class DeleteService extends DeleteServiceImplBase{

	private ExceptionChecker exceptionChecker;
	private GetServiceBlockingStub getServiceStub;
	private DeleteServiceBlockingStub deleteServiceStub;
	private AddServiceBlockingStub addServiceStub;
	
	public DeleteService(ExceptionChecker exceptionChecker, 
			GetServiceBlockingStub getServiceStub, DeleteServiceBlockingStub deleteServiceStub, AddServiceBlockingStub addServiceStub) {
		this.exceptionChecker = exceptionChecker;
		this.getServiceStub = getServiceStub;
		this.deleteServiceStub = deleteServiceStub;
		this.addServiceStub = addServiceStub;
	}
	
	@Override
	public void deleteStudent(DataInfo request, StreamObserver<ExceptionMessage> responseObserver) {
		StudentList studentList = this.getServiceStub.getAllStudent(UserId.newBuilder().build());
		ExceptionMessage.Builder exceptionMessage = ExceptionMessage.newBuilder();
		try {
			this.exceptionChecker.checkNullId(studentList, request.getInfo());
			exceptionMessage = deleteServiceStub.deleteStudent(request).toBuilder();
			String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
			this.writeLog(request, methodName);
		} catch (NullDataException e) {
			exceptionMessage.setMessage(e.getErrorMessage());
			e.printStackTrace();
		}
		responseObserver.onNext(exceptionMessage.build());
		responseObserver.onCompleted();
	}

	@Override
	public void deleteCourse(DataInfo request, StreamObserver<ExceptionMessage> responseObserver) {
		CourseList courseList = this.getServiceStub.getAllCourse(UserId.newBuilder().build());
		ExceptionMessage.Builder exceptionMessage = ExceptionMessage.newBuilder();
		try {
			this.exceptionChecker.checkNullId(courseList, request.getInfo());
			exceptionMessage = deleteServiceStub.deleteCourse(request).toBuilder();
			String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
			this.writeLog(request, methodName);
		} catch (NullDataException e) {
			exceptionMessage.setMessage(e.getErrorMessage());
			e.printStackTrace();
		}
		responseObserver.onNext(exceptionMessage.build());
		responseObserver.onCompleted();
	}

	private void writeLog(DataInfo request, String methodName) {
		DataInfo.Builder logInfo = DataInfo.newBuilder()
				.setUserId(request.getUserId())
				.setInfo(methodName + " " + LocalDateTime.now().toString());			
		this.addServiceStub.addLog(logInfo.build());
	}
}
