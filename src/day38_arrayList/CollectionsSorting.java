package day38_arrayList;
import java.util.*;
public class CollectionsSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numsList = new ArrayList<>();
		
		numsList.add(44);
		numsList.add(1);
		numsList.add(4);
		numsList.add(1000);
		numsList.add(3);
		
		System.out.println(numsList);
		
		System.out.println("Sorting >>>please wait");
		
		Collections.sort(numsList);
		
	System.out.println(numsList);
	
	System.out.println("############");
	
	
	List<String> strList = new ArrayList<>();
	
	strList.add("Fuad");
	strList.add("Roman");
	strList.add("Anara");
	strList.add("Anastasia");
	
	Collections.sort(strList);
	System.out.println(strList);
	
	int maxNum = Collections.max(numsList);
	
	int minNum = Collections.min(numsList);
	
	System.out.println(maxNum);
	System.out.println(minNum);
	
	//checks from what letter starts in Alphabet 
	String maxName = Collections.max(strList);
	String minName = Collections.min(strList);
	
	System.out.println(maxName);
	System.out.println(minName);
	
	
	//Shuffle
	
	Collections.shuffle(strList);
	
	System.out.println(strList.toString());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}