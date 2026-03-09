package com.mycompany.gr4percentages;

public class Percentages {
    public void computePercent(double num1, double num2){
        double percent = (num1/num2)*100;
        System.out.println(num1 + " is " + percent + "% of " + num2);
      
    }
    public void bookStoreCredit (String name, double gpa){
        double creditAmount = gpa * 10;
        
        System.out.println("Congratulations " + name + "! for your GPA: " + gpa + 
                " your bookstore credit is $" + creditAmount);
    }
}
