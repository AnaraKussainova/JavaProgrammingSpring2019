package day12_switch_ternary;

import java.util.Scanner;

public class CalculatorV02 {
	public static void main(String[] args) {

	
		Scanner scan = new Scanner ( System.in);
		//Get numbers	
			double num1, num2, result;
			
			
			System.out.println("Enter first number");
			
			num1 = scan.nextDouble();
			
			System.out.println("Ener second number");
			
			num2 =scan.nextDouble();
			
			// Get operator
			
			System.out.println("Select Operator: +, -, *, /, %");
			
			String operator = scan.next();
			
			// perform operation and display result
			
			result = 0;
		
		switch (operator) {
		
		case "+" :
			result = num1 + num2;
			break;

		case "-":
			result = num1 - num2;
			break;
			
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		case "%":
			result = num1 %num2;
			break;
		default:
			System.out.println("Invalid operator selected: "+ operator);
			return;
		
		}
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
	}

}
