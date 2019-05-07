package day20_ForLoops;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
//		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Enter number:");
//		
//		int num = scan.nextInt();
//		
//		
//		//check if it is valid. if its not return
//		
//		if (num<1 || num >10) {
//			System.out.println("Invalid number");
//			return;
//			//System.exit(0); stop execution same as return
//		} 
//		
//		for (int i = 1; i <=10; i ++) {
//			System.out.println(num + " x " + i + " = " + (num*i));
//			
//		}
		
		//////////////////////////////
		
		 Scanner scan = new Scanner(System.in);
		    int n = scan.nextInt();
		 int fac=1;
		    
		    
			 for (int  i = 1; i <=n; i ++) {
		        fac=fac*i;


				
		  }		

		  				System.out.println (fac);
		
		
		
		
		

	}

}
