
package com.mycompany.gr4lastonthat;
import java.util.Scanner;
public class Gr4LastOnThat {

    public static void main(String[] args) {
        
        Scanner inputObject = new Scanner(System.in);
        // instatiate objects of the More Stuff class
        MoreStuff printInstitution = new MoreStuff();
        MoreStuff isEvenOrOdd = new MoreStuff();
       
        
       printInstitution.printInstitutionName();
       printInstitution.printInstitutionName();
       printInstitution.printInstitutionName();
       //prompt user to enter a number
       System.out.println("Please enter a number: ");
       //take user input
       int num1 = inputObject.nextInt();
       // check if number is even or odd
       isEvenOrOdd.evenOrOdd(num1);
       
       
    }
    
   
}
