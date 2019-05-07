package day11_logical_nestedif;
import java.util.Scanner;
public class TollCalculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter Vehicle Type");
		
		int carType = scan.nextInt();
		System.out.println("Is it rush hour: yes | no");
		
		String rushHour = scan.next();
		
		// check if rushHour string "yes" , assign true to isRushHour
		// if it is "no" , assign false to isRushHour
		
		boolean isRushHour;
		
		if (rushHour.equalsIgnoreCase("yes")) {
			isRushHour = true;
		}else {
			isRushHour = false;
		}
		
	//	System.out.println(isRushHour);
		
		double price = 0;
		
		if ( carType == 1) {
			if (isRushHour) {
				price = 30.0;
			} else {
				price = 5.0;
			}
		} else if (carType ==2) {
			if (isRushHour) {
				price = 40.0 ;
			} else {
				price = 7.0 ;
			}
		}
		
		System.out.println("Toll cost: " + price);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//////////////////////////////////////////////////////////////////	
		/* carType:1, 2
		is RushHours" true or no
		
		in this example we will use logical operator. And nested if statements
		*/
		                                                  
	/*	if (condition1) {                            //condition1 =true
			if (condition2) {                          // condition2 = true
				//code A
			}else {                                    //code A
				// code B
			}else {
				// code C
			}
		}
		*/
		
		
		
		
		
		
		
		
		
	}

}
