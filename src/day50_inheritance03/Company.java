package day50_inheritance03;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee ep = new Employee();
		FullTImeEmpl ft = new FullTImeEmpl();
		Constructor c = new Constructor();
		
		ep.calculatePay(40, 40);
		ft.calculatePay(40, 45);
		c.calculatePay(20, 60);
		
	}

}
