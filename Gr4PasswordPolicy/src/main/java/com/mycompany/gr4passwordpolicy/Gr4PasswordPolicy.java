
package com.mycompany.gr4passwordpolicy;
import java.util.Scanner;

public class Gr4PasswordPolicy {

    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        
        // 8-long, contains caps, contains a digit, special character
        
        boolean isValid = false;
        int caps = 0;
        int digits = 0;
        int specialChar = 0;
        
        while (!isValid){
            System.out.println("Please enter a valid password...");
            String password = inputObj.next();
            for (char c : password.toCharArray()){
                if(Character.isUpperCase(c)){
                    caps++;
                } else if(Character.isDigit(c)){
                    digits++;
               
                }else if(!Character.isLetterOrDigit(c)){
                   specialChar++;
                }
                   
            }
            if (password.length() > 7 && caps > 0 && digits > 0 && specialChar > 0){
                    System.out.println("Password meets the complexity requirements.");
                    isValid = true;
                }else {
                    System.out.println("Password DOES NOT meet the complexity requirements.");
                }
        }
    }
}
