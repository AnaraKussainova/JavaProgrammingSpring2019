package day21_Practice;

public class ConverChartoString {

	public static void main(String[] args) {

		char ch = 'a';
		//String str1 = ch;   	WONT WORK BECAUSE CH IS CHAR AND WE TRYING TO PUT IJN STRING
		
		String str1 = ""+ch;
		
		char ch2 = 'v';
		String str2 = Character.toString(ch2);
		
		System.out.println(str1);
		System.out.println(str2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
