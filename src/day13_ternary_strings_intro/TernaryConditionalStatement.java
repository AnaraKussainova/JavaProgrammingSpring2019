package day13_ternary_strings_intro;

public class TernaryConditionalStatement {

	public static void main(String[] args) {

		int max;
		int num1 = 100;
		int num2 = 50;
		
		if (num1>num2) {
			max =num1;			
		}else {
			max = num2;
		}
		System.out.println(max);
		
		/////////////Converting to Ternary Operator
		     //condition/
		max = num1>num2 ?num1:num2;
		
		System.out.println(max);
			
		String result;
		int score = 48;
		if (score >60) {
			result = "pass";
		}else {
			result = "fail";
		}
		
		System.out.println(result);
		
		result = score>60 ?"pass":"fail";
		System.out.println(result);
		
		String quality = "bad";
		int rating = (quality.contentEquals("good"))?100:50;
		System.out.println(rating);
		
		int PMhour = 5;
	//	Rush hour during evening:4 - 7;		
		boolean rushHour=(PMhour>=4 && PMhour<7)?true:false;
		System.out.println(PMhour + "is rush hour?" +rushHour);
		
		String result1 = (rushHour)? "yes":"no";
		System.out.println(PMhour + "is rush hour? " + result1);
		
		int AMhour = 8;  //6-9
		
		String amRushHour = (AMhour >=6 && AMhour<9)? "yes" : "no";
		System.out.println(AMhour + " is rush hour? " + amRushHour);
		
		
		
		
		
	}

}
