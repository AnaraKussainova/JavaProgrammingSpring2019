package day45_PracticeConstructor;
import java.util.*;
public class EtsyAccount {

	public EtsyAccount() {
		email = "";
		firstName = "";
		password = "";
	}
	
	public EtsyAccount(String email, String firstName, String password) {
		this.setEmail(email);
		setFirstName(firstName);
		setPassword( password);
	}
	
	public EtsyAccount(String email, String firstName) {
		setEmail(email);
		setFirstName(firstName);
		this.password =getRandomPassword();
	}
	
	private String getRandomPassword() {
		Random random = new Random();
		String letters = "abcdefghijklmanopqrstuvwxyz0123456789";
		String rdPassword = "";
		
		for (int i =1; i<=6; i++) {
			rdPassword+=letters.charAt(random.nextInt(letters.length()));
		}
		return rdPassword;
	}
	private String email;
	private String firstName;
	private String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		//if it contains @ somewhere in the middle. assign it 
		//if not print "Please enter a valid email address"
		
		
		if(email.indexOf("@") >0 && email.indexOf("@") !=email.length()-1) {
			this.email = email;

		}else {
			System.out.println("Please enter a valid email address");
		}
	}
	public String getFirstName() {
		
		return firstName;
	}
	public void setFirstName(String firstName) {
		//cant be blank
		//needs to be only alphabetic		
		
		if(isValidFirstName(firstName)) {
			this.firstName = firstName;
		}else {
			System.out.println("Your first name contains invalid characters.");

		}
	}
	/*
	 * valid->all letters, can have space in middle
	 * invalid -> cannot contain numbers or any other chars
	 */
	private boolean isValidFirstName(String firstName) {
		//check first if i starts with or ends with space , return false if true
		
		if(firstName.startsWith(" ") || firstName.endsWith(" ")) {
			return false;
		}
		
		if(firstName.isBlank()) {
			System.out.println("can not be blank");
			return false;
		}
		
		for(int i =0; i<firstName.length(); i++) {
			char ch = firstName.charAt(i);
			if (!Character.isAlphabetic(ch) && ch != ' ') {
				return false;
			}
		}
		
		return true;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(password.length() <6) {
			System.out.println("Must be 6 chars");
			this.password = " ";
		}else {
			this.password = password;

		}
	}

	
	
	public String toString() {
		return "EtsyAccount [email=" + email + ", firstName=" + firstName + ", password=" + password + "]";
	}
	
	
}
