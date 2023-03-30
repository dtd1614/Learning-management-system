package main;
 
import java.io.FileNotFoundException;
import java.io.IOException;
import dataManager.AccountManager;
import dataManager.CourseManager;
import dataManager.StudentManager;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.AddService;
import service.DeleteService;
import service.GetService;

public class Main {
		
	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException{
		StudentManager studentManager = new StudentManager("data/Students.txt");
		CourseManager courseManager = new CourseManager("data/Courses.txt");
		AccountManager accountManager = new AccountManager("data/Accounts.txt");
		
        Server server = ServerBuilder.forPort(8080)
        		.addService(new AddService(studentManager, courseManager, accountManager))
        		.addService(new DeleteService(studentManager, courseManager))
        		.addService(new GetService(studentManager, courseManager, accountManager))
        		.build();
		server.start();
        System.out.println("data is ready!!");
        System.out.println("port : 8080");
		server.awaitTermination();
	}	
}