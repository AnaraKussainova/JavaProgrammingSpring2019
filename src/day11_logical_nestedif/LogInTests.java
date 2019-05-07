package day11_logical_nestedif;
import java.util.Scanner;
public class LogInTests {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter usernmae");
		String username = scan.next();
		
		System.out.println("Enter password");
		String password = scan.next();
		
		String validUsername = "cybertek@mail.com";
		String validPassword = "WoodenSpoon123";
		
		/*Conditions:
		1. username = validUserName;
		password = password;
		print "Log in Successful"
		
		2. username !=  validUSernmale
		password != password
		print "Invalid Username and Invalid Password"	
		
		3. username ==validUsername;
		password != password;
		print "Invalid Password"
		
		4. username !=validUsername;
		password =password
		print "Invalid Username
		
		*/		
		
		if (username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
			
			System.out.println("Log in Successful");
		} else if (!username.equals(validUsername) && !password.equals(validPassword)) {
			System.out.println("Invalid Username and Invalid Password");
		} else if (username.equalsIgnoreCase(validUsername) && !password.equals(validPassword)){
			System.out.println("Invalid Password");
		} else if (!username.contentEquals(validUsername) && password.contentEquals(validPassword)) {
			System.out.println("Invalid Username");
		}
		
	/////////////////////////////////////////////////////////////////	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
