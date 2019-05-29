package day41_PracticeArrayList;

import java.util.ArrayList;
import java.util.*;
public class WarmUpList {
	
	// [5,2] >>>[10,4]

	public static void main (String[] args) {
		List<Integer> myList = new ArrayList<>();
		myList.add(5);
		myList.add(4);
		
		System.out.println(doubleTheList(myList));
		
		   ArrayList<String> list = new ArrayList<>();
		   

	}
	
	
	
	
	public static List<Integer> doubleTheList(List<Integer>nums) {

		for(int i =0; i<nums.size(); i++) {
			nums.set(i, nums.get(i)*2);
		}
		return nums;
		
	}
		public static void  removeAll(ArrayList<String> wordList, String targetWord){
			  
			  for (int i =0; i<wordList.size(); i++){
			    if(wordList.get(i).equals(targetWord)){
			      wordList.remove(i);
			    }
			    
			  }
		
		
		
		
		
		
	
}
}
