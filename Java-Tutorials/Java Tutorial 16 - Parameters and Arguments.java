/* YouTube Link: https://youtu.be/g38SstHaJjE?list=PLNaVDJYpl1KIT__fsogXppo1JQhIL7HQb */


////////////////////////
// BankAccount Class //
///////////////////////

public class BankAccount {
	
	String accountHolder = "Jamie";
	
	double balance = 250.00;
	
	String welcomeMsg(String name){
		
		return "Welcome, " + name;
		
	}
	
	double deposit(double amt){
		
		balance += amt;
		
		return balance;
		
	}

	
}


/////////////////
// Main Class //
////////////////

public class Main {

	public static void main(String[] args) {

		BankAccount myAccount = new BankAccount();
		
		String userName = "John";
		
		System.out.println(myAccount.welcomeMsg(userName));
		
		System.out.println(myAccount.deposit(100.00));
		
	}

}
