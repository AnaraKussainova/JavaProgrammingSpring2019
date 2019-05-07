package day20_ForLoops;

public class PrintEachChar {

	public static void main(String[] args) {
		
		String word = "Wooden Spoon";
		//using for loop, print each char one by one
		
		for (int idx =0; idx<word.length(); idx++ ) {
			
			System.out.println(word.charAt(idx));
		}
		
		//using for loop print only vowel (a. e, o....)
		
		for (int idx =0; idx<word.length(); idx++ ) {
			char letter = word.toLowerCase().charAt(idx);
			if( letter  == 'a' || letter == 'o' || letter == 'i' || letter == 'u' || letter == 'e') {
				System.out.print(letter + ", ");
			}
		}
		System.out.println();
		//using for loop print only consonants (
		
		for (int idx =0; idx<word.length(); idx++ ) {
			char letter = word.toLowerCase().charAt(idx);
			if( !(letter  == 'a' || letter == 'o' || letter == 'i' || letter == 'u' || letter == 'e') ){
				System.out.print(letter + ", ");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
