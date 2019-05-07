package day34_PracticeMethods;

import java.util.Arrays;

public class VARARGSinMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cook("Burrito Bowl", "rice", "meat", "cheese", "lettuce");
		cook("Avocado toast", "bread", "avocado", "sunny side eggs", "cheese");
		
		shoppingList(10000, "Avocado toast", "Watch", "Zara dress", "YSL jacket", "Le Labo fragrance");
		
		String [] myPets = {"cat", "dog", "cow", "sheep"};

		printWords(myPets);
	}

	public static void cook (String name, String...  ings) {
		System.out.println("Food: " + name);
		System.out.println("Ingridients: " +Arrays.toString(ings));
		
	}
	
	public static void shoppingList( int totalprice, String...  items) {
		
		System.out.println("Total cost: " + totalprice);
		System.out.println("Items: " + Arrays.toString(items));
	}
	
	public static void printWords (String... words) {
		for (String w: words) {
			System.out.println(w);
		}
}
}