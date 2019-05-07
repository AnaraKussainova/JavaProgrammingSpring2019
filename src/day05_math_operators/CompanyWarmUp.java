package day05_math_operators;

public class CompanyWarmUp {
	
	public static void main (String []args) {
		
		String companyName;
		String address;
		int numberOfEmployees;
		long revenue;
		boolean isTechCompany;
		
		
		companyName = "Facebook";
		address = "Silicon Valley, CA";
		numberOfEmployees = 10000;
		revenue = 4000000l;
		isTechCompany = true;
		
		System.out.println ("Company name is " + companyName);
		System.out.println ( "Address is "+ address);
		System.out.println ( "Number of employees is "+ numberOfEmployees);
		System.out.println ( "Revenue is " + revenue);
		System.out.println ( "Is it tech company? - " + isTechCompany);
		
		
		String aboutCompany;
		
		aboutCompany = "Company " + companyName + " is a tech company in " + address +  "\n   that has " + numberOfEmployees +  " employees.";
		
		System.out.println(aboutCompany );
		
		
		
		
	}
	
	
	
	
	
	
	

}
