package day24_PracticeArray;

public class ArrayOfChars {

	public static void main(String[] args) {


		char[] values = {'a', 'b', 'c'};
		for (char value: values) {
			System.out.println(value);
		}
		
		String str = "Wooden spoon";
		char [] chars = str.toCharArray();   //this method converts string into array of characters
		
		for (char c: chars) {
			System.out.print (c);
		}
		System.out.println();
		str = "";
		for (int i = chars.length -1;  i >= 0; i--) {
			str += chars[i];
		}
		
		System.out.print(str);
		System.out.println();
		System.out.println("###########################################");
		
		//print characters with help of array of characters one by one 
		//if character is equals to 'o', replace with *
		
		for (char c: chars) {
			if (c == 'o') {
				System.out.print("*");
			}else {
				System.out.print(c);
			}
		}
		
		
		
	}

}
