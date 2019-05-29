package day50_inheritance03;

public class AppFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	IPhoneApp i1 = new IPhoneApp();
		IPhoneApp i2 = new IPhoneApp("Uber");
		
	//	AndroidApp a1 = new AndroidApp();
		AndroidApp a2 = new AndroidApp("Lyft");
		
		System.out.println(i2.getName());
		
		System.out.println(a2.getName());
		
		Application.count =33;
		
		System.out.println(IPhoneApp.count); //33
		
		AndroidApp.count =100; //will effect everybody
		
		System.out.println(IPhoneApp.count); 
		System.out.println(AndroidApp.count); 
		System.out.println("Application count " + Application.count);
		
		Application.build("swift");
		IPhoneApp.build("Objective");
		AndroidApp.build("java");
		
		a2.build("c++");
		
		i2.build("python");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
	}

}
