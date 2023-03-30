package main;

import java.io.IOException;
import exceptionChecker.ExceptionChecker;
import grpc.AddServiceGrpc;
import grpc.AddServiceGrpc.AddServiceBlockingStub;
import grpc.DeleteServiceGrpc;
import grpc.DeleteServiceGrpc.DeleteServiceBlockingStub;
import grpc.GetServiceGrpc;
import grpc.GetServiceGrpc.GetServiceBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.AddService;
import service.DeleteService;
import service.GetService;
import service.LoginService;

public class Main {
	
	public static void main(String[] args) {	
		try {
	        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();
	        
			AddServiceBlockingStub addServiceStub = AddServiceGrpc.newBlockingStub(channel);
			DeleteServiceBlockingStub deleteServiceStub = DeleteServiceGrpc.newBlockingStub(channel);
			GetServiceBlockingStub getServiceStub = GetServiceGrpc.newBlockingStub(channel);
			
			ExceptionChecker exceptionChecker = new ExceptionChecker();
			
	        Server server = ServerBuilder.forPort(8081)
	        		.addService(new AddService(exceptionChecker, getServiceStub, addServiceStub))
	        		.addService(new DeleteService(exceptionChecker, getServiceStub, deleteServiceStub, addServiceStub))
	        		.addService(new GetService(exceptionChecker, getServiceStub, addServiceStub))
	        		.addService(new LoginService(exceptionChecker, getServiceStub, addServiceStub))
	        		.build();
	        		
			server.start();
			System.out.println("server is ready!!");
			System.out.println("port : 8081");
			server.awaitTermination(); 
		} catch (InterruptedException e) {e.printStackTrace();
		} catch (IOException e) {e.printStackTrace();}
	}
}
