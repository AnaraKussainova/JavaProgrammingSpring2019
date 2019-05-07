package day19_loops;
import java.util.Scanner;
public class Palindrom {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter word:");
		String word = scan.next();
		String reversed = "";
		// loop through word in reverse order and
		//concetanate each character to reversed string
		
			 int idx= word.length()-1;
		
			 while (idx >=0) {
				 reversed = reversed + word.charAt(idx);
				 idx--;
			 }
			
		//compare if word and reversed are equal
		
		if(word.equals(reversed)) {
			System.out.println("Palindrom");
		}else {
			System.out.println("Not a palindrom");
		}
		
		
		
		
		
		
		
		
	}

}
