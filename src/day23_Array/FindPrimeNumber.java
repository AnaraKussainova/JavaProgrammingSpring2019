package day23_Array;
import java.util.Scanner;
public class FindPrimeNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();

		
		for (int i=2; i<=num; i++) {

		if (num%1 == 0) {
			System.out.println(num + " its not a prime number");
			return;
		}
		}
		
		System.out.println(num +"Its a prime");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
