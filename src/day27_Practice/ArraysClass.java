package day27_Practice;
import java.util.Arrays;
public class ArraysClass {

	public static void main(String[] args) {

		int [] nums = {43, 12, 4, 1, 3, 5};
		
		//toString method
		
		System.out.println(Arrays.toString(nums));
		
		String str = Arrays.toString(nums);
		System.out.println(str);
		
		//Sort method
		Arrays.sort(nums);
		
		String[] languages = {"Zulu", "Italian", "Spanish", "Russian", "Kazakh"};
		
		System.out.println(Arrays.deepToString(languages));
		
		Arrays.parallelSort(languages);
		
		System.out.println(Arrays.toString(languages));		
		
		System.out.println("##########");
		
		int[] nums2 = {345, 665, 3333, 11, 3, 66};
		
		//find lowest and largest values from nums2 array
		
		Arrays.parallelSort(nums2);
		
		System.out.println(Arrays.toString(nums2));
		
		int lowest = nums2[0];
		int largest = nums2[nums2.length-1];
		
		System.out.println(lowest);
		System.out.println(largest);
		
		System.out.println("##########");

		int [] nums3 = {4,10,20,50};
		
		Arrays.binarySearch(nums,  10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}