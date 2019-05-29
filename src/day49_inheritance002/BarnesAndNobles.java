package day49_inheritance002;

public class BarnesAndNobles {

	public static void main(String[] args) {

		Ebook eb = new Ebook();
		
		eb.setTitle("Introduction to Java");
		eb.setAuthor("Savitch");
		eb.setPages(1016);
		eb.setPrice(116.99);
		eb.setSize(500);
		eb.setType("Tech");
		
		System.out.println(eb.getTitle());
		System.out.println(eb.getAuthor());
		eb.readEbook(123);
		
		
		
		AudioBook a1 = new AudioBook();
		
		a1.setAuthor("Jeanne");
		a1.setTitle("OCA");
		a1.setNarrator("Maruf");
		
		a1.listen();
		
		PaperBack pb1 = new PaperBack();
		
		pb1.setAuthor("Malcom");
		pb1.setTitle("Outliers");
		pb1.setType("Biography");
		pb1.setPrice(20);
		pb1.setPages(300);
		System.out.println(pb1.toString());
		
		
		
		
		
		
		
		
				
		
		
	}

}
