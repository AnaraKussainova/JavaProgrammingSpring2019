package day49_inheritance002;
//Factory is a NON-Subclass that is in same package
public class Factory  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Device d1 = new Device();
		d1.brand = "LG";
		
		d1.model = "3300";
		
		d1.price = 230.33;
		
		//d1.country  = "USA"; not visible
	}

}
