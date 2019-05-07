package day23_Array;
import java.util.Scanner;
public class PrintWordReport {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String word ="";
		String report="";
		
		for (int j = 0; j <6; j++) {
			System.out.println("Enter word");
			word = scan.next();
			if(word.contentEquals("java")) {
				continue;
			}
			report += word + ", ";
			}
		System.out.println("Report: " + report.substring(0, report.length() - 2));
		
	


		System.out.println("+++++++++++++++++++++++++");
		
		
		
		
		 String expectedUserName = "admin";
	        String expectedPassword = "admin123";
	        String username = "";
	        String password = "";
	        int attempts = 5;
	        do {
	            if(attempts == 0) {
	                System.out.println("You have exceeded number ot attampts");
	                System.out.println("This user has bee deactivated for 30 minutes");
	                return;
	            }
	            attempts--;
	            System.out.println("Please enter user name");
	            username = scan.next();
	            if(!username.equals(expectedUserName)) {
	                System.out.println("Wrong user name");
	                System.out.println("Attempts left: "+attempts);
	                continue;
	            }
	            System.out.println("Please enter password");
	            password = scan.next();
	            if(!password.equals(expectedPassword)) {
	                System.out.println("Wrong password");
	                System.out.println("Attempts left: "+attempts);
	                continue;
	            }
	        }while(!username.equals(expectedUserName) || !password.equals(expectedPassword));
	        
	        System.out.println("Login successful!");
	        
	        
	

	        
	        
	}
}