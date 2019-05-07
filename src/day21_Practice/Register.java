package day21_Practice;
import java.util.Scanner;
public class Register {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many items are you purchasing?");
		
		int itemCount = scan.nextInt();
		
		String items="";
		double totalPrice=0.0;
		
		for (int count =1; count <=itemCount; count++) {
			System.out.println("What is item " + count + "?");
			String itemName=scan.next();
			System.out.println("What is price for  " + count);
			double itemPrice = scan.nextDouble();
			items += itemName + ", ";
			totalPrice+=itemPrice;
		}
	
		System.out.println("Your items: " + items );
		System.out.println("Your total price is " + totalPrice);
		
		
		
		
	}

}
