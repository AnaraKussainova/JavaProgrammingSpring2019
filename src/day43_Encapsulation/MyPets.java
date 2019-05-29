package day43_Encapsulation;

public class MyPets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet p1 = new Pet("dog", "Poochii");
		Pet p2 = new Pet ("cat", "Barsik");
		Pet p3 = new Pet("fish", "Purple");
		Pet p4 = new Pet("goat", "Kozlik");
		Pet p5 = new Pet("Bird", "Mina");
		
		p1.speak();
		p2.speak();
		p3.speak();
		p4.speak();
		p5.speak();

		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		System.out.println(p5.toString());

		
		
	}

}
