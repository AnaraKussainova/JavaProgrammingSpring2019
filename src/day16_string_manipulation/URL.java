package day16_string_manipulation;
import java.util.Scanner;
public class URL {

	public static void main(String[] args) {
		System.out.println("url");
		Scanner scan = new Scanner(System.in);
		
		String url = scan.next();
		
		System.out.println(url.startsWith("www."));
		
	    int lastIndex = url.lastIndexOf(".");
		
		System.out.println(lastIndex);
		
		if(url.charAt(lastIndex) =='.') {
			System.out.println(". is there before extension");
		}else {
			System.out.println("Misplaced");
		}
		
		String domain= url.substring(4, lastIndex);
		
		System.out.println(domain);
		
		String extension = url.substring(lastIndex+1, url.length());
		
		System.out.println(extension);
		
		System.out.println("Extension:" + extension);
		
		
		
	}

}
