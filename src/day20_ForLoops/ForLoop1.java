package day20_ForLoops;

public class ForLoop1 {

	public static void main(String[] args) {
		// using for loop print "love Java!" 10 times
		for (int i=1; i<=10; i++) {
			System.out.println("Love Java!");
		}
	
	//////////////////
		
		
		//print numbers from 5 to 10
		
		for (int j=5; j <=15; j++) {
			System.out.print (j + " ");
		}
	///////////////////
		System.out.println();
		
		//for loop print 20 -10
		
		for ( int num =20; num >=10; num=num-2) {
		System.out.print( num + " ");
		}
		
		////////////////////
		System.out.println();
		for (int d = 1; d<=100; d++) {
			if(d %2!=0) {
				System.out.print(d +" ");
			}
		}
		
		/////////////sumOfOdds, sunOfEvens - calcualte them and print out after the loop . sum of 1-10
		System.out.println();
		
		int sumOfOdds = 0;
		int sumOfEvens = 0;
		
		for ( int num1=1; num1 <=100; num1++) {
			if (num1 % 2 ==0) {
				sumOfEvens += num1;
			}else {
				sumOfOdds += num1;
			}
		}
		
		
		System.out.println("Sum pf Evens "+sumOfEvens +  " ");
		System.out.println("Sum of Odds " +sumOfOdds+ " ");
/////////////////////////////////////
		
		System.out.println();
		
		//////////////
		
		//for loop 1-7 week days
		
		for (int day = 1; day <=7; day++) {
			switch(day) {
			
			case 1:
				System.out.println(day + " - Monday");
				break;
			case 2:
				System.out.println(day + " - Tuesday");
				break;
			case 3:
				System.out.println(day +" - Wednesday");
				break;
			case 4:
				System.out.println(day + " - Thursday");
				break;
			case 5:
				System.out.println(day +" - Friday");
				break;
			case 6:
				System.out.println(day + " - Saturday");
				break;
			case 7:
				System.out.println(day +" - Sunday");
				break;
			default:
				System.out.println("Invalid day");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
