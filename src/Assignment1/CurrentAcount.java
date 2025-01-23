package Assignment1;

public class CurrentAcount extends Account{
	
	 private double overdraftLimit = 5000.0;
	 
	public CurrentAcount(String accountNumber, double balance) {
		super(accountNumber, balance);
		
	}

	
	public void deposit(double amount) {
	   balance += amount;
	    System.out.println("Deposited " + amount + " into Current Account.");
	}

	
	public void withdraw(double amount) {
		 if (balance + overdraftLimit >= amount) {
	            balance -= amount;
	            System.out.println("Withdrawn " + amount + " from Current Account.");
	        } else {
	            System.out.println("Overdraft limit exceeded in Current Account.");
	        }
	    
	}

}
