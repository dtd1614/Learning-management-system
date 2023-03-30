package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import grpc.AddServiceGrpc;
import grpc.DeleteServiceGrpc;
import grpc.GetServiceGrpc;
import grpc.LoginServiceGrpc;
import grpc.AddServiceGrpc.AddServiceBlockingStub;
import grpc.DeleteServiceGrpc.DeleteServiceBlockingStub;
import grpc.GetServiceGrpc.GetServiceBlockingStub;
import grpc.LoginServiceGrpc.LoginServiceBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import view.LoginView;
import view.MenuSelectView;

public class Main {

	public static void main(String[] args) throws IOException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8081).usePlaintext().build();
        GetServiceBlockingStub getServiceStub = GetServiceGrpc.newBlockingStub(channel);
        AddServiceBlockingStub addServicestub = AddServiceGrpc.newBlockingStub(channel);
        DeleteServiceBlockingStub deleteServiceStub = DeleteServiceGrpc.newBlockingStub(channel);
        LoginServiceBlockingStub loginServiceStub = LoginServiceGrpc.newBlockingStub(channel);
		BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));	
		
		LoginView loginView = new LoginView(loginServiceStub, userInputReader);
		String userId = loginView.view();
		MenuSelectView menuSelectView = new MenuSelectView(userId, getServiceStub,addServicestub,deleteServiceStub,userInputReader);
		menuSelectView.view();
		channel.shutdown();
	}

}
