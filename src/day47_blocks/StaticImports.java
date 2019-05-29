package day47_blocks;
import static java.lang.Math.*;
import static java.lang.Character.*;
import static java.util.Arrays.sort;
import java.util.Arrays;
import static java.time.LocalDateTime.now;
public class StaticImports {

	public static void main(String[] args) {
		System.out.println(PI);

		System.out.println(max(10,5));
		
		System.out.println(min(10,100));
		System.out.println(floor(3.45));
		System.out.println(round(123.999));
		System.out.println(abs(-10));
		System.out.println(pow(10,5.2));
		System.out.println(sqrt(5));
		
		System.out.println("#############");
		System.out.println(isDigit('4'));
		
		System.out.println(isAlphabetic('g'));
		
		
		int[] nums = {3,23,89,6};
		sort(nums);
		System.out.println(Arrays.toString(nums));
		
		System.out.println(now());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
