package day14_string_mehods;
import java.util.Scanner;

public class StringSize {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = "Good Morning";
		//check if its matches"Good Morning"
		//or not match
		
		//check if it matches "Good morning and print match
		//or not match
		
		if(str1.contentEquals("Good Morning")) {
			System.out.println("Match");
		}else {
			System.out.println("Not Mtch");
		}
	
		if(str1.equalsIgnoreCase("good morning")){
				System.out.println("Match - ignore case");
		}else {
			System.out.println("Not Match - ignore case");
		} 
		
		
		//Convert to all upper case
		System.out.println(str1.toUpperCase());
		
		System.out.println(str1);   // it stays as old value 
		
		str1 = str1.toUpperCase();
		System.out.println("After assignment - " + str1);
		
		//combine the above methods together
		//convert to all lower case first then check if it equals "good morning"
				
		if(str1.toLowerCase().equals("good morning")) {
			System.out.println("Chained methods: match");
		}else {
			System.out.println("Chained methods: do not match");
		}
		
		//find how many characters in the string
		
		String myName = "Anara";
		System.out.println(myName.length());
		
		int length = myName.length();
		System.out.println("My names length: " + length);
		
		//String username must be  8 characters
		String userName = "anra56789";
		
		if(userName.length() >=8) {
			System.out.println("Valid username");
		}else {
			System.out.println("Invalid");
		}
		//String password at least 6
		String password = "12345679";
		if(password.length() >= 6) {
			System.out.println("Good password");
		}else {
			System.out.println("Invalid");
		}
		
		
		
		
		
		
		
		
	}

}
