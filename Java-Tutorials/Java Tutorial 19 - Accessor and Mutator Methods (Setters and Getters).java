/* YouTube Link: */


////////////////////////
// BankAccount Class //
///////////////////////

public class BankAccount {
	
	int accountNumber = 1234;
	
	String accountHolder = "Jamie";
	
	private double balance = 250.00;
	
	double getBalance(){
		
		return balance;
		
	}
	
	void setBalance(double amt){
		
		balance += amt;
		
	}
	
	
}


/////////////////
// Main Class //
////////////////


public class Main {

	public static void main(String[] args) {

		
		BankAccount myAccount = new BankAccount();
		
		System.out.println(myAccount.getBalance());
		
		myAccount.setBalance(300.0);
		
		System.out.println(myAccount.getBalance());
		
	}
	
}
