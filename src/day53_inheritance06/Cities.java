package day53_inheritance06;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		City baku = new City(123, "Baku");
		System.out.println(baku.toString());
		
		
		City istanbul = new City(444, "Istanbul");
		
		City anotherCity = new City(444, "Istanbul");
		
		if(istanbul.equals(anotherCity)) {
			System.out.println("Both are Istabul");
		}else {
			System.out.println("Doesnt equal");
		}
		
		
		System.out.println(istanbul.toString());
		
		System.out.println(anotherCity.toString());
		
		System.out.println(baku.hashCode());
		System.out.println(istanbul.hashCode());
		System.out.println(anotherCity.hashCode());
		
		Capital cap = new Capital(101, "Washington, DC", 800000L);
		
		System.out.println(cap.toString());
	}

}
