package Assignment1;

public class SavingsAccount extends Account {
	
 private double interestRate = 5; 

 public SavingsAccount(String accountNumber, double balance) {
     super(accountNumber, balance);
 }

 
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited " + amount + " into Savings Account");
 }


 public void withdraw(double amount) {
	 
     if (balance >= amount) {
         balance -= amount;
         
         System.out.println("Withdrawn " + amount + " from Savings Account");
     }
     else {
         System.out.println("Insufficient balance in Savings Account.");
   
     }
 }
 
}
