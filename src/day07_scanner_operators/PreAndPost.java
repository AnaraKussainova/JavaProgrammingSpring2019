package day07_scanner_operators;

public class PreAndPost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int num = 0;
	int num2 = num++;
	
	System.out.println(num);
	System.out.println(num2);
		
		int num3 = 0;
		int num4 = ++num3;
		System.out.println(num3);
		System.out.println(num4);
		
		
		int i= 10;
		i++;  //add1
		++i;  // add1
		
		System.out.println(i);
		
		
		
		int apples = 4;   //5
		int pears = apples++;  //4
		
		System.out.println(apples);
		
		System.out.println(pears);
		
			
		int banana = 4;     //5
		int grape = ++banana; //5
		
		System.out.println(banana);
		System.out.println(grape);
		
		
		int lemon = 6;         //8
		int cherry = lemon++; //6
		int kiwi = ++lemon; //8
		
		System.out.println(lemon);
		System.out.println(cherry);
		System.out.println(kiwi);
		
		
		int friends = 10;
		System.out.println(friends++);
		
		System.out.println(friends);
		
		int candy = 20;
		System.out.println(++candy);
		
		int p1 = 10;
		int sum = p1++ + 5;       //because ++ after p1 first give 10 and then add 5
		System.out.println(sum);
		System.out.println(p1);
		
		int a1 = 10;
		int summary = ++a1 + 5;
		System.out.println(summary);   //because ++ befire a1 first we add one and then 5
		System.out.println(a1);
		
		int batteries = 8;
		int oldBatteries = 5;
		int totalBatteries = batteries++ + ++oldBatteries; // 8+6=14
		
		
		System.out.println(totalBatteries);
		System.out.println(batteries);  // 9
		System.out.println(oldBatteries);  //6
	}
 
}
