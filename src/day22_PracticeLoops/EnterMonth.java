package day22_PracticeLoops;
import java.util.Scanner;
public class EnterMonth {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int month=0;
		
		do { 
			System.out.println("Enter month: ");
			month = scan.nextInt();
			
		}while (month>0 && month<=12);
			
		
		System.out.println("Invalid number");
		
		
		
		
		
		
	}

}
