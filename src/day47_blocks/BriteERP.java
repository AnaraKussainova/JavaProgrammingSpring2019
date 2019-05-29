package day47_blocks;

import java.time.LocalDateTime;

public class BriteERP {
	
	static { //automatically 
		System.out.println("Launch Browser");
		System.out.println("Navigate to: "+ TestData.url);
		
		
	}
	public static void enterEmail() {
		System.out.println("Enter email: " + TestData.email);
	}
	public static void enterPessword() {
		System.out.println("Enter password: " + TestData.password);
	}
	public static void verifyLogIn() {
		System.out.println("Expected Name: " + TestData.userName);
		System.out.println("Actual name displayed: " + TestData.userName);
		System.out.println("Login Successful" + LocalDateTime.now());
	}
}
