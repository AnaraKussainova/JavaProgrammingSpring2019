package day23_Array;

public class LoopThroughTheNumbers {

	public static void main(String[] args) {
		// loop through the numbers 1 to 100. print each number in the same line
		//if number is divisible by 5 (n%5==0), skip it
		//if numbers is divisible by 20, then exit the loop
		
		for (int i =1; i<=100; i++ ) {
			if((i%5 == 0) && (i%20 !=0)) {
				continue;
			}	
			if (i%20 == 0) {
				break;
			}
			System.out.print(i + ", ");
			}
		
		System.out.println("##############");
		
		//outer loop
		
		for (int j = 1; j<=2; j++) {
			for ( int m=1; m <= 10;m ++) {
				System.out.println(m + ", ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		}

	}


