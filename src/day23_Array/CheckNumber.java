package day23_Array;

public class CheckNumber {

	public static void main(String[] args) {
	
		for (int i =1; i <=100; i++) {
			if ( i%5>0) {
			continue;
			}
			System.out.println("Number " + i);
		}	
		
		/////////////print numbers from 1 to 20, and skip numbers that are in the range from 5 to 10
		
		for (int j = 1; j <=20; j++) {
			if (j >=5 && j<=10) 
				continue;
				System.out.println(j);
		
		}
	
	}

}
