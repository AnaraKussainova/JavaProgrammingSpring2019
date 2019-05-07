package day24_PracticeArray;

import java.util.Arrays;

public class CarShop {

	public static void main(String[] args) {
		// BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla
		
		//create an array of Strings and Store these cars inside that array
		
		String [] cars = {"BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla"};
		
		//print cars that starts with M
		
	//Version1	
		for (int i =0; i <cars.length; i++) {
			if (cars[i].startsWith("M")) {
				System.out.println(cars[i]);
		}	
		}
		//Version2	
		for (String c:cars) {
			if (!c.startsWith("M")) {
				continue;
			}
			System.out.println(c);
		}
		System.out.println("###############");
		//print all cars that have letter R somewhere in the name
		
		for (String make: cars) {
			if (make.toLowerCase().contains("r")) {
				System.out.println(make);

			}
		}
		
		System.out.println("######################");
		
		//print car names that ends with a
		
		for (String end: cars) {
			if ( !end.endsWith("a")) {
				continue;
			}
			System.out.println(end);
		}
		
		System.out.println("######################");

		//print all cars that have at least 6 letters
	//Version 1	
		for (String letters : cars) {
			if ((letters.length() >5)) {
				System.out.println(letters);
			}
		}
		
		//Version2
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].length()>=6) {
				System.out.println(cars [i]);
			}
		}
		
		
		System.out.println("######################");

		//Swap first and last value in the array
		// Before : BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla
		// After : Tesla, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, BMW
		
		String temp = cars[0];
		cars[0] = cars[cars.length-1];
		cars [cars.length-1] = temp;
		
		System.out.println(Arrays.deepToString(cars));  //before sorting
		
		Arrays.parallelSort(cars);
		System.out.println(Arrays.deepToString(cars)); //after sorting
		
		System.out.println("Position: " +  Arrays.binarySearch(cars,  "Tesla"));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
