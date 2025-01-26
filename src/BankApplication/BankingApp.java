package BankApplication;


public class BankingApp {

	
	public static void main(String[] args) {
		
        SavingsAccount savings = new SavingsAccount("123456", 5000.0);
        CurrentAcount current = new CurrentAcount("456789", 10000.0);

       
        Customer customer1 = new Customer("Chaitanya", savings);
        Customer customer2 = new Customer("Reddy", current);

        
        System.out.println("Chaitanya Account Details");
        customer1.deposit(2000.0);
        customer1.withdraw(1000.0);
        customer1.showBalance();

        System.out.println("Reddy Account Details");
        customer2.deposit(5000.0);
        customer2.withdraw(15000.0); 
        customer2.showBalance();
    }
}

