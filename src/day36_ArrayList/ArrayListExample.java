package day36_ArrayList;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// declare aarayList called languages

		ArrayList<String> languages = new ArrayList<>();
		
		//add values
		languages.add("Java");
		languages.add("Russian");
		languages.add("Spanish");
		languages.add("Arabic");
		
		System.out.println(languages.size());
		
		languages.add("English");
		System.out.println(languages.size());
		
		
		//remove value
		
		//remove java
		System.out.println(languages.remove(0));
		System.out.println(languages.size());
		
		//to String

		System.out.println(languages.toString());
		
		
	}

}
