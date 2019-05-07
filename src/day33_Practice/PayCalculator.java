package day33_Practice;

public class PayCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getHourlyPay(5, 15));
		
	}
	public static int getHourlyPay(int hours, int rate) {
		if (hours ==0 || hours <0) {
			return 0;
		}
		
		if (rate ==0 || rate<0) {
			System.out.println("Invalid rate");
			return 0 ;
			}
		int totalPay = (hours * rate);
		return totalPay;
		
		
		//System.out.println("END OF METHOD");
		//when return statement line runs code will exit the method and whatever below will not run and BE UNREACHABLE

		}

	
}
