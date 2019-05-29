package day45_PracticeConstructor;

public class EtsyDotCome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EtsyAccount e1 = new EtsyAccount(); 
		System.out.println(e1.toString());
		
		e1.setEmail("anara@mail.ru");
		e1.setFirstName("anara");
		e1.setPassword("123456");
		
		System.out.println(e1.toString());
		
		EtsyAccount e2 = new EtsyAccount();
		
		e2.setEmail("@anara.com");
		e2.setFirstName("123");
		e2.setPassword("102");
		
		System.out.println(e2.toString());
		
		EtsyAccount e3 = new EtsyAccount("ak@gov.ru", "anara", "123456");
		System.out.println(e3.toString());
		
		EtsyAccount e4 = new EtsyAccount("ugalya@gmail.com", "Galya") ;
		
		System.out.println(e4.toString());
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
