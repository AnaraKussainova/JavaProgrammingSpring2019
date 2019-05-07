package day10_logicaloperators_conditionals;

public class IfStatementWithBooleanVariables {

	public static void main(String[] args) {

		boolean isBreakTime = false;
		if (isBreakTime == true) {
			System.out.println("BREAK TILL 8:35 PM");
		} else {
			System.out.println("Not a Break time yet.");
		}
				
	/////////////////////////SECOND VERSION
		
		if (isBreakTime) {
			System.out.println("BREAK TILL 8:35 PM");
		} else {
			System.out.println("Not a Break time yet.");
		}
		
		
		boolean classTime = true;
		if(classTime) {
			System.out.println("Stop talking");
			System.out.println("Pay attention");
			System.out.println("Code and have fun!");
		}else {
			System.out.println("Take a walk and have some water.");
		}
		
		
		boolean qualified = false;
		// send message only if not qualifies
		// we need to check if qualified variable contains FALSE
		
		if ( qualified  ==false) {
			System.out.println("Your applicaion was not approved. Good luck!");
		}
		
		
		
		
		
		boolean isNiceWeather = true;
		if (!isNiceWeather) {
		System.out.println("Dont go out for running");	
		}else {
			System.out.println("Lets go out for running");
		}
		
		
		
		
		
		boolean found = false;
		if(!found) {
		//go to each page and look for that name:
		//if it finds the name set found true	
		
		}else {
			System.out.println("Error: The person not found");
		}
		
		
		
	///////////////////////
		double price = 100.0;
				
				boolean b = (price>200.0); // false
		      	boolean b2 = !(price>200.0); // true
		
		
		      	
		      	
		      	
		      	
		      	
		      	
		      	
		      	
		      	
		      	
		      	
		      	
		      	
		      	
		      	
		      	
		      	
		      	
		      	
		      	
		      	
		      	
		
		
	}

}
