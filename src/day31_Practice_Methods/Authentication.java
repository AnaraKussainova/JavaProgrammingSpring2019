package day31_Practice_Methods;
import java.util.Scanner;
public class Authentication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter username and password");
		String username = scan.next();
		String password = scan.next();
		
		login(username, password);
	}
	
	public static void login(String username, String password) {

		if ( username.equals("mentoring@cbtschool.com") && password.contentEquals("mentor001")) {
			System.out.println("Login successfull");
		}else {
			System.out.println("Invalid");
		}
	}
}
