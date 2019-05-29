package day49_002_2;
//Non-sub class in different package
import day49_inheritance002.Device;
public class OverSeasFactory {
//Non-sub class in different package
	public static void main (String [] args) {
		Device d2 = new Device();
		
		d2.brand = "Samsung";
		
		// d2.model "3300";   PROTECTED
		//d2.price = 10.02; not visible
	//	d2.country = "Kazakhstan"; not visible
	}
}
