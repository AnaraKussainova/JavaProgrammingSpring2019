package day22_PracticeLoops;

public class CatsAndDogs {

	public static void main(String[] args) {

		String str = "mycatyourcat";
		int cats =0;
		//look for cat
		for (int i = 0; i <=str.length() -3; i++) {
			System.out.println(str.substring(i, i+3));
			if ( str.substring(i, i+3).contentEquals("cat")) {
				cats ++;
			}
		}	
		System.out.println(cats);
		
		
		
	}

}
