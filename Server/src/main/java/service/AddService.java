package service;

import java.time.LocalDateTime;
import java.util.StringTokenizer;
import exception.DuplicateDataException;
import exception.NullDataException;
import exceptionChecker.ExceptionChecker;
import grpc.AddServiceGrpc.AddServiceBlockingStub;
import grpc.AddServiceGrpc.AddServiceImplBase;
import grpc.GetServiceGrpc.GetServiceBlockingStub;
import grpc.Reservation.CourseList;
import grpc.Reservation.DataInfo;
import grpc.Reservation.ExceptionMessage;
import grpc.Reservation.Null;
import grpc.Reservation.StudentList;
import grpc.Reservation.UserId;
import io.grpc.stub.StreamObserver;

public class AddService extends AddServiceImplBase{
	
	private ExceptionChecker exceptionChecker;
	private GetServiceBlockingStub getServiceStub;
	private AddServiceBlockingStub addServiceStub;
	
	public AddService(ExceptionChecker exceptionChecker, GetServiceBlockingStub getServiceStub, 
			AddServiceBlockingStub addServiceStub) {
		this.exceptionChecker = exceptionChecker;
		this.getServiceStub = getServiceStub;
		this.addServiceStub = addServiceStub;
	}

	@Override
	public void addStudent(DataInfo request, StreamObserver<ExceptionMessage> responseObserver) {
		StudentList studentList = this.getServiceStub.getAllStudent(UserId.newBuilder().build());
		ExceptionMessage.Builder exceptionMessage = ExceptionMessage.newBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(request.getInfo());
		String studentId = stringTokenizer.nextToken();
		try {
			this.exceptionChecker.checkDuplicateId(studentList, studentId);
			exceptionMessage = this.addServiceStub.addStudent(request).toBuilder();
			String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
			this.writeLog(request, methodName);		
		} catch (DuplicateDataException e) {
			exceptionMessage.setMessage(e.getErrorMessage());
			e.printStackTrace();			
		} catch (NullDataException e) {
			exceptionMessage.setMessage(e.getErrorMessage());
			e.printStackTrace();
		}
		responseObserver.onNext(exceptionMessage.build());
		responseObserver.onCompleted();
	}

	@Override
	public void addCourse(DataInfo request, StreamObserver<ExceptionMessage> responseObserver) {
		CourseList courseList = this.getServiceStub.getAllCourse(UserId.newBuilder().build());
		ExceptionMessage.Builder exceptionMessage = ExceptionMessage.newBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(request.getInfo());
		String courseId = stringTokenizer.nextToken();
		try {
			this.exceptionChecker.checkDuplicateId(courseList, courseId);
			exceptionMessage = this.addServiceStub.addCourse(request).toBuilder();
			String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
			this.writeLog(request, methodName);
		} catch (DuplicateDataException e) {
			exceptionMessage.setMessage(e.getErrorMessage());
			e.printStackTrace();			
		} catch (NullDataException e) {
			exceptionMessage.setMessage(e.getErrorMessage());
			e.printStackTrace();
		}
		responseObserver.onNext(exceptionMessage.build());
		responseObserver.onCompleted();	
	}

	@Override
	public void makeReservation(DataInfo request, StreamObserver<ExceptionMessage> responseObserver) {
		ExceptionMessage.Builder exceptionMessage = ExceptionMessage.newBuilder();
		try {
			StudentList studentList = this.getServiceStub.getAllStudent(UserId.newBuilder().build());
			CourseList courseList = this.getServiceStub.getAllCourse(UserId.newBuilder().build());			
	        StringTokenizer stringTokenizer = new StringTokenizer(request.getInfo());
	        String studentId = stringTokenizer.nextToken();
			String courseId = stringTokenizer.nextToken();			
			this.exceptionChecker.checkReservation(studentList, courseList, studentId, courseId);
			exceptionMessage = this.addServiceStub.makeReservation(request).toBuilder();
			String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
			this.writeLog(request, methodName);
		} catch (NullDataException e) {
			exceptionMessage.setMessage(e.getErrorMessage());
			e.printStackTrace();
		} catch (DuplicateDataException e) {
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
