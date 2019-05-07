package day25_Practice;

public class Shopping {

	public static void main(String[] args) {

		String[] products = {"Timberland", "H&M", "Swatch", "Bag", "Adidas"};
		double[] prices = {120.0, 5.99, 150.5, 3000.0, 6.99};
		int [] itemId = {12345, 123456, 12347, 12348, 12459};
		
		//print count of products:
		
		System.out.println("Products count: " + products.length);
		
		//check if product prices and itemsID have same count
		
		if (products.length == prices.length && products.length == itemId.length ) {
			System.out.println("Shopping list looks good");
		}else {
			System.out.println("Something is wrong in the list");
			return;
		}
		
		//loop through product and print each one in separate line
		//Version 1
		
		for (int i =0; i<products.length; i++) {
			System.out.println(products[i]);
		}
		
		//Version 2
		
		System.out.println("#################");
		
		for (String p : products ) {
			System.out.println(p);
		}
		
		//prices --> for loop
		
		for (int i = 0; i <prices.length; i++) {
			System.out.println(prices[i]);
		}
		
		//itemId -->print this in reverse order using a loop
		
		for (int i = itemId.length-1; i>=0; i--) {
			System.out.println(itemId[i]);
		}
		
		//print a report with a total price
		//Item 1: 12345 - Timeberland shoes - $120.0
		//Total price: 
		
		for (int i=0; i<itemId.length; i++) {
			System.out.println("Item " + (i+1) + ": " + itemId[i] + "-" + products[i] + "- " + "$" + prices[i]);
		}
		
		double total = 0;
		
		for (int i =0; i<prices.length; i++) {
			total =total+ prices[i];
		}
		System.out.println("Total price: " + total);
		
		//find the most expensive item in your list and print it as a report
		
		double maxPrice = 0;
		int maxIndex = 0;
		for (int i =0; i <prices.length; i++) {
			if (prices[i] >maxPrice) {
				maxPrice = prices[i];
				maxIndex = i;
			}
		}
		
		 System.out.println(itemId[maxIndex] + " - " + products[maxIndex] + " $" + maxPrice);
		
		
	}

}
