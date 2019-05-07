package day34_PracticeMethods;
import java.util.Arrays;
import java.util.Random; 
public class RandomArrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(getRandomArray(5)));
		
		 printWords("grey", "blue", "yellow");
		System.out.println( sum(5, 6, 3));
		
		int budget = 200;
		
		if (sum(10, 45, 110, 30 ) <= budget) {
			System.out.println("Within budget :))))))))))");
		}else {
			System.out.println("Shopping can not be done yet. Need more finance");
		}
		
		int total = sum (234, 43, 567, 12, 34,5);
		System.out.println("Total: " + total);
		
		
	}

	public static int [] getRandomArray(int size) {
		
		Random random = new Random ();
		int [] myArray = new int [size];
		
		for ( int i = 0; i<size; i++) {
			myArray[i]= random.nextInt(101);
		}
		
		
		return myArray;
	}
	
	public static void printWords (String... words) {
		for (String w: words) {
			System.out.println(w);
		}
	}
	
	public static int sum (int... nums) {
		int sum =0;
		for (int n : nums) {
			sum += n;
		}
		return sum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
