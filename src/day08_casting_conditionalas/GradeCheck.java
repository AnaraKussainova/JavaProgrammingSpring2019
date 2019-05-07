package day08_casting_conditionalas;
import java.util.Scanner;
public class GradeCheck {

	public static void main(String[] args) {
		System.out.println(" ### Start Programm###");
		Scanner keyboard = new Scanner ( System.in);
		System.out.println(" What is your grade?");
		char grade = keyboard.next().charAt(0);
		
		if (grade == 'A') {
			System.out.println("Excelent job!");
		}else {
			System.out.println("How many points did you miss for 'A'?");
			int points = keyboard.nextInt();
			System.out.println(" You could earn " + points +  " more points if you studied harder");
		}
		
		
		System.out.println("End of Programm");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
