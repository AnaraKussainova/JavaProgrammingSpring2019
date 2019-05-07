package day27_Practice;
import java.util.Arrays;
public class BinarySearch {

	public static void main(String[] args) {


		int[] nums = {4, 6,7,10,55};
		
		System.out.println(Arrays.binarySearch(nums,  7));
		
		System.out.println(Arrays.binarySearch(nums,  55));
		
		System.out.println(Arrays.binarySearch(nums,  2));  //always -1 because we dont have 2 in Array
		
		
		int i = Arrays.binarySearch(nums,  10);
		System.out.println(i);
		
		
		System.out.println("############3333");
		
		int[] nums2 = {40, 6,17,10,55};
		
		System.out.println(Arrays.binarySearch(nums2,  40)); //-5 Because Array not sorted
		
		Arrays.parallelSort(nums2);
		
		System.out.println(Arrays.toString(nums2));
		System.out.println(Arrays.binarySearch(nums2,  40)); // 3 After sorting
		
		
		
		
		
		
		
		
		
		
		
	}

}
