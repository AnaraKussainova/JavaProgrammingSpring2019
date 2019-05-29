package day52_inheritance05;
import java.util.*;
public class FinalArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final ArrayList <String> COLORS = new ArrayList<>();
		
		COLORS.add("orange");
		COLORS.add("grey");
		COLORS.add("white");
		COLORS.add("blue");
		
		System.out.println(COLORS.toString());
		
		//COLORS = new ArrayList<>(); YOU CAN NOT ASSIGN NEW OBJECT TO FINAL ARRAY LIST
		
		
		
		
		
		
	}

}
