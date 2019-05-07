package day20_ForLoops;
import java.util.Scanner;
public class Neighbors {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter word");
		
		String word = scan.next();
		
		//aabcdd . if same neighbors print beeep - a or...
		
		for (int i =0; i<word.length()-1; i++ ) {
			if(word.charAt(i) == word.charAt(i+1)) {
				System.out.println("Beeeep - " +word.charAt(i));
			}
		}
		
		
		
		
		
		
		
	}

}
