/* YouTube Link:  */


////////////////////////
// BankAccount Class //
///////////////////////

public class BankAccount {
	
	public int accountNumber = 1234;
	
	protected String accountHolder = "Jamie";
	
	double balance = 250.00;
	
}


/////////////////
// Main Class //
////////////////

public class Main {

	public static void main(String[] args) {

		BankAccount myAccount = new BankAccount();
		
		System.out.println(myAccount.accountNumber);
		System.out.println(myAccount.accountHolder);
		System.out.println(myAccount.balance);

	}

}
