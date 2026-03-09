
package com.mycompany.gr4percentages;
import java.util.Scanner;
public class GR4Percentages {

    public static void main(String[] args) {
        //instantiate an object of the scanner class
        Scanner inputObject = new Scanner(System.in);
        
        /* System.out.println("Please enter a number: ");
        double x = inputObject.nextDouble();
        
        System.out.println("Please enter another number: ");
        double y = inputObject.nextDouble();
        
        
        objPercent.computePercent(x, y);
        objPercent.computePercent(y, x);
        */
        
        System.out.println("What is your name?: ");
        String name = inputObject.nextLine();
        
        System.out.print("What is your GPA?: ");
        double gpa = inputObject.nextDouble();
        
        //instantiate an object of the percentages class
        Percentages objPercent = new Percentages();
        objPercent.bookStoreCredit(name, gpa);
    }
}
