package day28_Practice;

import java.util.Arrays;

public class FootballTeam {

	public static void main(String[] args) {

	String[][] teams = new String[2][6];  //2 Arrays by 6 people inside
	
	//declare MuliD array with 2 rows 
	
	teams [0] [0] = "Irina";
	teams [0] [1] = "Zarif";
	teams [0][2] = "Cihan";
	teams [0][3] = "Habib";
	teams [0][4] = "Adel";
	teams[0][5] = "Bojan";

	teams [1] [0] = "Olimjon";
	teams [1] [1] = "Mirshod";
	teams [1][2] = "Usman";
	teams [1][3] = "Nursultan";
	teams [1][4] = "Roman";
	teams[1][5] = "Dmitri";	
		
		System.out.println("First player of first team: " + teams[0] [0]); //Irina
		
		System.out.println(teams[1][5]); //Dmitri
		
		//print how many rows/teams/arrays
		
		System.out.println("Number of rows: " + teams.length);
		
		System.out.println("People of first team " + teams[0].length);
		System.out.println("People of second team " + teams[1].length);
		
		System.out.println(Arrays.deepToString(teams));
		
		//
		
		int [][] nums = new int [3][4];
		
		nums[0][0] = 100;
		nums [0][1] = 34534;
		nums[0][2] = 343242;
		nums[0][3] = 5434;
		
		nums[1][0] = 256;
		nums [1][1] = 645;
		nums[1][2] = 257;
		nums[1][3] = 999;
		
		nums[2][0] = 1231;
		nums [2][1] = 258;
		nums[2][2] = 123;
		nums[2][3] = 89;
		
		System.out.println(Arrays.deepToString(nums));
		
		System.out.println(Arrays.toString(nums[0]));
		
		System.out.println("############");
		
		int [][] scores = {{3,5,10}, {6,4,2, 10}  };
		
		System.out.println("Days playes/Number of arrays " +scores.length );
		
		System.out.println("Number of values in 1: " + scores[0].length  );
		
		System.out.println("Number of values in 2 " + scores[1].length);
		
		System.out.println("###########");
		
		int [][] values = new int [4][];
		
		values[0] = new int[] {34,23,5};
		
		values[1] = new int[] {34,56,58,78,8963,55,42,78};
		
		values[2] = new int [2]; 
		
		values[2][0] = 55; 
		values[2][1] =88;
		
		values[3] = new int[] {25,56,78,56,8888};
		
		System.out.println(Arrays.deepToString(values));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
