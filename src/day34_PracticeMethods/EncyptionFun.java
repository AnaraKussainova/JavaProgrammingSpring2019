package day34_PracticeMethods;

public class EncyptionFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(encryptChar('k'));
		System.out.println(encryptWord("running"));
		System.out.println(encryptSentence("java is fun"));
	}

	public static char encryptChar(char ch ) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		
		//encrypted.charAt(alphabet.indexOf(ch));
		int i = alphabet.indexOf(ch);
		char ret = encrypted.charAt(i);
		return ret;
	}
	
	public static String encryptWord (String word) {
		
		String cyphered = "";
		
		for (int i =0; i<word.length(); i++) {
			cyphered += encryptChar(word.charAt(i));
		}
		return cyphered;
	}
	
	public static String encryptSentence(String sentence) {
		
		String backSentence = "";
		String [] myArray=	sentence.split(" ");
				
			for (String word : myArray) {
				backSentence += encryptWord(word) + " ";
			}
		return backSentence.trim();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
