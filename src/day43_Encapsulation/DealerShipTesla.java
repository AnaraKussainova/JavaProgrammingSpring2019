package day43_Encapsulation;

public class DealerShipTesla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tesla tesla = new Tesla();
		tesla.setModel("Model X");
		tesla.setRange(310);
		tesla.setZeroTo60(3.2);
		tesla.setPrice(514450);
		tesla.setSelfDriving(true);
		
		System.out.println("Model " + tesla.getModel());
		System.out.println("Range " + tesla.getRange());
		System.out.println("Zero to 60 " + tesla.getZeroTo60());
		System.out.println("Price " + tesla.getPrice());
		System.out.println("Self driving " + tesla.isSelfDriving());
		
		System.out.println(tesla); //automatically calling toString method
		System.out.println(tesla.toString());
		
		
		System.out.println(tesla.isValidModel("Model X"));
		
		System.out.println("#############");
		
		Tesla myTesla = new Tesla();
		
		myTesla.setTeslaInfo("Roadster", 620, 1.9, 250000, true);
		
		System.out.println(myTesla.toString());
		
		System.out.println("%%%%%");
		
		if (tesla.getZeroTo60() < myTesla.getZeroTo60()) {
			System.out.println("Faster model: " + myTesla.getZeroTo60());
		}else {
			System.out.println("Faster model: " + tesla.getZeroTo60());
		}
		
	buy(myTesla);
	buy(tesla);
	System.out.println(testDrive("Model S"));
	
	}//mail method


                         
	public static void buy (Tesla car ) {
		System.out.println("Purchasing:  "+ car.toString());
	}
	
	
	public static Tesla testDrive(String model) {
		System.out.println("I would like to test drive - " + model);
		System.out.println("-Sure, let me build the object and return it");
		Tesla car = new Tesla();
		car.setTeslaInfo(model, 310, 2.5, 95000, false);
		return car;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
