package day19_loops;
import java.util.Random;
import java.util.Scanner;
public class GuessANumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Random random = new Random();     // is used to generate random numbers
		
		System.out.println("### welcome to guess a number game ###");
		
		int secretNumber=random.nextInt(101);
		
		int guessNumber = 0;
		
		//"Your number is too small";
		
		do {
			System.out.println("Guess a number");
			guessNumber = scan.nextInt();
			
			if(guessNumber < secretNumber) {
				System.out.println("Your number is too small");
			}else if (guessNumber >secretNumber) {
				System.out.println("Your number is too large");
			}
		}while (secretNumber!=guessNumber);
		
		
		System.out.println("Bingo! You won!");
	}

}
