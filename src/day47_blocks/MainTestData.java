package day47_blocks;

public class MainTestData {

	public static void main(String[] args) {
		// 
		System.out.println(TestData.url);
		System.out.println(TestData.email);
		System.out.println(TestData.password);
		
		String briteURL = TestData.url;
		System.out.println(briteURL);
		
		//creating Object to access String var
		//but since Constructor is prvate, We are unable to create new Object
		//TestData t1 = new TestData();
		//System.out.println(t1.email);
		
		
	}

}
