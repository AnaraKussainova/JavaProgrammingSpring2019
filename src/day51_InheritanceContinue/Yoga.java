package day51_InheritanceContinue;

public class Yoga extends Exercise{
	public int perform (int minutes) {
		System.out.println("Yoging");
		return minutes * 5;

	}
}
