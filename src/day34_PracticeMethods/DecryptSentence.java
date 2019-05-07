package day34_PracticeMethods;

public class DecryptSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(decryptSentence("gszmp blf"));
	}
	public static char decryptChar(char ch ) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		
		int i = encrypted.indexOf(ch);
		char ret = alphabet.charAt(i);
		return ret;
	}
	
	public static String decryptWord (String word) {
		
		String cyphered = "";
		
		for (int i =0; i<word.length(); i++) {
			cyphered += decryptChar(word.charAt(i));
		}
		return cyphered;
	}
	
	public static String decryptSentence(String sentence) {
		
		String backSentence = "";
		String [] myArray=	sentence.split(" ");
				
			for (String word : myArray) {
				backSentence += decryptWord(word) + " ";
			}
		return backSentence.trim();
	
}
}