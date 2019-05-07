package day38_arrayList;
import java.util.*;
public class ContainsAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> nums1 = new ArrayList<>();
		nums1.add(10); nums1.add(20); nums1.add(30); nums1.add(40);
		
		List<Integer> nums2 = new ArrayList<>();
		
		nums2.add(20); nums2.add(30); nums2.add(40);
		 
		//test if nums1 has all nums2 value
		
		System.out.println( (nums1.containsAll(nums2))); //true
		
		List<String> planA = new ArrayList<>();
		planA.add("java");
		planA.add("replit");
		planA.add("ping pong");
		planA.add("food");
		planA.add("run");
		planA.add("sleep");
		
		List<String> planB = new ArrayList<>();
		
		planB.add("food");
		planB.add("run");
		planB.add("sleep");
		planB.add("java");
		planB.add("ping pong");
		planB.add("replit");
		
		//check if both have same values, ignoring order		
		if (planB.containsAll(planA) && planA.contains(planB)) {
			System.out.println("Plans A and B mathc");
		}else {
			System.out.println("Plans A and B do not ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
