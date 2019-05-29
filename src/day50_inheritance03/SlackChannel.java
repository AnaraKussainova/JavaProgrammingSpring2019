package day50_inheritance03;

public class SlackChannel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SlackUser su  = new SlackUser("Nodir");
		AdminUser au = new AdminUser("Florian");
		
		su.sendMessage("Hello students");
		au.sendMessage("Thank you");
	}

}
