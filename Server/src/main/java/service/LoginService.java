package service;

import java.time.LocalDateTime;
import java.util.StringTokenizer;
import exception.DuplicateDataException;
import exception.NullDataException;
import exceptionChecker.ExceptionChecker;
import grpc.AddServiceGrpc.AddServiceBlockingStub;
import grpc.GetServiceGrpc.GetServiceBlockingStub;
import grpc.LoginServiceGrpc.LoginServiceImplBase;
import grpc.Reservation.AccountList;
import grpc.Reservation.DataInfo;
import grpc.Reservation.ExceptionMessage;
import grpc.Reservation.Null;
import grpc.Reservation.UserId;
import io.grpc.stub.StreamObserver;

public class LoginService extends LoginServiceImplBase{

	private ExceptionChecker exceptionChecker;
	private GetServiceBlockingStub getServiceStub;
	private AddServiceBlockingStub addServiceStub;
	
	public LoginService(ExceptionChecker exceptionChecker, GetServiceBlockingStub getServiceStub,
			AddServiceBlockingStub addServiceStub) {
		this.exceptionChecker = exceptionChecker;
		this.getServiceStub = getServiceStub;
		this.addServiceStub = addServiceStub;
	}

	@Override
	public void login(DataInfo request, StreamObserver<ExceptionMessage> responseObserver) {
		AccountList.Builder accountList = this.getServiceStub.getAllAccount(UserId.newBuilder().build()).toBuilder();
		ExceptionMessage.Builder exceptionMessage = ExceptionMessage.newBuilder();
		try {
			this.exceptionChecker.checkNullId(accountList.build(), request.getInfo());
			String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
			this.writeLog(request, methodName);
		}catch (NullDataException e) {
			exceptionMessage.setMessage(e.getErrorMessage());
			e.printStackTrace();
		}
		responseObserver.onNext(exceptionMessage.build());
		responseObserver.onCompleted();
	}

	@Override
	public void signUp(DataInfo request, StreamObserver<ExceptionMessage> responseObserver) {
		AccountList.Builder accountList = this.getServiceStub.getAllAccount(UserId.newBuilder().build()).toBuilder();
		ExceptionMessage.Builder exceptionMessage = ExceptionMessage.newBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(request.getInfo());
		String accountId = stringTokenizer.nextToken();
		try {			
			this.exceptionChecker.checkDuplicateId(accountList.build(), accountId);
			this.addServiceStub.addAccount(request);
			String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
			this.writeLog(request, methodName);
		}catch (NullDataException e) {
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
