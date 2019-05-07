package day33_Practice;

public class Calculator {

	public static void main(String[] args) {
		int result = multiply(5,4);
		System.out.println(result);
		
		 result = minus (6,4);
		System.out.println(result);
		
		result = divide(6,3);
		System.out.println(result);

	}
	public static int multiply (int num1, int num2) {
		 int result= num1*num2;
		return result;
	}
	
	public static int minus (int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	
	public static int divide ( int num1, int num2) {
		
		if (num2 == 0) {
			System.out.println("Error. Cant / by 0");
			return 0;
		}else {
			int result = num1 / num2;
			return result;
		}
		
	}
}
