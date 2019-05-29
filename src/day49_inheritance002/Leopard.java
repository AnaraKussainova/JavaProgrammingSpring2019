package day49_inheritance002;

public class Leopard extends ANIMAL {

	public Leopard() {
		super();//CALL PARENT CLASS NO-ARGS CONSTRUCTOR
		System.out.println("Leopard constructor");
		setType("Leopard");
	}
	
	public Leopard(String type) {
		super(type); //call Animal(String type) constructor
		System.out.println("Leopard 1 - arg constructor");
	}
}
