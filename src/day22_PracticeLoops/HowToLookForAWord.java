package day22_PracticeLoops;

public class HowToLookForAWord {

	public static void main(String[] args) {

		
		String sentence = "He  said hi, then she replied hi. They replied hi";
		int count = 0;
		String twoLetters="";
		// look for hi in the sentence and print the count
		//print letters in pairs
		//check if twoLetters equals hi, if yes add 1 to count

		
		for (int i =0; i <sentence.length()-1; i++) {
			twoLetters = sentence.substring(i, i+2);
			System.out.println(twoLetters);   //also word.substring(j, j+1);
			if(twoLetters.equals("hi")) {
				count ++;
			}
		}
		System.out.println("Count of " + twoLetters + " is: " + count);
		
		
	}

}
