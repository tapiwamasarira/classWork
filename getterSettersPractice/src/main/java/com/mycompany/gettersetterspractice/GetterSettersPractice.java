
package com.mycompany.gettersetterspractice;
import java.util.Scanner;

public class GetterSettersPractice {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        personDetails pd = new personDetails();
        
        System.out.println("What is your name?");
        String name = sn.nextLine();
        pd.setName(name);
        
        System.out.println("How old are you?");
        int age = sn.nextInt();
        pd.setAge(age);
        
        pd.displayDetails();
       
    }
}
