package day32_Practice;

import java.util.Arrays;

public class ArrayParameters {

	public static void main(String[] args) {
		
		int[] myArray = {44, 22, 66,11};
		printArray(myArray);
		printArray (new int[] {12,33,78,9852});
		
		print2Arrays(new int[] {2,5,3}, new int [] {2,0,0,0,0,0,});
		
		print2Arrays2(new int[] {2,3,55555555}, new int [] {556565656, 10});
		
	}

	public static void printArray(int [] nums) {
    for (int n : nums) {
    	System.out.print(n + " ");
    }
    System.out.println();
	}
	
	public static void print2Arrays(int[] nums1, int[] nums2) {
		if (nums1.length > nums2.length) {
			System.out.println(Arrays.toString(nums1));
			System.out.println(Arrays.toString(nums2));
		}else {
			System.out.println(Arrays.toString(nums2));
			System.out.println(Arrays.toString(nums1));
		}
		
		
	}
	
	public static void print2Arrays2(int[] nums1, int[] nums2) {
		if (nums1.length > nums2.length) {
			printArray(nums1);
			printArray(nums2);
		}else {
			printArray(nums2);
			printArray(nums1);
		}
}
}