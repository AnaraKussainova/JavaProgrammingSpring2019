package day27_Practice;

import java.util.Arrays;

public class EqualsMethod {

	public static void main(String[] args) {


		int [] nums1 = {3, 5, 6, 10, 100};
		int [] nums2 = {3, 5, 6, 10, 100};
		
		Arrays.equals(nums1, nums2);
		
		System.out.println(Arrays.equals(nums1, nums2)); //true
		
		if(Arrays.equals(nums1, nums2)) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Mismatched values present");
		}
		
		System.out.println("#############");
		
		String[]str1 = {"one", "two", "three"};
		String[]str2 = {"one", "Two", "three"};
		
		System.out.println(Arrays.equals(str1,str2)); //false because Two is upper case in str2
		
		boolean match = Arrays.equals(str1, str2);
		
		System.out.println(match);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
