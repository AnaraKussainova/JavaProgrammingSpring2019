package day34_PracticeMethods;

import java.util.Arrays;

public class CountArray {

	public static void main(String[] args) {
		
		int [] numbers = {23, 23, 56, 89, 89};
		int value = 23;
		System.out.println(findOccurances(numbers, value));
		
		if (findOccurances(numbers, value)>0) {
			System.out.println("We have: " + value);
		}else {
			System.out.println(value + " wasnt found");
		}
		
		System.out.println(Arrays.toString(getArray()));
		
		int [] nums = getArray();
		
		System.out.println(Arrays.toString(nums));
	}
	public static int findOccurances (int [] array, int value) {
		
		int count = 0;
		
		for (int num : array ) {
			if ( num == value) {
				count++;
			}
		}
		return count;
	}
	
	public static int[] getArray() {
		
		int [] myArray = {23,89,100,89,56};
		return myArray;
		
		
		
		
		
		
		
		
		
		
		
	}
}
