package day48_inheritance01;

public class Company {
	public static void main (String [] args) {
	Employee em1 = new Employee();
	
	em1.name = "Maruf";
	em1.jobTitle = "teacher";
	em1.age = 22;
	
	Employee em2 = new Employee();
	em2.name = "Kiki";
	em2.age = 26;
	em2.jobTitle = "HR";
	 
	em1.work();
	em2.work();
	
	em1.eat("salad");
	em2.eat("kebab");
	
	
	
	
	
	}
}
