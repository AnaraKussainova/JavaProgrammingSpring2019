package day48_inheritance01;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person();
		Student st = new Student();
		
		p.name = "Anara";
		p.age = 29;
		p.gender = 'F';
		
		st.name = "Tatyana";
		st.age = 30;
		st.gender = 'F';
		
		p.eat("steak");
		
		st.eat("burger");
		
		Student st2 = new Student();
		
		st2.name = "Orhan";
		st2.age = 40;
		st2.gender = 'M' ;
		st2.studentID = 4040;
		st2.clazz = "Agile Scrum";
		
		st.studentID = 4545;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
