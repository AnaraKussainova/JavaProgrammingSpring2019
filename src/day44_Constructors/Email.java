package day44_Constructors;

public class Email {
	private String message;
	public Email(String message) {
		System.out.println("Sending email with message: " + message);
		this.message = message;
	}

}
