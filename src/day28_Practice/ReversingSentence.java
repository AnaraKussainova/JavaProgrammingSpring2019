package day28_Practice;

import java.util.Arrays;

public class ReversingSentence {

	public static void main(String[] args) {


		String sentence = "I like working out";
		
		//print words in String
			
		String [] str = sentence.split(" ");

		
		System.out.println(str.length);
		
		System.out.println(Arrays.toString(str));
		String reversed = "";
		
		for ( int i =str.length-1; i>=0 ;i--) {
			reversed+= str[i] + " ";		
		}
		reversed = reversed.trim();
		System.out.println(reversed);
		
		System.out.println("################");


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
