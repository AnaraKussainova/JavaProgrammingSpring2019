package day41_PracticeArrayList;

public class Microwave {

	String brand;
	boolean isOn; //false
	
	public void turnOn() {
		if (isOn==true) {
			System.out.println(brand + " is already on");
		}else {
			System.out.println("Turning on the microwave" + brand);
			isOn=true;
		}
	}	
		
		public void turnOff() {
			if (isOn==false) {
		
			System.out.println("It is already off");
		}else {
			System.out.println("Turning off the microwave");
			isOn=false;
		}
	}
	
	
		public void heat(String food ) {
			if(isOn==true) {
				System.out.println("Heating up the " + food);
			}else {
				System.out.println("Microwave is off. Can not heat the " + food);
			}
		}
		

}













