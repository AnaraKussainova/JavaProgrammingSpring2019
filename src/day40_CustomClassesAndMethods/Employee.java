package day40_CustomClassesAndMethods;

public class Employee {

	public String name; //public means it can use anywhere in project
	public String jobTitle;
	public double salary;
	
	public void work() {
		System.out.println(name + " starts work at 7AM");
	}
	public void goToBreak() {
		System.out.println(name + " goes to break at 11.30 AM");
	}
	public void attendMeeting () {
		System.out.println(name + " attends meeting at 1PM");
	}
	public void introduce() {
		System.out.println("Name [" + name + "]" + "jobTitle [" + jobTitle + "] " + "salary [" + salary+"]") ;
	}
}
