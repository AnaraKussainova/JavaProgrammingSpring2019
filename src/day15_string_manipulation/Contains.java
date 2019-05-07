package day15_string_manipulation;

public class Contains {

	public static void main(String[] args) {

		String email = "test@gmail.com";
		
		System.out.println(email.contains("@"));
		
		String list = "potatoes, apples, tomatoes, eggs, milk, bread, meat";
		
		//check if apples is in the shopping list
		
		//true == Apples are there
		//false == Lets add apples now
		
		if(list.contains("apples")) {
		System.out.println("Apples are there");
		}else {
			System.out.println(" Lets add apples now");
		}
		
		boolean hasEggs=list.contains("eggs");
		
		System.out.println("Contains eggs: "+ hasEggs);
		
		boolean hasCucumbers = list.toLowerCase().contains("cucumbers");
		System.out.println("Contains cucmbers: " + hasCucumbers);
		

		email = "name@yahoo.com";
		
		if(email.contains("yahoo")) {
			System.out.println("It is yahoo account");
		}else if (email.contains("gmail")) {
			System.out.println("It is gmail account");
		}else if (email.contains("hotmail")) {
			System.out.println("It is hotmail account");
		}
		
		String etsyTitle = "Wooden spoon | Etsy";
		
		if (etsyTitle.contains(" | ")) {
			System.out.println("Pipe is there as expected");
		}else {
			System.out.println("Pipe is not detected");
		}
		
		
		//Assign your name and check it contains "a" or "e"
		
		String firstName = "Anara";
		if(firstName.contains("a") || firstName.contains("e")) {
			System.out.println("Your name contains \"a\" or \"b\"");
		}else {
			System.out.println("No \"a\" or \"e\" letters");
		}
		
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
