package day52_inheritance05;

public class FinalVariables {
	
	public final int ROADSTER_MAX_RANGE=610;
	
	public final int MODEL_3_MAX_SPEED;
	
	public final int MODEL_X_PASSENGERS;
	
	public static final String COMPANY_NAME = "Cybertek";
	
	public static final String ADMIN_USERNAME;
	
	static {
		ADMIN_USERNAME = "admin@gmail.com";
	}
	
	public FinalVariables(){
		MODEL_3_MAX_SPEED = 180;
		//ADMIN_USERNAME = "admin"; not compiling because that means you be able to access var only after you create and object
	}
	
	{
		MODEL_X_PASSENGERS = 7;            //init block
	}
	
	public static void main(String[]args) {
		final int MAX_PASSENGERS_COUNT = 5;
		
		//MAX_PASSENGERS_COUNT =10;
		
		System.out.println(MAX_PASSENGERS_COUNT);
		
		final int SSN;
		SSN = 314569843;
		
		//SSN++; is not possible
		
		//HOW TO PRINT FINAL VARS
		//main method unable to access static vars
		
		FinalVariables f1 = new FinalVariables();
		System.out.println("MAx range " + f1.ROADSTER_MAX_RANGE);
		
		System.out.println("Max speed " + f1.MODEL_3_MAX_SPEED);
		
		System.out.println("Max passengers " + f1.MODEL_X_PASSENGERS);
		
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println("Comapny name " + COMPANY_NAME);
		System.out.println("Company name " + f1.COMPANY_NAME);
		
		System.out.println("Admin " + ADMIN_USERNAME);
		System.out.println("Admin " + f1.ADMIN_USERNAME);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
