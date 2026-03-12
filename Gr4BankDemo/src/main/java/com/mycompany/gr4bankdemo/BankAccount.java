package com.mycompany.gr4bankdemo;
public class BankAccount {
    
    private String accountHolder;
    private double balance;
    
    public BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    
    public void deposit(double amount){
        System.out.println("Initial Amount: R"+ balance);
        balance += amount; // balance = balance + amount
        System.out.println("Current Balance: R" + balance);
    }
    
    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("Insufficient Amount.");
        }else{
        System.out.println("Initial Amount: R" + balance);
        balance -= amount; // balance = balance - amount
        System.out.println("Current Balance: R" + balance);
        }
    }
    
    public void displayBalance(){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Balance: R" + balance);
        
    }
    
    
}
