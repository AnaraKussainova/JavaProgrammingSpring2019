package day15_string_manipulation;
import java.util.Scanner;
public class Emojis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter emoji");
		String psuedoCode = scan.next();
		
		if(psuedoCode.length()!=2) {
			System.out.println("Invalid emoji");
			return;
		}
		
		if (psuedoCode.charAt(0)==':'){
			if(psuedoCode.charAt(1)==')') {
				System.out.println("Smile");
			}else if (psuedoCode.charAt(1)=='(') {
				System.out.println("Sad");
			}else if (psuedoCode.charAt(1)=='/') {
				System.out.println("Upset");
			}else if (psuedoCode.charAt(1) =='p') {
				System.out.println("Playful");
			}
		}else if (psuedoCode.charAt(0)==';') {
			if(psuedoCode.charAt(1)==')') {
				System.out.println("Wink");
			}else if (psuedoCode.charAt(1)=='O') {
				System.out.println("Surprised");
			}
		}else if(psuedoCode.charAt(0) == '(' && psuedoCode.charAt(1)==':') {
			System.out.println("Smile");
		}else if (psuedoCode.charAt(0) == ')' && psuedoCode.charAt(1)==':') {
			System.out.println("Sad");
		}
			
		
		
		
		
		
		
		
		
		
		
		
	}

}
