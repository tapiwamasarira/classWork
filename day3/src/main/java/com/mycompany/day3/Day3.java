package com.mycompany.day3;

import java.util.Scanner; //Includes the scanner class in our project.

       

public class Day3 {
   
    public static void main(String[] args) {
    
        //create an instant[object] in the scanner class to access Members of Scanner class (MC)
        Scanner inputObject = new Scanner(System.in);
        /*
   //prompt user to enter a value     
   System.out.print("Please enter your name: ");
   //read in input and assign it to an appropriate variable
   String name = inputObject.nextLine();
   
   //prompt user to enter a value
   System.out.print("How old are you?: ");
   // read in data as a string but converts to an integer
   int age = inputObject.nextInt();
   
   System.out.print("How much do they pay you to come here?");
   double wages = inputObject.nextDouble();
   
   System.out.print("TRUE/FALSE: ");
   boolean isIt = inputObject.nextBoolean();
   
   System.out.print("Enter any character: ");
   //only take in the first character
   char anyChar = inputObject.next().charAt(0);
   
   System.out.println("Welcome "+ name +"!" + "\nIt's crazy that you are "+ age + " Making R" + wages + ".\nTrue/False: " + isIt + "\nYour Character: " + anyChar);*/         
   
        
        /*
        **** Arithmetic Operators
        1. + addition (5+5)
        2. - subtraction (3-2)
        3. * multiplication (2 * 4)
        4. / division (15/3)
        5. % modulus (9%2)
        - Remainder operation => 9&2=1; 12 % 7 = 5;
           */
        //prompt user to input num1
        System.out.println("Please enter a number: ");
        //read in num1
        double num1 = inputObject.nextDouble();
        
        //prompt user to input num2
        System.out.println("Please enter another number: ");
        //read in num2
        double num2 = inputObject.nextDouble();
        
      
        
        //calculate the sum, product, difference and quotient of these numbers
        double sum = num1+num2;
        double product = num1*num2;
        double diff = num1-num2;
        double quotient=num1/num2;
        
        //print out answers
        System.out.print("Sum: " + sum 
                + "\nProduct: "+ product
        + "\nDifference: "+ diff
        + "\nQuotient: "+ quotient );
        
       
        
        
    }
}
