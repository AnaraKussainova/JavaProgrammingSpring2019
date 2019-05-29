package day50_inheritance03;

public class AdminUser extends SlackUser{

	public AdminUser(String name) {
		super(name);
	}
		// TODO Auto-generated constructor stub
	@Override	
		public void sendMessage(String message) {
			System.out.println("@channel");
			System.out.println(getName() + " is sending message " );
		}
	

}
