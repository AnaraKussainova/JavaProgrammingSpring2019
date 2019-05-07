package day33_Practice;

public class WarmUpMethodsWithReturn {

	public static void main(String[] args) {
		
		
		int result = add2(4,8);
		System.out.println(result);
		
		
		addVoid(5,2);
		//below line will not work because addVoid does not return a value. It just perform action
		//int result = addVoid(4,1);
		//System.out.println (addVoid(3,4));
		
		add2(5,6);
		
	}
	
	public static void addVoid (int num1, int num2) {
		int sum = num1 +num2;
		System.out.println("Sum is " + sum);
	}
	
	public static int  add2 (int num1, int num2) {
		int sum = num1 + num2;
		return sum;
}
}
