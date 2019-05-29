package day40_CustomClassesAndMethods;
 public class BestBuy{
	 
	
	
	
	public static void main (String [] args) {
		//System.out.println(brand);
		//Above line wont work we need object to use brand
		//Create SmartPhone Object
		
		SmartPhone cell1 = new SmartPhone();
		System.out.println(cell1.brand); //null
		System.out.println(cell1.screenSize); //0.0
		
		cell1.brand = "Nokia 6200";
		cell1.screenSize = 2.0;
		cell1.color = "silver";
		cell1.price = 76.16;
		
		System.out.println("Brand: " + cell1.brand);
		System.out.println("Screen size: " + cell1.screenSize);
		System.out.println("Color: " + cell1.color);
		System.out.println("Price: " + cell1.price);
		
		
		SmartPhone cell2 = new SmartPhone();
		
		cell2.brand = "Siemens";
		cell2.screenSize = 1.5;
		cell2.color = "blue";
		cell2.price = 39.22;
		
		System.out.println("######## Cell 2 Values");
		System.out.println("Brand: " + cell2.brand);
		System.out.println("Screen size: " + cell2.screenSize);
		System.out.println("Color: " + cell2.color);
		System.out.println("Price: " + cell2.price);
		
		System.out.println("#######Calling methods#######");
		
		cell1.callCell();
		cell1.messageCell();
		
		cell2.callCell();
		cell2.messageCell();
		
		
		
		
	}
 		
		

}