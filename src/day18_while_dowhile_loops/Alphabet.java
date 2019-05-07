package day18_while_dowhile_loops;

public class Alphabet {

	public static void main(String[] args) {

		char letter = 'a';
		System.out.println(letter);
		
	/*	letter++;
		System.out.println(letter);
		
		letter++;
		System.out.println(letter);
	*/	
		
		while (letter<='z') {
			System.out.print(letter + " ");
			letter++;
		}
		System.out.println();
		char capitals = 'A';
		while (capitals <= 'Z'){
			System.out.print(capitals + " ");
			capitals++;
		}
		
		System.out.println();
		
		char reverse = 'z';
		while (reverse>='a') {
			System.out.print(reverse +" ");
			reverse--;
		}
		System.out.println();
		
		String letters ="";
		char myLetter = 'A';
		letters = letters + 'A';
		System.out.println(letters);
		
		letters = letters + 'B';
        System.out.println(letters);
		
		
		while (myLetter <='Z') {
			letters = letters + myLetter;
			System.out.println(letters);
			myLetter++;
		}
		
		
		
	}

}
