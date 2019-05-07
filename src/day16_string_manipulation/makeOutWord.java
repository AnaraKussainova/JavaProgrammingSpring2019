package day16_string_manipulation;

public class makeOutWord {

	public static void main(String[] args) {

		String chars = "<<>>";
		String word = "java";
		String result;
		result = chars.substring(0,2)+word+chars.substring(2);
		System.out.println(result);
		
		/////////////////ExtraEnd
		
		String str = "java";
		String result1;
		if(str.length() == 2) {
			result1 = str + str+str;
		}else {
			result1 = str.substring(str.length() -2);
			result1 =result1+result1+result1;
		}
		
		System.out.println(result1);
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
