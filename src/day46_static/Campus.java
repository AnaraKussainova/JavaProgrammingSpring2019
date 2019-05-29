package day46_static;

public class Campus {
	private String city;
	static String country;
	static {
		System.out.println("static block");
		country = "USA";
	}
	
	public Campus(String cit) {
		System.out.println("Constructor");
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public static void campusInfo() {
		System.out.println("Welcome to Campus");
	}
}
