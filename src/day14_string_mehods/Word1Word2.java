package day14_string_mehods;
import java.util.Scanner;
public class Word1Word2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//enter two words via scanner
		//compare their length

		String word1, word2;
		
		System.out.println("Enter word1 and word2");
		word1 = scan.next();
		word2 = scan.next();
		
		if(word1.length() >word2.length()) {
			System.out.println(word1 + " is longer");
		}else if (word1.length()<word2.length()) {
			System.out.println(word2 + " is longer");
		}else  {
			System.out.println(word1 + " and " + word2 + " are the same length.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
