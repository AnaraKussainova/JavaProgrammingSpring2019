package day53_inheritance06;

public class TestHiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		City city = new City(345, "London");
		Capital cap = new Capital(433, "Paris", 53232435L);
		
		System.out.println(city.count);
		System.out.println(cap.count);
		
		System.out.println(city.toString());
		System.out.println(cap.toString());
		
		cap.displayCount();
		
		//call static methods
		
		city.buildARoad();
		
		cap.buildARoad();
		
		City.buildARoad();
		Capital.buildARoad();
		
		City city2 = new City(3333, "Fairfax");
		Capital cap2 = new Capital(565656, "Richmond", 4545454L);
		
		city2.letsBuildARoad();
		cap2.letsBuildARoad();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
