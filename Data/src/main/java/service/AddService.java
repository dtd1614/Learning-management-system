package service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import dataManager.AccountManager;
import dataManager.CourseManager;
import dataManager.StudentManager;
import grpc.AddServiceGrpc.AddServiceImplBase;
import grpc.Reservation.DataInfo;
import grpc.Reservation.ExceptionMessage;
import grpc.Reservation.Null;
import io.grpc.stub.StreamObserver;

public class AddService extends AddServiceImplBase{
	
	private StudentManager studentManager;
	private CourseManager courseManager;
	private AccountManager accountManager;
	
	public AddService(StudentManager studentManager, CourseManager courseManager, AccountManager accountManager) {
		this.studentManager = studentManager;
		this.courseManager = courseManager;	
		this.accountManager = accountManager;
	}

	@Override
	public void addStudent(DataInfo request, StreamObserver<ExceptionMessage> responseObserver) {
		this.studentManager.addStudent(request.getInfo());
		responseObserver.onNext(ExceptionMessage.newBuilder().build());
		responseObserver.onCompleted();
	}

	@Override
	public void addCourse(DataInfo request, StreamObserver<ExceptionMessage> responseObserver) {
		this.courseManager.addCourse(request.getInfo());
		responseObserver.onNext(ExceptionMessage.newBuilder().build());
		responseObserver.onCompleted();	
	}

	@Override
	public void makeReservation(DataInfo request, StreamObserver<ExceptionMessage> responseObserver) {
		this.studentManager.makeReservation(request.getInfo());
		this.courseManager.makeReservation(request.getInfo());
		responseObserver.onNext(ExceptionMessage.newBuilder().build());
		responseObserver.onCompleted();	
	}

	@Override
	public void addAccount(DataInfo request, StreamObserver<ExceptionMessage> responseObserver) {
		this.accountManager.addAccount(request.getInfo());
		responseObserver.onNext(ExceptionMessage.newBuilder().build());
		responseObserver.onCompleted();		
	}

	@Override
	public void addLog(DataInfo request, StreamObserver<Null> responseObserver) {
		try {
			BufferedWriter logWriter = new BufferedWriter(new FileWriter(new File("data/log.txt"), true));
			logWriter.newLine();
			logWriter.write(request.getUserId()+" "+request.getInfo());
			logWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		responseObserver.onNext(Null.newBuilder().build());
		responseObserver.onCompleted();		
	}
}
