package day38_arrayList;

import java.util.ArrayList;

public class RawArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		list.add("Saturday");
		list.add("Java day");
		list.add(1000);
		list.add(234.56);
		list.add(true);
		list.add(false);
		
		System.out.println(list);
		
		String allValues = list.toString();
		
		System.out.println(allValues);
		
		String str = list.get(0).toString();
		System.out.println(str);
		
		//all values are stored as a raw type. we can also call it as a general object
		
		
		
		
	}

}
