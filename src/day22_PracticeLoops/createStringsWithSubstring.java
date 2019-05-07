package day22_PracticeLoops;

public class createStringsWithSubstring {

	public static void main(String[] args) {

		
		String word = "java1";
		word = word.charAt(0) + ""+ word.charAt(1);
		System.out.println(word);
		
		//////
		String word1 = "Anara";
		word1 = word1.substring(0,2);
		System.out.println(word1);
		
		/////
		
		String word3 = "java";
		
		System.out.println(word3.substring(0,1));
		System.out.println(word3.substring(1,2));
		System.out.println(word3.substring(2,3));
		System.out.println(word3.substring(3));

		/////////
		System.out.println("####################");
		
		int i =0;
		
		System.out.println(word3.substring(i,i+1));
		i++;
		System.out.println(word3.substring(i,i+1));
		i++;
		System.out.println(word3.substring(i,i+1));
		i++;
		System.out.println(word3.substring(i,i+1));

		////////
		System.out.println("########FOR LOOP############");

		for (int j =0; j <=3;j++) {
			System.out.println(word3.charAt(j));   //also word.substring(j, j+1);
		}
		
		//////////
		
		System.out.println("##############");
		
		int start = 1;
		int end = 5;
		String word4 = "UnitedStates";
		System.out.println(word4.substring(start, end));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
