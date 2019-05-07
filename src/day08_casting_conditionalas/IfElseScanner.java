package day08_casting_conditionalas;
import java.util.Scanner;
public class IfElseScanner {

	public static void main(String[] args) {

		//passingPercentage = 65;
		//yourScorePercentge = take from scanner
		//check if you passed or failed
		int passingPercentage = 65;
		Scanner scan = new Scanner ( System.in);
		
		System.out.println("Enter your Score: ");
		
		int yourScorePrecentage = scan.nextInt();
		
		if (yourScorePrecentage>=passingPercentage) {
			System.out.println("YOU PASSED! Congratulations");
		}else {
			System.out.println("Try again");
			
		}
		System.out.println("Java is fun!!!");
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
