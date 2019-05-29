package day50_inheritance03;

public class Constructor extends Employee {
	@Override
	public void calculatePay(int hours, double rate) {
		double total = hours * rate + 200;
		System.out.println("COnstructor " + total);
	}
}
