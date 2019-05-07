package day16_string_manipulation;

public class ReplaceThem {

	public static void main(String[] args) {
		
		String sentence = "Coding is fun, it is my hobby!";
		
		String withNoSpaces = sentence.replace(" ","");
		
		System.out.println(withNoSpaces);
		
		String exclamation = sentence.replace(",","!");
		
		System.out.println(exclamation);
		
		String mixed = "^*)&*()ja-v%a*#@$%^&*(";
		
		//cleanup mixed
		
		mixed = mixed.replace("^*)&*()", "");
		System.out.println(mixed);
		
		mixed = mixed.replace("*#@$%^&*(", "");
		System.out.println(mixed);
		
		mixed = mixed.replace("-","").replace("%","");
		
		System.out.println(mixed);
		
		/////////////
		
		String result = "About 115,000,000 results (0.59 seconds)";
		
		//using replace, get number of results 115,000,000
		
		result = result.replace("About ", "");
		//result = result.replace(" results (0.59 seconds)", "");
				
		result = result.substring(0, result.indexOf(" "));
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
	}

}
