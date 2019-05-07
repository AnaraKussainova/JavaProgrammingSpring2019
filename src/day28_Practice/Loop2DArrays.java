package day28_Practice;

import java.util.Arrays;

public class Loop2DArrays {

	public static void main(String[] args) {


		String[][] pizzas = {
				{"pinapple", "pepperoni"}, //0
				{"anchoives", "mushrooms", "olives"},  //1
				{"4 cheese"},                           //2
				{"chicken", "tomatoes", "jalapenos", "onions"}, //3
				{"green peppers", "zuccini", "brocolli", "spinach", "shrimp"} //4
				}; 
		
				
		//System.out.println(Arrays.deepToString(pizzas[0]));
		
		for (String[] pizza:pizzas) {
			
		System.out.print(pizza.length + "-");
		System.out.println(Arrays.toString(pizza));
		
		}
		
		System.out.println("##############");
		
		
		for (int i =0; i<pizzas.length; i++) {
			System.out.print(pizzas[i].length + "-");
			System.out.println(Arrays.toString(pizzas[i]));
		}
		
		
		System.out.println("##############");

		for (String topping:pizzas[2]) {
			System.out.println(topping);
		}
		
		
		System.out.println("##############");

		
		int [][]students = 	{{4,5,6}, {12,5,7}, {23,55,28,18,19}};	
		
		//2 parts: outer loop and inner
		//outer will take each group
		//inner loop will take each values
		
		for(int []group:students) {
			for (int studentID : group) {
				System.out.print(studentID+ ", ");
			}
			System.out.println();
		}
		
		System.out.println("##############");

		int[][] nums = {
				
				{10,20},
				{20,30,40,50},
				{100,200,400,},
				{555,333,111,444,666,78}
				
		};
		
		for (int i =0; i<nums.length; i++) {
			for (int j =0; j<nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
