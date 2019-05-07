package day34_PracticeMethods;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(5,3);
		add(5.23,2);
		add("cat", " dog");
	}
	public static void add (int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}
	public static void add (double d1, double d2) {
	double result = d1+d2;
	System.out.println(result);
	}

	public static void add (String str1, String str2) {
		String result = str1 + str2;
		System.out.println(result);
	}
}
