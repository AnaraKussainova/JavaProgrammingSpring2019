package day47_blocks;

public class VariableAccess {

		
		//instance var
		int myInstanceVar = 40;
		//static avr
		static int myStaticVar = 55;
		
		public static void main (String[] args) {
			//cannot access non-static from static method
			//System.out.println(myInstanceVar);
			
			System.out.println(myStaticVar);
		
			//create object of VAriableAccess and print myInstanceVar
			
			VariableAccess v1 = new VariableAccess();
			
			System.out.println(v1.myInstanceVar);
			
			//access static var using object
			System.out.println(v1.myStaticVar);
			
			//access static var using classname
			System.out.println(VariableAccess.myStaticVar);
			
			
	}

}
