package day38_arrayList;
import java.util.*;
public class AddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l1 = new ArrayList<>();
		
		l1.add("java"); l1.add("python"); 
		
		List<String> l2 = new ArrayList<>();
		
		l2.add("C#");
		l2.add("C++");
		
		System.out.println(l1);
		System.out.println(l2);
		
		/*
		 * //Version 1 adding one list to another through for each loop
		 * for (String value : l1) {
			l2.add(value);
		}
		System.out.println(l2);
		
		 */
		
		
		//Version 2 addAll method
		
		l2.addAll(l1);
		System.out.println(l2);
		
		//if we use addAll again l1 values will be added again
		
		l2.addAll(l1);
		System.out.println(l2);
		
		
		
		
	}

}
