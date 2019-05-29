package day49_002_2;
import day49_inheritance002.Device;
public class IPad  extends Device{
//Ipad IS-A Device --> IPAD is a subclass in different package	
	public void readEbook(String title) {
		
		System.out.println("Reading a book " + title + " using " + brand + " ipad");
		System.out.println("Model " + model);
		//System.out.println("Price " + price); not inherited , not visible
		//System.out.println("Made in " + country); not visible
	}
	
	
}
