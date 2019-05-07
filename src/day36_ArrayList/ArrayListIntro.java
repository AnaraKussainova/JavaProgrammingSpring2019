package day36_ArrayList;
import java.util.ArrayList;
public class ArrayListIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	//Create an arrayList
		
		ArrayList <String> names = new ArrayList<>(); 
	
		ArrayList <Integer> nums = new ArrayList<>();
	
	//Assign values into ArrayList
		
		names.add("Anara");
		names.add("Tanya");
		names.add("Maira");
		names.add("Anna");
		names.add("Corky");
	
		nums.add(123);
		nums.add(78);
		nums.add(568);
		nums.add(457);
		nums.add(789);
		
		//read from ArrayList
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		
		//get number of elements/values
		
		System.out.println(nums.size());
		System.out.println(names.size());
		
		
		
		
		
		
	
	
	
	
	
	}

}
