package day41_PracticeArrayList;

import day40_CustomClassesAndMethods.Contact;

public class MyCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CAR car1 = new CAR();

		car1.make = "Tesla";
		car1.model = "X";
		car1.color = "white";
		car1.currentSpeed= 100;
		
		
		car1.printCarInfo();
		car1.showCurrentSpeed(55);
		car1.drive();
		System.out.println("before: " + car1.currentSpeed);
		car1.accelarate(10);
		System.out.println("after: " + car1.currentSpeed);
		
		System.out.println("###########");
		BMW bmw = new BMW();
		
		System.out.println(bmw.make);
		
		bmw.model = "m3";
		bmw.showPrice();
		
		BMW bmw2 = new BMW();
		bmw2.model = "X5";
		bmw2.showPrice();
		
		
		
		
	}

	
	
}

