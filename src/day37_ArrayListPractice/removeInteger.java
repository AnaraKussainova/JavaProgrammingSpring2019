package day37_ArrayListPractice;

import java.util.ArrayList;

public class removeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<>(10);
		
		System.out.println(nums.size()==0); //even if you mentioned size of array the size() still will show only one zero
		
		nums.add(4);
		nums.add(5);
		nums.add(9);
		nums.add(78);
		nums.add(96);
		nums.add(123);
		nums.add(780);
		
		System.out.println(nums.toString());
		nums.remove(5); //removes number under index 5
		System.out.println(nums.toString());
		 
		nums.remove("5");  //not doing anyth since its Integer Arraylist and we are adding string
		System.out.println(nums.toString());
		
		Integer n1 = new Integer(5); //number 5
		Integer n2 = Integer.valueOf(5);
		System.out.println(n1); //5 
		System.out.println(n2);
		
		nums.remove(n1);
		nums.remove(new Integer(4));
		System.out.println(nums.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
