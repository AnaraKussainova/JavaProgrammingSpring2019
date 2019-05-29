package day40_CustomClassesAndMethods;

public class MyEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee empl1 = new Employee();
		empl1.name = "Zinoviy Fradlin";
		empl1.jobTitle = "teacher";
		empl1.salary = 123.23;
		
		empl1.work();
		empl1.goToBreak();
		empl1.attendMeeting();
		empl1.introduce();
	}

}
