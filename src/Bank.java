package com.wiproNga;

class Bank {
    
    private String accountHolderName;
    private int balance;

    
    public Bank(String accountHolderName, int balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    
    public void showAccountHolderDetails() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
    
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited  = " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    public void withdraw(int amount) {
        if ( amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn=  " + amount);
        } else  {
            System.out.println("Insufficient balance.");
        } 
    }

   
    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        Bank account = new Bank("Chaitanya", 25000);

       
        account.showAccountHolderDetails();
  
        account.deposit(2000);
        account.withdraw(1500);
        account.checkBalance();

        
        
    }
}
