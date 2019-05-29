package day44_Constructors;

import java.util.ArrayList;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Job j1 = new Job();
		
		Job j2 = new Job("SDET");
		
		Job j3 = new Job("DEV", "Google", 150000);
		
		System.out.println(j1.toString());
		System.out.println(j2.toString());
		System.out.println(j3.toString());
		
		//create list of jobs
		
		ArrayList<Job> list = new ArrayList<>();
		
		list.add(j3);
		list.add(new Job("Scrum Master", "google", 189000));  //directly creating new object and putting into the list
		list.add(new Job("QA", "amazon", 165000));
		list.add(new Job("BA", "Apple", 123000));
		list.add(new Job("Devel", "sony", 156000));
		
		System.out.println(list);
		
		
		//find the highest paying job and print toString for that
		
		double  highest=0;
		int index = -1;
		for (int i =0; i<list.size(); i++) {
			if (list.get(i).getAnnualSalary()>highest) {
				highest = list.get(i).getAnnualSalary();
				index = i;
			}
		}
		
		System.out.println("Highest salary job --->" + list.get(index));

		
		
		
		
		
		
		
		
	}

}
