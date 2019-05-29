package day42_customClasses_Encapsulation;

import java.util.Arrays;

public class Burger7 {

	public static void main(String[] args) {

		Burger b1 = new Burger();
		
		b1.name = "cowboy";
		
		String [] ings = {"onion" , "cheese", "pickles", "beef", "jalapeno", "b7sauce"};
		
		b1.ingredients = ings;
		
		System.out.println(b1.name);
		System.out.println(Arrays.toString(b1.ingredients));
		
		System.out.println(b1.ingredients[0]);
		
		for (String ing : b1.ingredients) {
			System.out.println(ing);
		}
	}

}
