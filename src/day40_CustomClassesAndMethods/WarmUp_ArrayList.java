package day40_CustomClassesAndMethods;
import java.util.*;
public class WarmUp_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> myList = new ArrayList<>();
		myList.add("moon");
		myList.add("star");
		myList.add("mars");
		myList.add("sun");
		myList.add("sun");
		
		String targetWord = "sun";
		
		System.out.println(countOccurances(myList,targetWord));
	}
	public static int countOccurances(ArrayList <String> list, String word) {
		
		int count = 0;
		for (String str : list) {
			if(str.equals(word)) {
				count ++;
			}
		}
		return count;
	}
}
