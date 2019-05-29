package day46_static;

public class Ebay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer e1 = new Customer("Anara", "akm@gmail.com");
		Customer e2 = new Customer("Tatyana", "tat@mail.ru");
		Customer e3 = new Customer("Zarina", "zar@hotmail.com");
		
		System.out.println(e3.count);
		System.out.println(Customer.count);
		
		Customer e4 = new Customer("Ronald", "ro@gmail.com");
		
		System.out.println("Total customer: " + Customer.count);
		
		e1.count =10;
		
		System.out.println(e3.count);
		System.out.println(Customer.count);
	}

}
