/* YouTube Link: https://www.youtube.com/watch?v=5IfSmp0OqXY
 *
 * This tutorial was made using two classes, one called "BankAccount" and another called "Main".
 * The code for both of these classes will be posted in this .java file, so as to save space, etc.
 *
 */
 
 //////////////////////////
 ///  BankAccount Class ///
 /////////////////////////
 
 public class BankAccount {
	
	//Bank Name
	public String bankName = "TechnicalCafe Bank";

	//Account holder's name
	private String accountHolder = "Jamie";
	
	//Bank account balance
	private double balance = 100.00;
	
	//Method to return the account holder's name
	public String getName(){
		return accountHolder;
	}
	
	//Method to return the balance of the bank account
	public double getBalance(){
		return balance;
	}
	
	//Method to deposit money into the bank account
	public String deposit(double amount){
		balance += amount;
		
		return "Deposit amount: " + amount +
			   "\nNew Balance: " + balance;
	}
	
	//Method used to withdraw money from the bank account
	public String withdraw(double amount){
		
		//Check to make sure there are enough funds
		if(balance < amount){
			amount = balance;
			balance -= amount;
		}
		else{
			balance -= amount;
		}
		
		return "Withdrawel amount: " + amount + 
				"\nNew Balance: " + balance;
	}
	
}


 //////////////////////////
 ///     Main Class     ///
 /////////////////////////
 
 public class Main {

	public static void main(String[] args) {

		BankAccount myAccount = new BankAccount();
		
		System.out.println(myAccount.getBalance());
		
		myAccount.withdraw(100.00);
		
		System.out.println(myAccount.getBalance());

	}

}
