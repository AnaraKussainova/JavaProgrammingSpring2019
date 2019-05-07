package day09_stringequals_conditionals;

public class StringEquals {

	public static void main(String[] args) {

		String str1 = "java";
		String str2 = "java";
		
		System.out.println(str1==str2);               //true
		System.out.println(str1 == "java");           //true
		System.out.println(str2=="Java");             //false
		
		
		//equals method. PREFFERED WAY
		
		System.out.println(str1.equals(str2));         //true
		System.out.println(str1.equals("java"));       //true
		System.out.println(str2.equals("Java"));         //false
				
  	/////////////////////////////////////////////////////////////////////	
		
		//String month = "March";
		String month = new String ( "March");
		String month2 = new String ("March");
		
		System.out.println(month==month2);     //FALSE
		
		//in the above line JAVA is not doing values comparison. It is just checking if 
		//month and month2 are pointing to same location in memory
		
		System.out.println(month.equals(month2));   // TRUE
			
		
		
		
		
		
		  
		
		
	}

}
