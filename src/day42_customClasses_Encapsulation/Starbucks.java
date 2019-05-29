package day42_customClasses_Encapsulation;

public class Starbucks {
 public static void main (String [] args) {
	 
	 //declare an array that can store 2 Coffee objects
	 //int [] nums = new int[2];
	 
	 Coffee [] coffeeArray = new Coffee[2];  //creating array with 2 spots
	 
	 coffeeArray[0] = new Coffee();
	 //access coffee object in index 0 and set data
	 coffeeArray[0].setCoffeeInfo("Espresso", "tall", 2.30, 100);
	 
	 coffeeArray[0].getCoffeeinfo();
	 //create a single object first 
	 Coffee latte = new Coffee();
	 //assign data
	 latte.setCoffeeInfo("latte", "grande", 4.23, 190);
	 //assign the latte object to index 1 of the array
	 coffeeArray[1] = latte;
	 //print data from object 1 
	 coffeeArray[1].getCoffeeinfo();
	 
	 
	 
	 
	 
	 
  }
}
