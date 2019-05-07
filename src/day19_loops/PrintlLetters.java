package day19_loops;

public class PrintlLetters {

	public static void main(String[] args) {

		String word = "Amazon";
		//print each character one by one in separate lines
		
		//int idx = 0;
		//System.out.println(word.charAt(idx));
		
		//System.out.println(word.charAt(idx));
		
		//while (idx<word.length()) {
		//	System.out.println(word.charAt(idx));
		//	idx++;
		//}
		////////////////////////
			
		int idx2 = word.length()-1;
		
		while ( idx2 >= 0) {
			System.out.println(word.charAt(idx2));
			idx2 --;
		}
		
		
		
		
		
		
		
		
		
		
	}

}
