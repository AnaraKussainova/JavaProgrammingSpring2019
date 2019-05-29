package day42_customClasses_Encapsulation;

public class OrderCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coffee c1 = new Coffee();
		
		c1.name = "Mocha";
		c1.size = "Grande";
		c1.price = 4.5;
		c1.calories = 500;
		
		c1.getCoffeeinfo();
		
		Coffee c2 = new Coffee();
		
		c2.setName("java chip");
		c2.setSize("Venti");
		c2.setPrice(5.6);
		c2.setCalories(450);
		c2.getCoffeeinfo();
		
		c2.getCoffeeinfo();
		
		Coffee c3 = new Coffee();
		
		c3.setCoffeeInfo("latte", "tall", 3.95, 230);
		
		c3.getCoffeeinfo();
	}

}
