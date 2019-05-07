package day27_Practice;

import java.util.Arrays;

public class CanvasCourses {

	public static void main(String[] args) {


		String url = "https://learn.cybertekschool.com/courses/149";
		
		//split by / and get last value from array
		//convert into Int=>Integer.parseInt(...) =>int value
		//switch statemnet and find course
		
		String[] urlArray =url.split("/");
		System.out.println("Length: " + urlArray.length);
		
		System.out.println(Arrays.toString(urlArray));
		
		System.out.println(urlArray [urlArray.length-1] );
		
		int courseID = Integer.parseInt(urlArray[urlArray.length-1]);
		
		switch(courseID) {
		case 147:
			System.out.println("Java Programming");
			break;
		case 204:
			System.out.println("Mentoring Sessions");
			break;
		case 143:
			System.out.println("Wecome Kit");
			break;
		case 149:
			System.out.println("SDLC");
			break;
		default:
			System.out.println("Invalid course ID");
		
		}
		
		System.out.println("##############");
		
		String[] tool = {"Java", "Selenium", "JUnit", "Cucumber", "Git", "Maven"};
		
		for (int i =0; i<tool.length-1; i++) {
			if(tool[i].contentEquals("Java")){
				System.out.println(tool[i] + " programming laguage");				
		}else if(tool[i].contentEquals("Selenium")) {
			System.out.println(tool[i]+" test automaion");
		}else if(tool[i].contentEquals("JUnit")) {
			System.out.println(tool[i]+" unit testing");
		}else if (tool[i].contentEquals("Cucumber")) {
			System.out.println(tool[i] + " BDD Style testing");
		}else if(tool[i].contentEquals("Git")) {
			System.out.println(tool[i] + " version control");
		}else if(tool[i].contentEquals("Maven")) {
			System.out.println(tool[i] + " Building and execution for project");
		}else {
			System.out.println("Unknown tool");
		}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
