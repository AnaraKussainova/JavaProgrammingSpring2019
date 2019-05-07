package day24_PracticeArray;

import java.util.Arrays;

public class SomeOfTheNumbers {

	public static void main(String[] args) {
		
		//Create and Array of integers with length 3
		
		int [] numbers = new int [3];
		
		numbers [0] = 5;
		numbers [1] = 10;
		numbers [2] = 20;
		
		System.out.println(numbers);   // this is a hashcode 
		
		//toString() from arrays class can help to print an arrays as string
		System.out.println(Arrays.toString(numbers));

		int sum = 0;
		
		for (int i =0; i <numbers.length; i++ ) {
			sum = sum + numbers [i];
		}
		
		System.out.println("Sum: " + sum);
		
		int max = Integer.MIN_VALUE;
		System.out.println(Integer.MIN_VALUE);
		
		for (int i = 0; i <numbers.length; i++) {
			if (numbers[i]>max) {
			max = numbers[i];
		}
		}
		System.out.println("Max value: " + max);
		
		//find min value in the array
		
		int min = Integer.MAX_VALUE;
		
		for (int i =0; i<numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		
		System.out.println("Min value: " + min);
		
		

	}

}
