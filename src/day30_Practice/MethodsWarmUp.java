package day30_Practice;
import java.util.Scanner;
public class MethodsWarmUp {

	public static void main(String[] args) {

		//call print5stars 100 times
		
		for (int i =0; i<=4; i++) {
			print5stars();
		}
		
		/* 
		 * method name : introduce();
		 * params/args: nothing
		 * return type: void
		 * it will ask for a name and say Nice to meet you
		 * 
		 */
		
		introduce();	
	}


	public static void print5stars() {
		System.out.println("*****");
	}
	
	public static void introduce() {
		 Scanner scan = new Scanner (System.in);
		 
		 System.out.println("What is your name?");
		 
		 String name = scan.next();
		 
		 System.out.println("Nice to meet you, " + name);
		
	}
	
	
	
	
	
	
	
	
}


