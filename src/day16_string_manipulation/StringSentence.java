package day16_string_manipulation;

public class StringSentence {

	public static void main(String[] args) {

		String sentence = "I wrote [236] lines of code today";
		
		//print the number between []
		int start = sentence.indexOf('[')+1;
		int end = sentence.indexOf(']');
		String count = sentence.substring(start,end);
		System.out.println(count);
		
	    System.out.println(sentence.substring(sentence.indexOf('[')+1, sentence.indexOf(']')));
		
		// Check if count is more than 20
	    
	    int count2 = Integer.parseInt(count);
		
		if (count2 >20) {
			System.out.println("Wrote more that 20 lines of code Today!");
		}else {
			System.out.println("Not enough coding for today");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
