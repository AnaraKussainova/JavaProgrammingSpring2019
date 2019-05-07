package day23_Array;

public class Arrays1 {

	public static void main(String[] args) {

		int [] numbers = new int [3];
		
		int num1 = 5;
		int num2 = 7;
		int num3 = 10;
		//assign to the first variable value of num1
		numbers [0] = num1;
		numbers [1] = num2;
		numbers [2] = num3;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println("*******");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		
		//Create an Array of String with size of 5
		
		String [] names = new String [5];
		String [] names2 = {"Shaun", "Roman", "Vlad", "Burak", "Maria"};
		System.out.println(names2[4]);
		System.out.println("Number of items: " + names2.length);
		
		
	}

}
