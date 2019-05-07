package day15_string_manipulation;

public class StartsEndsWith {

	public static void main(String[] args) {

		String word1= "eclipse";
		
		//startsWith tests if string starts with another 
		System.out.println(word1.startsWith("e"));
		
		System.out.println(word1.startsWith("ec"));
		
		System.out.println(word1.startsWith("ecli"));
		
		System.out.println(word1.startsWith("Ec"));    //false
		
		System.out.println(word1.endsWith("e"));
		
		System.out.println(word1.endsWith("ipse"));
		
		System.out.println(word1.endsWith("java")); // false
		
		//"PSE"
		
		System.out.println(word1.toUpperCase().endsWith("PSE"));    //true
		
		// Mr.==male Mrs == married woman . Ms== single woman Dr. == doctor  
		// Unknown status
		String name = "Mr. Jackson";
		
		if(name.startsWith("Mr")) {
			System.out.println("male");
		}else if(name.startsWith("Mrs")) {
			System.out.println("married woman");
		}else if (name.startsWith("Ms")) {
			System.out.println("single woman");
		}else if(name.startsWith ("Dr")) {
			System.out.println("doctor");
		}else {
		System.out.println("Error");
		}
		
		
		
		
	
		
		
		
		
		
		
		
	}

}
