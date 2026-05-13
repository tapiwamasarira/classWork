package com.mycompany.gr4startingwitharrays;
import java.util.Scanner;

public class Gr4StartingWithArrays {

    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        
        String [] unames = new String[10];
        int [] x = {5,14,7,21,55};
        for (int i = 0; i <  10;i++){
            System.out.println("Enter name " + (i+1));
            unames[i] = inputObj.next();
        }
        
        for (String name : unames){
            int xy = 0;
            System.out.println("Name "+ (xy));
        }
    }
}
