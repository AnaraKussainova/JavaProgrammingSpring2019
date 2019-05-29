package day40_CustomClassesAndMethods;

public class MyContacts {

	public static void main(String[] args) {

		//create Contact object
		
		Contact contact1 = new Contact();
		contact1.name = "Anara Kussainova";
		contact1.phoneNumber = "443-470-0747";
		contact1.email = "usnora89@gmail.com";
		
		contact1.call();
		contact1.sendMessage();
		contact1.sendEmail();
		
		Contact contact2 = new Contact();
		contact2.name = "Tatyana Kim";
		contact2.name = "66-388-3379";
		contact2.email = "tkim@mail.ru";
		
		contact2.call();
		contact2.sendMessage();
		contact2.sendEmail();
	}

}
