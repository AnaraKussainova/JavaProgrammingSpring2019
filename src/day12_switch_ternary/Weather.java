package day12_switch_ternary;
import java.util.Scanner;
public class Weather {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String weather;
		
		System.out.println("What is weather outside: ");
		
		weather = scan.next().toLowerCase();
		
		switch (weather) {
		
		case "sunny":
			System.out.println("Go to park. \n Code Java");
			break;
		case "hot":
			System.out.println("Go swimming. Code Java");
			break;
		case "rainy":
			System.out.println("Take umbrella. Code Java");
			break;
		case "windy":
			System.out.println("Go sailing. Code Java");
			break;
		case "snow":
			System.out.println("Go skiing. Code Java");
			break;
			
		default: 
			System.out.println("Code Java in any other weather");
			
		}
		
		System.out.println("###END OF PROGRAM###");
	
		System.out.println();
	/////////////////////////////////////////////////////////////	
		
		
		char grade = 'B';
		
		switch (grade) {
		
		case 'A':
		case 'B':
		case 'C':
			System.out.println("pass");
			break;
			
		case 'D':
		case 'E':
			System.out.println("fail");
			break;
			
		default:
			System.out.println("invalid");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
