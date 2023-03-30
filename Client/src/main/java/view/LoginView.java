package view;

import java.io.BufferedReader;
import java.io.IOException;
import grpc.LoginServiceGrpc.LoginServiceBlockingStub;
import grpc.Reservation.DataInfo;
import grpc.Reservation.ExceptionMessage;

public class LoginView {
	
	private LoginServiceBlockingStub loginServiceStub;
	private BufferedReader userInputReader;
	private String id;
	
	public LoginView(LoginServiceBlockingStub loginServiceStub, BufferedReader userInputReader) {
		this.loginServiceStub = loginServiceStub;
		this.userInputReader = userInputReader;
		this.id = "";
	}

	public String view() throws IOException {
        while(true) {
			printMenu();
			String userChoice = userInputReader.readLine().trim();
			switch(userChoice) {
				case "1": login(); 
				if(!this.id.isEmpty()) return this.id;
				break;
				case "2" : signUp(); break;
				default: System.err.println("Invalid Choice !!!");
			}
        }
	}

	private void signUp() throws IOException {
		String id = "";
		String password = "";
		String info = "";
		System.out.print("ID: "); id = userInputReader.readLine().trim();
		if(id.contains(" ")||id.isEmpty()) {System.err.println("blank is not allowed"); return;}	
		else info += id + " ";
		System.out.print("Password: "); password = userInputReader.readLine().trim();
		if(password.contains(" ")||password.isEmpty()) {System.err.println("blank is not allowed"); return;}
		else info += password;
		DataInfo dataInfo = DataInfo.newBuilder().setUserId(id).setInfo(info).build();
		ExceptionMessage exceptionMessage = loginServiceStub.signUp(dataInfo);
		if(exceptionMessage.getMessage().isEmpty()) System.out.println("SUCEESS");
		else System.err.println(exceptionMessage.getMessage());	
	}
	private void login() throws IOException {
		String id = "";
		String password = "";
		String info = "";
		System.out.print("ID: "); id = userInputReader.readLine().trim();
		if(id.contains(" ")||id.isEmpty()) {System.err.println("blank is not allowed"); return;}	
		else info += id + " ";
		System.out.print("Password: "); password = userInputReader.readLine().trim();
		if(password.contains(" ")||password.isEmpty()) {System.err.println("blank is not allowed"); return;}
		else info += password;
		DataInfo dataInfo = DataInfo.newBuilder().setUserId(id).setInfo(info).build();
		ExceptionMessage exceptionMessage = loginServiceStub.login(dataInfo);
		if(exceptionMessage.getMessage().isEmpty()) { System.out.println("Hi " + id); this.id = id;}
		else System.err.println(exceptionMessage.getMessage());	
	}
	private void printMenu() {
		System.out.println("******************** Login *********************");
		System.out.println("1. Login");
		System.out.println("2. Sign Up");
	}

}
