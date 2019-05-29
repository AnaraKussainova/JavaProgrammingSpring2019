package day46_static;

public class Customer {

	private String name;
	private String email;
	
	static int count; //shared by everyone //all objects
					 //one central copy of this variable	
	
	public Customer() {
		this.name = "undefined";
		this.email = "undefined";
		count++;
	}
	
	public Customer (String name, String email) {
		this.name = name;
		this.email = email;
		count++;
	}
	public String getName() {
		return name;
	}
	public void setName(String anme) {
		this.name = anme;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}
	
}
