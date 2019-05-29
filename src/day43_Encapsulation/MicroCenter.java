package day43_Encapsulation;

public class MicroCenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer c1 = new Computer();
		
		Computer c2 = new Computer();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		c1.setBrand("Asus");
		c1.setOs("Windows");
		c1.setPrice(500);
		
		c2.setBrand("Lenux");
		c2.setOs("Windws");
		c2.setPrice(320);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		Computer c3 = new Computer("Sony", "Windows", 750);
		System.out.println(c3.toString());
	}
	
	

}
