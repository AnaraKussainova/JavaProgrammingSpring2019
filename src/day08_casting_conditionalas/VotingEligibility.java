package day08_casting_conditionalas;
import java.util.Scanner;
public class VotingEligibility {

	public static void main(String[] args) {
		int votingAge = 18;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		
		int yourAge = scan.nextInt();
		
		if (yourAge >=votingAge) {
			
			System.out.println("You are eligible to vote. \nYou have been eligible for \" + (yourAge - votingAge) + \" years");
			//System.out.println("You have been eligible for " + (yourAge - votingAge) + " years");
			
		} else { 
			System.out.println("You are not eligible to vote.");
			System.out.println("You still have " + (votingAge - yourAge) + " more years to wait");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
