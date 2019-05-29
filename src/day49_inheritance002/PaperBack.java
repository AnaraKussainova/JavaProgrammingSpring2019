package day49_inheritance002;

public class PaperBack extends Book{
	
	private int pages;
	
	public String toString() {
		//title, author, price, type, number of pages
		
		return getTitle() + " | " + getAuthor() + " | " + getPrice() + " | " + getType() + " | " + pages;
		
		
	}
	
	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

}
