package day08_casting_conditionalas;

public class CastingPrimitives {

	public static void main(String[] args) {
		// cast double value to int
		int i = (int) 3.4; //will remove .4
		System.out.println(i);
		
		double price = 230.50;
		int dollars = (int) price;
		System.out.println(dollars);
		
		//whole numbers. byte, short, int
		
		int count = 15;
		byte byteCode =(byte) count;
		System.out.println (byteCode);
		
		long longValue = 345645L;
		int intValue = (int) longValue;
		System.out.println(intValue);
		
		int large = 5678;
		short small = (short) large;
		System.out.println(small);
		
		int result =(int)  (500.4 /2.0);
		System.out.println(result);
		
		byte b = 123;
		int k= b;  // it will automatically cast it. no need to put (int) since byte is smaller
		System.out.println(k);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
