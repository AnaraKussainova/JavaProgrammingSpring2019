package day41_PracticeArrayList;

public class BankAccount {

	double balance;
	String accountHolder;
	int accountNumber;
	
	public void deposit(double amount) {
		System.out.println("Depositting $" + amount + " to " + accountNumber);
		balance +=amount;
	}
	
	public void withdraw(double amount) {
		System.out.println("Withdrawing $"+amount + " from " + accountNumber);
		balance -=amount;
		if (balance <0) {
			balance -=35;
		}
	}
	
	public void showBalance () {
		System.out.println("=================================");
		System.out.println("Account holder: " + accountHolder);
		System.out.println("Account number: " + accountNumber);
		System.out.println("Balance: $" + balance);
		System.out.println("==================================");
	}
	
	public void charge (double price) {
		if (price >balance) {
			System.out.println("No available finance");
		}else {
			System.out.println("Congratualtions with new purchase!!!!!!!!!!!");
			balance-=price;
			System.out.println("Balance after charge: " +balance);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
