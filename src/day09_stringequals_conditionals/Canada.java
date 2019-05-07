package day09_stringequals_conditionals;
import java.util.Scanner;
public class Canada {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner ( System.in);
		String capital;
		
		System.out.println("What is the capital of Canada");
		
		capital = scan.nextLine();
		
		 // ( capital.equals("Ottawa")) {         // SENSITIVE CASE
		if (capital.equalsIgnoreCase("Ottawa")) {   //NOT SENSITIVE.will not worry about uppercase or lowercase differences 
			
		System.out.println("Your answer ic correct");	
		}else {
			System.out.println("Your answer is not correct." + " " +capital + " is not capital of Canada.");
		}
		
			
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
