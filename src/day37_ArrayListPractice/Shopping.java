package day37_ArrayListPractice;

import java.util.ArrayList;

public class Shopping {

	public static void main(String[] args) {

		ArrayList<String>  shoppingList= new ArrayList<>();
		
		shoppingList.add("milk");
		shoppingList.add("bread");
		shoppingList.add("cheese");
		shoppingList.add("eggs");
		shoppingList.add("avocado");
		shoppingList.add("coffee");
		
		//print number of items
		
		int count =shoppingList.size();
		System.out.println(count);
		
		//print all items
		
		System.out.println(shoppingList.toString());
		
		//print first and last item
		
		System.out.println(shoppingList.get(0));
		System.out.println(shoppingList.get(count-1));
		
		shoppingList.remove("cheese"); //shoppingList.remove(3);
		
		//System.out.println(shoppingList.toString());
		System.out.println(shoppingList);
		// FOR EACH loop can be used only for reading 
		//you cant modify list inside for each loop
		
		for (String item : shoppingList) {
			System.out.println(item);
		}
		
		//remove all items at once
		
		shoppingList.clear();
		
		System.out.println(shoppingList.toString());
		
		
		
		
		
	}

}
