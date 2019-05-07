package day07_scanner_operators;

public class PreAndPost2 {

	public static void main(String[] args) {
		int messages = 10;
		messages++;
		++messages;
		System.out.println(messages);  //12
		
		int readMessages = --messages; 
		System.out.println(readMessages); // 11
		System.out.println(messages);     //11
		
		int unreadMessages = readMessages--;
		
		System.out.println(unreadMessages); //11
		System.out.println(readMessages);  //10
		
		int total = unreadMessages++ - readMessages--; //11-10
		System.out.println(unreadMessages); //12
		System.out.println(readMessages);    //9
		System.out.println(total); //1
		
		
		int count = 20;
		int count2 = 10;
		int totalCount = ++count + --count2;  //21+9
		
		System.out.println(count); //21
		System.out.println(count2); //9
		System.out.println(totalCount);
		
		
		int myCount = count++ + ++count; //21+23
		System.out.println(count);  //23
		System.out.println(myCount); //44
		

	}

}
