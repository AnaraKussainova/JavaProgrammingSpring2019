package day33_Practice;

public class CalcTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calculator.divide(5, 1));
		
		System.out.println(Calculator.minus(15, 9));
		
		int addResult = Calculator.minus(21,20);
		System.out.println(addResult);
		
		int a = 10, b = 5;
		int myResult = Calculator.minus(a, b);
		System.out.println("My result is " + myResult);
		
		int Nums [] = {8, 4};
		int result2 = Calculator.divide(Nums[0], Nums[1]);
		System.out.println("My Array result is " +result2);
		
		if (Calculator.multiply(10, 2) ==20) {
			System.out.println("Correct");
		}else {
			System.out.println("Error");
		}
	}
	

}
