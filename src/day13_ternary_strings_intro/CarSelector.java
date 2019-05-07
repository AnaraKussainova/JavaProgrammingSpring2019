package day13_ternary_strings_intro;
import java.util.Scanner;
public class CarSelector {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String American, Japanese, German, Italian, Korean;
		int carType;
		double averagePrice=0.0;
		String carOptions = "";
		String carOrigin="";
		
		System.out.println("Which type of car you are interested?");
		System.out.println(" 1) American\n 2) Japanese\n 3) German\n 4) Italian\n 5) Korean");
		carType = scan.nextInt();
		
		switch (carType) {
			case 1: 
				averagePrice = 33000;
				carOptions=" Ford, Dodge, Tesla, Chevrolet, Lincoln";
				carOrigin = "American";
				break;
		
			case 2:
				averagePrice = 32000;
				carOptions = "Toyota, Mitsubisi, Honda, Subaru, Mazda";
				carOrigin = "Japanese";
				break;
			case 3:
				averagePrice = 55000;
				carOptions = "Bmw, VW, Audi, Mercedes, Porsche";
				carOrigin = "German";
				break;
			case 4:
				averagePrice = 85000;
				carOptions="Alfa Romeo, Ferrari, Lamborghini, Fiat";
				carOrigin = "Italian";
				break;
			case 5:
				averagePrice= 25000;
				carOptions= "Kia, Hyundai, Daewoo";
				carOrigin = "Korean";
				break;
				
				default:
					System.out.println("Car type not available");
					return;
		}
		
		System.out.println("You selected " + carOrigin + " car and your options are " + carOptions);
		System.out.println("Average Price: "+averagePrice);
		
		
		
	
		
		
		
		
		
		

	}

}
