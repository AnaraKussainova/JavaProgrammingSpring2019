package day29_Practice;

import java.util.Arrays;

public class CountriesArray {

	public static void main(String[] args) {


		String [][] countries = {
				{"USA",	"Washington DC"},
				{"Canada",	"Ottawa"},
				{"Mexico",	"Mexico city"},
				{"Brasil",	"Brasilia"},
				{"Peru",	"Lima"},
				{"Argentina",	"Boanes Aeros"},
				{"Bolivia",	"La Paz"},
				{"Macedonia",	"Scopia"},
				{"Kazakhstan",	"Nursultan"}};
		
		//print USA with capital city
		System.out.println(countries[0][0] + " | " + countries[0][1]);
		
		System.out.println(countries[8][0] + " | " + countries[8][1]);

		//print all countries in same line separated by |	
		
		for (int i =0; i <countries.length; i++) {
			System.out.print((countries[i][0] + " | "));
		}
		
		System.out.println();
		System.out.println("###########");
		
		//second version
		
		for (String []country : countries) {
			System.out.print(country[0] +" | ");
		}
		
		//put cities in new Array
		
		String [] cities  =  new String [countries.length] ;
		
		
		System.out.println(Arrays.toString(cities));
		
		for ( int i=0; i<countries.length; i++) {
			cities[i]=countries[i][1];
		}
		System.out.println(Arrays.deepToString(cities));
		
		for (int row=0; row<countries.length; row++) {
			if (countries[row][0].equals("Bolivia")) {
				//System.out.println(countries[row][1]);
				if(countries[row][1].contentEquals("La Paz")) {
					System.out.println("Bolivia test passed");
				}else {
					System.out.println("Bolivia test failed");			
				}
				break; //exit the loop
			
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
