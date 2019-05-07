package day12_switch_ternary;
import java.util. Scanner;
public class CalculatorV01 {

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
		
		if ( operator.contentEquals("+")) {
			result = num1 + num2;
		}else if (operator.contentEquals("-")) {
			result = num1 - num2;
			
		} else if (operator.contentEquals("*")) {
			result = num1 * num2;
		}else if ( operator.equals("/")) {
			result = num1/num2;
		}else if (operator.contentEquals("%")){
			result = num1%num2;
		}else {
			System.out.println("Invalid operator selected: "+ operator);
			return;
		}
			
		System.out.println(result);
	
		
	}

}
