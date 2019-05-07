package day37_ArrayListPractice;

import java.util.Arrays;
import java.util.*;
public class ArrayasAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> cars = new ArrayList<>();
		
		cars.add("Honda");
		//declare and add values in single statement
		//Arrays class
		List<Integer> nums = Arrays.asList(4,2,3,5);
		
		System.out.println(nums.size());
		
		System.out.println(nums.toString());
		
		//nums.add(100);
		//System.out.println(nums.toString());
		//wont work because ewe used Array for ArrayList. A lot of methods from ArrayList not possible or unsupported
		
		//create arrayList prices
		//assign values using Arrays.aslist method
		
		List<Double> prices = Arrays.asList(5.0,3.3,9.9,7.23,780.89,66.23,64.0,78.23,96.8);
		System.out.println(prices);
		
		//calculate sum of all prices
		
		double sum =0;
		
		//Version 1
		for (int i =0; i<prices.size(); i++) {
			sum += prices.get(i);
		}
		System.out.println(sum);
		
		
		//Version 2
		double sum2=0;
		for (double price : prices) {
			sum2 +=price;
		}
		
		System.out.println(sum2);
		
		//create new list expensive 
		//add prices that are more than 100
		//
		
		List<Double> expensive = new ArrayList<>();
		
		//for ( double price : prices) {
		//	if (price>100.0) {
		//		expensive.add(price);
		//	}
	//	}
		//System.out.println("Version 1" +expensive.toString());
		
		for (int i =0; i<prices.size(); i++) {
			if (prices.get(i) >100.0) {
				expensive.add(prices.get(i));
			}
		}
		System.out.println("Version 2" + expensive.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
