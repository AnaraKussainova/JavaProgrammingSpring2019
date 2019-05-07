package day38_arrayList;
import java.util.*;
public class ContainsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		
		System.out.println(list1);
		ArrayList<String> list2 = list1; //list1, ist2 point to same object
		
		ArrayList<String> months = new ArrayList<>(list1);//copy all values from list1
		
		System.out.println(months);
		
		months.add("June");
		months.add("Jul");
		months.add("Aug");
		System.out.println(months);
		System.out.println(list1);
		
		System.out.println(months.contains("Jan")); //true
		
		System.out.println(months.contains("Dec")); //false
		
		//how would you check if Feb is on second position
		
		System.out.println(months.indexOf("Feb")==1);  //true
		
		System.out.println(months.get(1).equals("Feb")); //true
		
		ArrayList<String> months2 = new ArrayList<>(list1);
		
		System.out.println("Month: " + months.toString());
		System.out.println(months2.toString());
		
		//check if months has all the values of months2
		if (months.containsAll(months2)) {
			System.out.println("Months has all values of months2");
		}else {
			System.out.println("Some values are missing");
		}
		
		//add one more Jan to months2
		
		months2.add("Jan");
		
		if (months.containsAll(months2)) {
			System.out.println("Months has all values of months2");
		}else {
			System.out.println("Some values are missing");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
