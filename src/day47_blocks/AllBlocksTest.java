package day47_blocks;

public class AllBlocksTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AllBlocks a1 = new AllBlocks();
		AllBlocks a2 = new AllBlocks();
		System.out.println(a1.nonStaticInt);
		System.out.println(a1.staticInt);
		
		System.out.println(a2.nonStaticInt);
		System.out.println(a1.staticInt);
		
	}

}
