package day21_Practice;
import java.util.Scanner;
public class wordString {

	public static void main(String[] args) {

		//Given s String word, print out unique characters from the word
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word: ");
		
		String word = scan.next();   //java
		String unique = "";
		
		//for (int i =0; i < word.length(); i++) {
			//System.out.println(i);        print i. It increases every time it loops
			//System.out.println(word.charAt(i));
		
		
		
		for (int i = 0; i <word.length(); i++) {
			//read the letter and assign
			char letter = word.charAt(i);
		//System.out.println(letter);
		if (!unique.contains(""+letter)) {
			unique += letter;   //add to unique
		}
		}
		
		System.out.println(unique);
		
		
		
	}

}
