package day24_PracticeArray;

import java.util.Arrays;

public class LotteryTicket {

	public static void main(String[] args) {


		int [] lotteryNumbers = {12, 45, 3, 62, 42, 90};
		
		System.out.println(Arrays.toString(lotteryNumbers));
		
		Arrays.sort(lotteryNumbers);
		
		System.out.println(Arrays.toString(lotteryNumbers));
		
		//binary search works only with sorted Array
		
		int index = Arrays.binarySearch(lotteryNumbers, 45);   
		System.out.println("Position: "+index);
		
		//if value doesn't exist, it will bring some negative number
		
		int index2 = Arrays.binarySearch(lotteryNumbers, 5);   
		System.out.println("Position: "+index2);
		
		
		
		
		
		
		
		
	}

}
