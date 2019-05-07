package day23_Array;
import java.util.Scanner;
public class CalculateSum {

	public static void main(String[] args) {

		//program will calculate a sum of 6 numbers, if numbers is less or equals to 0, ignore this . we need to ask user to provide a number
		
		int sum = 0;
		int num = 0;
		Scanner scan = new Scanner(System.in);
		
		for ( int i = 0; i <6; i ++) {
			System.out.println("Enter number");
			num = scan.nextInt();
			if ( num<=0) {
				continue;
			}
			sum +=num;
		}
		
		System.out.println("Total sum: " + sum);
		
		
		///////////program that will take from user 6 words concat words with a comma. If word equals java skip thi sword. Print summary
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
