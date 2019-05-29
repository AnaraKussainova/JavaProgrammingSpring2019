package day42_customClasses_Encapsulation;

import java.util.Scanner;

public class StringShoesToObject {

	public static void main(String[] args) {
		// create Shoes object and assign the data from the String data
		
		
		String data = "Bruno, 9.5";
		//split using "," and store into array
		String [] arrData = data.split(",");
		
		Shoes shoes = new Shoes();
		
		//shoes.brand = arrData[0];
		//shoes.size = Double.parseDouble(arrData[1]);
		
		shoes.setShoesData(arrData[0], Double.parseDouble(arrData[1]));
		
		System.out.println(shoes.getShoesData());
		
		System.out.println("============");
		Scanner scan = new Scanner (System.in);
		
		System.out.println("WHat shoes brand?");
		
		String brand = scan.next();
		
		System.out.println("What is your Size?");
		
		double size = scan.nextDouble();
		
		Shoes myShoe = new Shoes();
		
		myShoe.setShoesData(brand, size);
		
		System.out.println(myShoe.getShoesData());
		
		
		
		
		
		
		
	}

}
