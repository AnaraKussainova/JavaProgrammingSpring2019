package day31_Practice_Methods;

import java.util.Arrays;

public class MethodsWithStrings {

	public static void main(String[] args) {
		countWord("Hello Java");
		googleSearchResult ("About 121,00,000 results (0.75 seconds)");
	}

	public static void countWord(String sentence) {
		String [] words = sentence.split(" ");
		System.out.println("Words in this sentence " + Arrays.toString(words));
		System.out.println("Number of words: " + words.length);
		
	}
	public static void googleSearchResult(String result) {
		
		String [] words = result.split(" ");
		System.out.println(Arrays.toString(words));
		
		System.out.println("Result count: " + words[1].replace(",", ""));
		
		System.out.println("Time in seconds: " + words[3].replace("(",""));
		
		
	}
}
