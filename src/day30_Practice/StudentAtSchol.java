package day30_Practice;

public class StudentAtSchol {

	public static void main(String[] args) {
		
	study("HTML");	
	study("Java");
	sleep(5);
	}
	public static void study (String topic){
		System.out.println("Student is studying " + topic);
	}
	
	public static void sleep (int hours) {
		System.out.println("Student has been sleeping for " + hours + " hours");
	}
	
	
	
	
	
}
