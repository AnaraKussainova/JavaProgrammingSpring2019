package day14_string_mehods;
import java.util.Scanner;
public class CharAt {

	public static void main(String[] args) {
		
		String word = "Computer";
		//print all characters one by one
		
		System.out.println(word.length());
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		
		//String word2 and check if first character is j
		
		String word2 = "Semipalatinsk";
		
		if(word2.charAt(0)=='J') {
			System.out.println(word2 + " starts with J");
		}else {
			System.out.println("Try another letter");
		}
		
		
		//String word3 that consists 5 characters
		//Check if first and last characters are same
		//true => "First and last match
		//false=> "First and last are different"
		
		String word3 = "Cybertek";
		
		if(word3.charAt(0)==word3.charAt(word3.length()-1)) {
			System.out.println("First and last are match");
		}else {
			System.out.println("First and last are different");
		}
		
		
		//Second version
		
		char first = word3.charAt(0);
		char last = word3.charAt(7);
		
		if ( first == last) {
			System.out.println("First and last are match");

		}else {
			System.out.println("First and last are different");

		}
		
		System.out.println("###########");
		
		//String word4 =>always print the last character no matter the length
		
		String word4 = "asjhbfdjbvdbv";
		System.out.println(word4.charAt(word4.length() - 1));
		
		//Second version
		
		char lastChar = word4.charAt(word4.length()-1);
		System.out.println("Last char of word " + word4 + " is " + lastChar);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
