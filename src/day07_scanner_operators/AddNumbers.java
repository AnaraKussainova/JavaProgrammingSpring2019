package day07_scanner_operators;
import java.util.Scanner;

public class AddNumbers {
	public static void main ( String[]args) {
		
		int num1, num2, num3, sum;
		
		Scanner scan = new Scanner(System.in);
				
		
		System.out.println ( "Enter 3 numbers: ");
	    num1 = scan.nextInt();
	    num2 = scan.nextInt();
	    num3 = scan.nextInt();
	    
		
	    sum = num1 + num2 + num3;
	    
	    System.out.println  ( "Sum of numers: " + sum);
	
	
	////// SHOPPING LIST
	    
	    Scanner keyboard = new Scanner(System.in);
	    
	    String item1, item2, item3, report;
	    
	    double price1, price2, price3, totalPrice;
	    
	    System.out.println("Enter item1 and its price:");
	    
	    item1 = keyboard.next();
	    price1 = keyboard.nextDouble();
	    
	    System.out.println("Enter item2 and its price:");
	    
	    item2 = keyboard.next();
	    price2 = keyboard.nextDouble();
	    
	    System.out.println("Enter item3 and its price:");
	    
	    item3 = keyboard.next();
	    price3 = keyboard.nextDouble();
	    
	    totalPrice = price1 + price2 + price3;
	    
	    report =("Item1: " +item1 + " Price:" + price1 + ", Item2: " + item2 + " Price: " + price2 + ", Item3: " + item3 + " Price: "+ price3);
	    
	    System.out.println(report);
	
	    System.out.println("Total price: " + totalPrice);
	
	
	}
}

