package day50_inheritance03;

public class FullTImeEmpl extends Employee {
	@Override
	public void calculatePay(int hours, double rate) {
		double total = (hours *rate ) *1.05;
		System.out.println("Full time Employee "  + total);
	}
}
