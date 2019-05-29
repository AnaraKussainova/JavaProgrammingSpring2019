package day52_inheritance05;

public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c1 = new Computer("iMac", "silver");
		
		Computer c2 = new Computer("iMac", "silver");
		
		Computer c3 = c2;  //pointing to same object
		//false true
		System.out.println(c1 == c2);//false because pointing to different objects
		System.out.println(c1.equals(c2));//true because data of both are same
		
		//true true
		System.out.println(c3 == c2);
		System.out.println(c3.equals(c2));
		
		
	}

}
