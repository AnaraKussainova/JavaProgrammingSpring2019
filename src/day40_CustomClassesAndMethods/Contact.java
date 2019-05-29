package day40_CustomClassesAndMethods;

public class Contact {

	String name;
	String phoneNumber;
	String email;
	
	public void call () {
		System.out.println("Calling " + name + " >>>>>>>>>");
	}
	public void sendMessage() {
		System.out.println("Sending message to " + name +" " + phoneNumber + ">>>>>>>>");
	}
	public void sendEmail() {
		System.out.println("Emailing to " + name +" " + email);
	}
	}


