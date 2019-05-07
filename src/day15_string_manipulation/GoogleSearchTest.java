package day15_string_manipulation;

public class GoogleSearchTest {

	public static void main(String[] args) {

		String word = "eclipse";
		
		System.out.println(word.startsWith("e"));  //TRUE
		System.out.println(word.startsWith("ec")); //TRUE
		System.out.println(word.endsWith("se"));   //TRUE
		System.out.println(word.endsWith("java")); //FALSE
		System.out.println(word.toUpperCase().endsWith("PSE")); // TRUE
		System.out.println("#########");
		
		
		
		String item = "java";
		String pageTitle = item + " - Google Search";
		
		//test if pageTitle starts with item
		
		if (pageTitle.startsWith("java")) {
			System.out.println("Page title starts with " + item);
		}else {
			System.out.println(" Word " + item + " wasnt found");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
