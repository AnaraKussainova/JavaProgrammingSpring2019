package day06_operators2;

public class ShortHandOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int students = 45;
	
	System.out.println(students);
	
	students = students + 5;
	System.out.println(students);	
		
	students = students -2;	
	System.out.println(students);
	
	int teachers = 10;
	System.out.println(teachers);
		
	teachers +=2; //INCREASE TEACHER BY 2
	System.out.println(teachers);
	
	teachers -=5;
	System.out.println(teachers);
	
	int cars = 12;
	cars *=2;    
	System.out.println(cars);
	
	cars +=cars;
	System.out.println(cars);

	int shoes = 20;
	shoes /=4;
	System.out.println(shoes);
	
	double price = 45.5;
	int amount = 5;
	
	price +=amount;
	System.out.println(price);
	
	int minutes = 66;
	minutes %=60;   //minutes = minutes %60;
	System.out.println(minutes);
	
	int pennies = 550;
	pennies %=100;  //pennies = pennies %100;
	System.out.println(pennies);
	
	int apples = 10;
	apples =-3;        //JAVA assigning -3
	System.out.println(apples);
	
	int count = 1;
	count = count +1; //2
	count +=1;  //3
	count ++;   //4
	System.out.println(count);   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
