package BankApplication;


public abstract class Account {
	
   protected String accountNumber;
   protected double balance;

    public Account(String accountNumber, double balance) {
    	this.accountNumber = accountNumber;
        this.balance = balance;
		
	}


public abstract void deposit(double amount);
 
   public abstract void withdraw(double amount);

   public void showBalance() {
     System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
 }
}

