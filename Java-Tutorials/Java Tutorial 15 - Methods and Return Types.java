/* YouTube Link: */

////////////////////////
// BankAccount Class //
///////////////////////

public class BankAccount {
	
	String accountHolder = "Jamie";
	
	double balance = 250.00;
	
	String welcomeMessage(){
		
		return "Welcome, " + accountHolder;	
		
	}
	
	double getBalance(){
		
		return balance;
		
	}
	
	void printThis(){
		
		System.out.println("Thank you for using our bank!");
		
	}
	
	
}


/////////////////
// Main Class //
////////////////

public class Main {

	public static void main(String[] args) {

		BankAccount myAccount = new BankAccount();
		
		System.out.println(myAccount.welcomeMessage());
		
		System.out.println(myAccount.getBalance());
		
		myAccount.printThis();
		
		
		
	}

}
