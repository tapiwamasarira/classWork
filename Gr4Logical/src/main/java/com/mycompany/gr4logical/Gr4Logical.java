package com.mycompany.gr4logical;
import java.util.Scanner;
public class Gr4Logical {

    public static void main(String[] args) {
        //instantiate object of the scanner class
        Scanner inputObj = new Scanner(System.in);
        //prompt user to enter their mark
        System.out.println("Please enter your final mark: ");
        //store mark as a variable
        int mark = inputObj.nextInt();
        
        //create a variable for the students symbol
        char symbol = ' ';
        //determine the symbol the user gets based on their mark
        if (mark > 79 && mark < 101){
           symbol = 'A';
        }else if (mark > 69 && mark < 80){
           symbol = 'B';
        }else if (mark > 59 && mark < 70){
           symbol = 'C';
        }else if(mark > 49 && mark < 60 ){
           symbol = 'D';
        }else{
           symbol = 'f';
        }
        
        System.out.println(mark + " => " + symbol);
     
    }
    
}
