package day26_Practice;

import java.util.Arrays;

public class SPLIT {

	public static void main(String[] args) {

		String words = "java,kava,html,selenium";
		
		String [] wordsArray = words.split(",");
		
		System.out.println("Count: "+ wordsArray.length);
		
		System.out.println(wordsArray[0]);
		
		System.out.println(Arrays.deepToString(wordsArray));
		
		for (String word : wordsArray) {
			System.out.println(word);
		}
		
		String diceResult = "1 - 20 of 1,461 positions";
		
		//using split method, print 1,461
		
		String [] diceArray = diceResult.split(" ");
		System.out.println(Arrays.deepToString(diceArray));
		System.out.println(diceArray[4]);
		
		String[] diceArray2 = diceResult.split("of");
		System.out.println(Arrays.deepToString(diceArray2));
		System.out.println(diceArray2[0]);
		System.out.println(diceArray2[1]);

		
		System.out.println("###########################");
		
		String sentence ="I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
		
		String [] allWords = sentence.split(" ");
		String[] happySplit = sentence.split("happy");
		String [] iSplit = sentence.split("I");
		
		System.out.println(Arrays.deepToString(allWords));
		System.out.println(Arrays.deepToString(happySplit));
		System.out.println(Arrays.deepToString(iSplit));

		for ( String w : allWords) {
			System.out.println(w);
		}
		
		for (String w1 : happySplit) {
			System.out.println(w1);
		}
		
		for (String w2 : iSplit) {
			System.out.println(w2);
		}
		
		
		System.out.println("###########################");

		
		String word = "java";
		char [] charsArray = word.toCharArray();
				
		for (char ch : charsArray) {
			System.out.println(ch);
		}
		
		
		
		
	}

}
