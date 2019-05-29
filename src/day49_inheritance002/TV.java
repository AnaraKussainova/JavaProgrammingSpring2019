package day49_inheritance002;
//TV is a subclass that is in the same package
public class TV extends Device {
	
	public void watch() {
		System.out.println("Watching TV - " + brand + " model " + model) ;
		System.out.println("Price " + price);
		
		//System.out.println("Made in " + country); not visible
	}
}
