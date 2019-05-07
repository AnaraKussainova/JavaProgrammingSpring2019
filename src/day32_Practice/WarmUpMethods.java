package day32_Practice;

public class WarmUpMethods {

	
	public static void main(String[] args) {
		makePanckake();
		makePasta();
		cook("omlet", "Eggs, salt, tomatoes, green peppers, onion");
	}
	
	public static void cook (String dish, String ingridients) {
		System.out.println("-- " + dish.toUpperCase() + " Recipe");
		add(ingridients);
		System.out.println("Cook it until it is cooked");
		System.out.println("--" +dish.toUpperCase()+ " is ready");
	}
	
	public static void makePasta() {
		System.out.println("Italian pasta recipe");
		add("Water, salt, olive oil, ");
		boil(2);
		add("pasta");
		boil (9);
		mix(60);
		add("parmesan, marinara");
		System.out.println("Enjoy it!!!!!!");
		
	}
		public static void makePanckake() {
			
		System.out.println("~~Pancake recipe~~");
		add("oil, mushrooms, eggs,sugar, salt, milk, flour");
		mix(10);
		fry (15);
		boil(2);
		
		System.out.println("Enjoy your meal!!!!!!!!!!!");
	}
	
	
	
	public static void add(String ingridients){
		
		System.out.println("Add " + ingridients);
		
	}
	
	public static void mix(int seconds) {
		System.out.println("Mix for " + seconds + " seconds");
	}
	public static void fry(int minutes) {
		System.out.println("Fry for " + minutes + " minutes");
	}
	public static void boil (int minutes) {
		System.out.println("Boiled for " + minutes + " minutes");
	}



}
