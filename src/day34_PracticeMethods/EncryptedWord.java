package day34_PracticeMethods;

public class EncryptedWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		
		String word = "easter";
		
		char first = word.charAt(0); //'e'
		int position = alphabet.indexOf(first);
		System.out.println("position: " + position);
		
		char enChar = encrypted.charAt(position);
		System.out.println(first + "--->" + enChar);
		String encryptedWord="";
		for (int i = 0; i<word.length(); i++) {
			char ch = word.charAt(i);
			//find in alphabet
			int index = alphabet.indexOf(ch);
			encryptedWord+=encrypted.charAt(index);
		}
		
		System.out.println(word);
		System.out.println(encryptedWord);
		
		
		
		
		
	}

}
