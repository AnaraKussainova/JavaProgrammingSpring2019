package day26_Practice;

import java.util.Arrays;
import java.util.Random;

public class NameArray {

	public static void main(String[] args) {

		
	String[] names= {	"James","Mary",
		"John","Patricia",
		"Robert","Jennifer",
		"Michael","Linda",
		"William","Elizabeth",
		"David","Barbara",
		"Richard","Susan",
		"Joseph","Jessica",
		"Thomas","Sarah",
		"Charles","Margaret",
		"Christopher","Karen",
		"Daniel","Nancy",
		"Matthew","Lisa",
		"Anthony","Betty",
		"Donald","Dorothy",
		"Mark","Sandra",
		"Paul","Ashley",
		"Steven","Kimberly",
		"Andrew","Donna",
		"Kenneth","Emily",
		"George","Carol",
		"Joshua","Michelle",
		"Kevin","Amanda",
		"Brian","Melissa",
		"Edward","Deborah",
		"Ronald","Stephanie",
		"Timothy","Rebecca",
		"Jason","Laura",
		"Jeffrey","Helen",
		"Ryan","Sharon",
		"Jacob","Cynthia",
		"Gary","Kathleen",
		"Nicholas","Amy",
		"Eric","Shirley",
		"Stephen","Angela",
		"Jonathan","Anna",
		"Larry","Ruth",
		"Justin","Brenda",
		"Scott","Pamela",
		"Brandon","Nicole",
		"Frank","Katherine",
		"Benjamin","Samantha",
		"Gregory","Christine",
		"Raymond","Catherine",
		"Samuel","Virginia",
		"Patrick","Debra",
		"Alexander","Rachel",
		"Jack","Janet",
		"Dennis","Emma",
		"Jerry","Carolyn",
		"Tyler","Maria",
		"Aaron","Heather",
		"Henry","Diane",
		"Jose","Julie",
		"Douglas","Joyce",
		"Peter","Evelyn",
		"Adam","Joan",
		"Nathan","Victoria",
		"Zachary","Kelly",
		"Walter","Christina",
		"Kyle","Lauren",
		"Harold","Frances",
		"Carl","Martha",
		"Jeremy","Judith",
		"Gerald","Cheryl",
		"Keith","Megan",
		"Roger","Andrea",
		"Arthur","Olivia",
		"Terry","Ann",
		"Lawrence","Jean",
		"Sean","Alice",
		"Christian","Jacqueline",
		"Ethan","Hannah",
		"Austin","Doris",
		"Joe","Kathryn",
		"Albert","Gloria",
		"Jesse","Teresa",
		"Willie","Sara",
		"Billy","Janice",
		"Bryan","Marie",
		"Bruce","Julia",
		"Noah","Grace",
		"Jordan","Judy",
		"Dylan","Theresa",
		"Ralph","Madison",
		"Roy","Beverly",
		"Alan","Denise",
		"Wayne","Marilyn",
		"Eugene","Amber",
		"Juan","Danielle",
		"Gabriel","Rose",
		"Louis","Brittany",
		"Russell","Diana",
		"Randy","Abigail",
		"Vincent","Natalie",
		"Philip","Jane",
		"Logan","Lori",
		"Bobby","Alexis",
		"Harry","Tiffany",
		"Johnny","Kayla"};
	
		//how many names in array
		System.out.println(names.length);
		System.out.println("###################");

		System.out.println(Arrays.toString(names));
		System.out.println("###################");

		//2 names in each line
		
		for (int i=0; i<names.length; i+=2) {
			System.out.println(names[i] +", "+ names[i+ 1]);
		}
		System.out.println("###################");

		//print male names in single line separated by comma
		
		for (int i =0; i<names.length;i++) {
			if(i%2==0) {
					
				System.out.print(names[i] + ", ");
			}
		}
				
			System.out.println();
		//print female names in single line separated by comma

		for (int j =0; j<names.length; j++) {
			if (j%2!=0) {
				
				System.out.print(names[j] + ", ");
			}
		}
		
		System.out.println("###############");
		
		//print 1 random name
		//use random class
		
		Random random = new Random();

		int r = random.nextInt(names.length);
		
		System.out.println("Random name: "+names[r]);
		
		System.out.println("###############");

		//print all name that are up to 4 charachters in uppercase in the same line
		
		for(String name:names) {
			if(name.length()<=4) {
				System.out.print(name.toUpperCase() + ", ");
			}
		}
		System.out.println("###############");

		
		String names3to4 = "";
		String names5to6 = "";
		String names7orMore = "";


		for (String n : names) {
			if(n.length()<=4) {
				names3to4 +=n + ", ";
			}else if (n.length() ==5 || n.length() ==6) {
				names5to6  +=n +", ";
			}else if (n.length()>=7) {
				names7orMore+=n + ", ";
			}
		}
		
		
		System.out.println(names3to4 );
		System.out.println(names5to6 );
		System.out.println(names7orMore);

		//swap seats
		
		System.out.println(Arrays.toString(names));

		System.out.println("#######");
		
	/*	String str1 = "first word";
		String str2 = "second word";
		String temp = str1;
		str2 = temp;
		*/
			
		for (int i =0; i <names.length; i+=2) {
			 String temp = names[i];
			names[i] = names[i+1];
			names[i+1] = temp;

		}
		System.out.println(Arrays.toString(names));

		System.out.println("#######");

		
		
		
		
		
		
		
		
		
		
		
	}

}
