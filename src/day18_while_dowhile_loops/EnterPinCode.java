package day18_while_dowhile_loops;
import java.util.Scanner;
public class EnterPinCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int secretPinCode =4321;
		
		//give only 3 attempts
		// if attempts reaches more than 3 print card blocked
		
		int pinCode=0;
		int attempts = 0;
		
		while (pinCode!=secretPinCode && attempts <=3) {
			System.out.println("Enter pin code:");
			pinCode=scan.nextInt();
			attempts++;	
			
			if (attempts==3 && pinCode != secretPinCode) {
				System.out.println("card is blocked");
				return;
			}
		}
		
		System.out.println("Access completed successfully!");
	}

}
	


		