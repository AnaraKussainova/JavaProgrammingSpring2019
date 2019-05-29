package day51_InheritanceContinue;

public class Running extends Exercise{
	
	public int perform (int minutes) {
		System.out.println("Running");
		return minutes *10;
	}
}
