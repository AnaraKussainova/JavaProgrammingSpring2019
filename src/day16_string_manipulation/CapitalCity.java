package day16_string_manipulation;

public class CapitalCity {

	public static void main(String[] args) {
		
		String str = "Moscow is a capital of Russia";
		
		//Baku, Azerbaijan
		
		String str1= str.replace("Moscow","Baku");
		
		System.out.println(str1);
		
		str1 = str1.replace(" Russia", " Azerbaijan");
		
		System.out.println(str1);
		
		String email = "firstName_LastName@gmail.com";
		String company ="deloitte";
		email = email.replace("gmail",company);
		
		System.out.println(email);
		
		
		
		
		
		
		
		
		
		
	}

}
