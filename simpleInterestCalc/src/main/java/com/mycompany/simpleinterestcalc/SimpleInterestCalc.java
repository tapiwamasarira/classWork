

package com.mycompany.simpleinterestcalc;
import javax.swing.JOptionPane;

public class SimpleInterestCalc {

    public static void main(String[] args) {
        
        //prompt user to input principle amount
        double principleAmount = Double.parseDouble(JOptionPane.showInputDialog("What is the principle amount? "));
        //prompt user to input interest rate
        double interest = Double.parseDouble(JOptionPane.showInputDialog("What is the interest rate(%)? "));
        //prompt user to input duration
        double duration = Double.parseDouble(JOptionPane.showInputDialog("What is the duration of the investment period? "));
        
        // calculate simple interest
        double simInt = (principleAmount*(1+interest*duration) - principleAmount);
        //calculate final amount
        double finalAmount = principleAmount*(1+interest*duration);
        
       
                
        //display simple interest amount and final amount
        JOptionPane.showMessageDialog(null,"Simple Interest: " + "R"+ simInt + "\nFinal Amount: " + "R"+ finalAmount);
        
        
        
        
        
        
    }
}
