package day19_loops;
import java.util.Scanner;
public class Transactions {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double balance= 0;
		double transaction =0;
		int count = 0;
		
		System.out.println("What is your current balance amount?");
		balance = scan.nextDouble();
	
		while (balance >0) {
			count  ++;
			System.out.println("What is amount of transaction #" + count);
			transaction = scan.nextDouble();
			balance = balance - transaction;
			System.out.println("Remaining balance: " + balance);

			if (transaction > balance ) {
				System.out.println("Warning! Your balance is about to be negative");
			}
		}
		
		System.out.println("You have insufficient fund. Your balance is " + balance);
		
		System.out.println("Transactions total count: "+ count);
		
		/////////////////////////
		int inhabitants=0;
		 int day = 0;
		    
		    while (inhabitants >0){
		      day ++;
		          inhabitants = scan.nextInt();

		      System.out.println ("Day " + day + "[" + inhabitants + "]");
		      inhabitants = inhabitants / 2;
		    }
		    
		    System.out.println ("--- EXTINCT ----");
		
		
	}

}
