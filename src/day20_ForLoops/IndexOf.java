package day20_ForLoops;

public class IndexOf {

	public static void main(String[] args) {

		String word = "amazon";
		char letter = 'm';
		int index=-1;

		//for loop and look for the letter and if it is a match assign value to index and exit for loop and print value of index
		
		for (int i = 0; i< word.length(); i++) {
			if (word.charAt(i) == letter) {
				index=i;
				break;
			}
		}
		
		System.out.println("index: "+index);
		
		
		
	}

}
