package day48_inheritance01;

public class Student extends Person{
	
	int studentID;
	String clazz;
	
	public void code(String lang) {
		System.out.println(name + " is codint " + lang);
	}
	
	public void attendClasses() {
		System.out.println(name + " is attending " + clazz + " class");
	}
}
