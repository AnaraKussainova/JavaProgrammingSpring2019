package day41_PracticeArrayList;

public class BMW {

	String make = "BMW";
	String model;
	double price;
	
		
	public void showPrice() {
	if ( model.equals("330i")){
		price = 40250;
	}else if(model.equals("740i")) {
		price = 86450;
	}else if(model.equals("m3")) {
		price =66500;
	}else {
		System.out.println(model + " is not available");
		price =0;
	}
		System.out.println("Price: " + price);
	}

}
