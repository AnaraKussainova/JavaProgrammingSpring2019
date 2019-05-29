package day49_inheritance002;
                    //is a 
public class Ebook extends Book{
	
	private double size;
	private int pages;
	
	public void readEbook(int pageNum) {
		System.out.println("Reading " + getTitle() +  " book by " + getAuthor() + " at page " + pageNum);
	}
	
	
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public String toString() {
		return "Ebook [size=" + size + ", pages=" + pages + "]";
	}
	
	
}
