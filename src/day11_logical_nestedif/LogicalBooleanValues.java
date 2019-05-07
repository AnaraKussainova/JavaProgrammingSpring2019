package day11_logical_nestedif;

public class LogicalBooleanValues {

	public static void main(String[] args) {

		boolean b1 = 5 >10 && 10 >100;
		
		System.out.println("B1 " + b1);
		
		boolean b2 = 'a' == 'a' && 123 >120;
		
		System.out.println("B2 " + b2);
		
		boolean b3 = true && 10 >= 10 && 1000 <= 900;
		
		System.out.println("B3 " + b3);
		
		boolean b4 = false && false && 10 == 10;
		System.out.println("B4 " + b4);
		
		boolean b5 = false && true && 10 == 10;
		System.out.println("B5 " + b5);
		
		boolean b6 = false  || true && 10 == 10;
		System.out.println("B6 " + b6);
		
		boolean b7 = false  && true  ||10 == 10;
		System.out.println("B7 " + b7);
		
		boolean b8 = false  && (true  ||10 != 10);
		System.out.println("B8 " + b8);
		
		boolean b9 = true  && true  ||10 != 10;
		System.out.println("B9 " + b9);
		
		boolean topicDone = true;
		boolean ismoreThan3PM = true;
		boolean everythingIsClear = true||false; //true
		
		                                 //true             //true
		boolean letsGoForABreak = topicDone && ismoreThan3PM && everythingIsClear;
		System.out.println("lets go for a break " + letsGoForABreak);
		
		boolean b10 = !(true || false) && true;
		
		System.out.println("B10 " + b10);
		
		boolean b11 = !true || true && false;
		System.out.println("B11 " + b11);
		
		//////////////////////////////////////
		
		boolean b12 = true;
		System.out.println(!!!!!b12);// reversing boolean from right to left
		
		
		
		
		
		
		
		
	}

}
