package day24_PracticeArray;

public class CheckFirstAndLAstVAlue {

	public static void main(String[] args) {
		// write a program tha will print true
		//if first and last number is the same
		//if first and last value in the array of ints
		//is same print true
		
		int [] numbers = {12, 41, 213, 21, 42, 12};
		boolean equals = numbers[0] == numbers[numbers.length-1];
		System.out.println(equals);
		
	}

}