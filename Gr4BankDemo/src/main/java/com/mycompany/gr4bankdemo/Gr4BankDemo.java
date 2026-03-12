package com.mycompany.gr4bankdemo;
import java.util.Scanner;
public class Gr4BankDemo {

    public static void main(String[] args) {
        Scanner inputObject = new Scanner(System.in);
        
        BankAccount user1 = new BankAccount("Chandler Bing",50);
        System.out.println("You must select:\n1 to Deposit \n2 to Withdraw \n3 for Balance ");
        
        int choice = inputObject.nextInt();
        switch (choice) {
            case 1:
                {
                    System.out.println("How much are you depositing? ");
                    double amount = inputObject.nextDouble();
                    user1.deposit(amount);
                    break;
                }
            case 2:
                {
                    System.out.println("How much are you withdrawing? ");
                    double amount = inputObject.nextDouble();
                    user1.withdraw(amount);
                    break;
                }
            case 3:
                user1.displayBalance();
                break;
            default:
                System.out.println("INVALID SELECTION");
                break;
        }
    }
}
