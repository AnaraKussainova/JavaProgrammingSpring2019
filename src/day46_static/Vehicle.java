package day46_static;

public class Vehicle {

	String type;  //non static. INstance var, every object has its own type
	static int numOfVehicles; //shared, one central value or static var
	
	public static void vehicleInfo() {
		//System.out.println("type: " + type); wont work. type is non static
		System.out.println("number of vehicles " + numOfVehicles);
		int count = getNumberOfVehicles();
		String make  = "Kia";
		make = make.toUpperCase();
		System.out.println("make: " +make);
		//System.out.println(toString()); wont work => can not call non-static method
		Vehicle vh = new Vehicle(); //local object
		vh.toString();
	}
	
	public static int getNumberOfVehicles() {
		return numOfVehicles;
		
	}
	
	public String toString() {
		return "Vehicle type: " + type + " |  " + numOfVehicles;
	}
}
