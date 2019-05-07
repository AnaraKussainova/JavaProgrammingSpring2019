package day08_casting_conditionalas;

public class ExplicitCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(10 / 2.0); // because double bigger than int
		
		System.out.println(10.0 / 2);
		
	     int result =(int) ( 10 /2.0);
		
		System.out.println(result);
		
		int rent1 = 987;
		int rent2 =	1100;	
		int rent3 = 894;
		int rent4 = 1234;
		
		double average =((rent1 + rent2 + rent3+ rent4) /4);
		System.out.println(average);
		
		double d = 40.2;
		int i = (byte) d;  //both explicit and implicit casting happening
		                   //explicit: double >byte
		                   //implicit: byte >int
		
		System.out.println(i);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
