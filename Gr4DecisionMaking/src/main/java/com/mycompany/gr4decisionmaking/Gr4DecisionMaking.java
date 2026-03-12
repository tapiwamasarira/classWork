package com.mycompany.gr4decisionmaking;
import java.util.Scanner;
public class Gr4DecisionMaking {

    public static void main(String[] args) {
        int x = 5;
        int y = 9;
        Scanner inputObj = new Scanner(System.in);
        if(y < x){
            System.out.println(x);
        }
        //prompt a user to enter 
        System.out.println("Enter a number: ");
        //take in number
        int num = inputObj.nextInt();
        
        if (num % 2== 0){
           System.out.println(num + " is an EVEN number!");
       }else{
            System.out.println(num + " is an ODD number!");
        }
        
        
       
       
   }
}
