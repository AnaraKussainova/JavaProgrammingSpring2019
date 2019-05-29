package day41_PracticeArrayList;

public class CAR {

	String make;
	String model;
	int currentSpeed;
	String color;
	
	public  void printCarInfo() {
	System.out.println("car make ["+make + "],model[" + model + "],color[" + color + "], current speed[" + currentSpeed + "]");
	
}
	public void showCurrentSpeed(int speedLimit) {
		
		if (speedLimit>=currentSpeed) {
			System.out.println(make + " is drving at " + currentSpeed + ", following speed limit - " + speedLimit);

		}else {
		
		System.out.println(make + " is driving at " + currentSpeed + " mph, over the " + speedLimit );
	}
}
	
	public void drive () {
		System.out.println(make + " " + model + " is driving .....");
	}
	
	public void accelarate(int mph) {
		currentSpeed +=mph;
	}
	
	
	
}