package day12_switch_ternary;
import java.util.Scanner;
public class DaySelector {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int day;
	
	System.out.println("Enter a day: ");
		day = scan.nextInt();
		
		switch (day) {
		case 1:
			System.out.println ("Monday");
		break;
		
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Satuarday");
			break;
		case 7 :
			System.out.println("Sunday");
		
		default:
			System.out.println("Error");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
