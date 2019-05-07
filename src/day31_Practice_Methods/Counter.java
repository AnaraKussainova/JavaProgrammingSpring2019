package day31_Practice_Methods;
import java.util.Scanner;
public class Counter {

	public static void main(String[] args) {

		countUp(5);
		countDown(6);

	}
	public static void countUp(int number) {
		
		for (int i =1; i<=number; i++) {
			if(number>1) {
				System.out.print(i + " ");
			}else if (number<1) {
				System.out.println("Invalid input");
			}
		}
	}
	
	public static void countDown(int number) {
		
		System.out.println();
		for (int i = number; i>=1; i--) {
			System.out.print(i + " ");
		}
	}
	
	
}
