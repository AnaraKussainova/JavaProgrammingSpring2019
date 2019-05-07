package day31_Practice_Methods;
import java.util.Scanner;
public class CalculatorWithMethods {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		
		System.out.println("Select operator: +, -, *, /, %");
		
		String operator = scan.next();
		
		switch (operator) {
		case "+":
			add(n1,n2);
			break;
		case "-":
			minus(n1,n2);
			break;
		case "*":
			multiply(n1,n2);
			break;
		case "/":
			divide(n1,n2);
			break;
		case "%":
			reminder(n1,n2);
			break;
		default:
			System.out.println("Invalid");

		}
	}

	public static void add(double num1, double num2) {
		double result = num1 + num2;
		System.out.println(result);
	}
	
	public static void minus(double num1, double num2) {
		double result = num1 - num2;
		System.out.println(result);
	}
	public static void divide(double num1, double num2) {
		double result = num1 / num2;
		System.out.println(result);
	}
	public static void multiply (double num1, double num2) {
		double result = num1*num2;
		System.out.println(result);
	}
	public static void reminder(double num1, double num2) {
		double result = num1%num2;
		System.out.println(result);
	}
}
