package day45_PracticeConstructor;

import java.util.ArrayList;
import java.util.*;
public class Canvas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Course c1 = new Course();
		
		c1.setName("java");
		
		List<String> javaTeachers = new ArrayList<>();
		
		javaTeachers.add("Vasyl");
		javaTeachers.add("Murodil");
		javaTeachers.add("MArufjon");
		javaTeachers.add("Muhtar");
		
		c1.setTeachers(javaTeachers);
		System.out.println(c1.toString());
		
		
		List<String> javaStudents = new ArrayList<>();
		
		javaStudents.add("Anara");
		javaStudents.add("Tatyana");
		javaStudents.add("Prince");
		
		c1.setStudents(javaStudents);
		
		System.out.println(c1.toString());
		
		//addTeachers and addStudents method
		
		c1.addTeacher("MAria");
		c1.addStudent("Fuad");
		
		if(c1.getTeachers().contains("Maria")) {
			System.out.println("MAria is a teacher");
		}else {
			System.out.println("MAria is not a teacher");
		}
		
		if(c1.getStudents().contains("Fuad")) {
			System.out.println("Fuad is a student");
		}else {
			System.out.println("Fuad is not a student");
		}
		
		c1.removeTeacher("Muhtar");
		c1.removeStudent("Prince");
		
		if(c1.getTeachers().contains("Muhtar")) {
			System.out.println("Muhtar still a teacher");
		}else {
			System.out.println("Muhtar is not a teacher");
		}
		
		if(c1.getStudents().contains("Prince")) {
			System.out.println("Prince still a student");
		}else {
			System.out.println("Prince is not a student");
		}
		
		
		
		
		
		
		
		
		
	}

}
