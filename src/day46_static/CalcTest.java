package day46_static;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result = Calculator.plus(55, 7);
		System.out.println("result of plus is: " +result);
		
		result = Calculator.minus(15, 15);
		System.out.println("result of minus is: " + result);
		
		result = Calculator.multiply(25, 3);
		System.out.println("result of multiply is: " + result);
		
		Calculator c1 = new Calculator();
		System.out.println(c1.multiply(2, 3 ));
		
		int i = Integer.parseInt("33");
		
		System.out.println();
		//System is class name
		//out is a static variable
		//println is a non static method
		
	}

}
