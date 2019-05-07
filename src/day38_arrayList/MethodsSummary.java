package day38_arrayList;
import java.util.*;
public class MethodsSummary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
		//add method to add value
		list.add("red");
		list.add("blue");
		list.add("white");
		list.add("grey");
		list.add("black");
		
		//add method with index : "yellow will be placed to index 0
		list.add(0, "yellow");
		
		//toString method to print all values in same line
		System.out.println(list.toString());
		
		//size method 
		System.out.println("Number of elements " + list.size());
		
		//get method return value from index
		
		System.out.println(list.get(3));
		
		//remove using index. removes value from index position
		
		list.remove(0); // removes yellow from the list
		System.out.println(list.toString());
		
		//remove using value/element. removes element first occurance
		
		list.remove("blue");
		System.out.println(list.toString());
		
		//set(index, value) replaces certain index with new value
		
		list.set(0, "orange"); //it will replace red by orange
		System.out.println(list.toString());
		
		//indexOf(value) returns index of value in the list
		//if there are no matching value in the list the index will be -1
		System.out.println("Position of grey: " + list.indexOf("grey"));
		 
		//isEmpty()returns true if list is empty. size ==0		
		
		System.out.println("is list empty? " + list.isEmpty());
		System.out.println("is list empty? " + (list.size() ==0));
		
		//contains(element) returns true if value is present
		System.out.println("white is in the list? " + list.contains("white"));
		
		System.out.println("#################");
		
		List<String> list2 = new ArrayList<>();
		
		//addAll method adds all values from one list into another
		System.out.println(list.toString());
		list2.addAll(list);
		
		System.out.println(list2.toString());
		
		
		//contains all checks if list has all values of another list
		
		System.out.println("contains all: " + list.containsAll(list2));
		
		//equals(list) checks if 2 lists are exactly equal
		System.out.println("equals: " + list.equals(list2));
		
		list2.add("pink");
		
		//remove all removes all matching values from the listthat re in another list
		
		list2.removeAll(list);
		
		System.out.println(list.toString());
		System.out.println(list2.toString());
		
		//add all (index, list) adds a new lsit values starting from the given index
		
		list2.addAll(0,list);
		System.out.println(list2.toString());
		
		//clear all method 
		
		list.clear();
		list2.clear();
		System.out.println("both empty? - " +( list.isEmpty() && list2.isEmpty()));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
