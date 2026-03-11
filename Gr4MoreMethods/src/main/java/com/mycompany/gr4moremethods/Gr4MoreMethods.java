

package com.mycompany.gr4moremethods;
import javax.swing.JOptionPane;

public class Gr4MoreMethods {

    public static void main(String[] args) {
      
      Animal cow = new Animal("Martin", 6, "Dairy", "Brown");
      cow.printAnimalDetails();
      
      Animal dog = new Animal("Bobby",2,"pitbull","midnight black");
      dog.printAnimalDetails();
      dog.setAnimalName("Sprite");
      System.out.println(dog.getAnimalName());
     
      
      
        
        
      printWelcomeMessage();
      Returning101 returns = new Returning101();
      System.out.println("Is Name Empty: "+returns.isNameEmpty("Jeff"));
      System.out.println("Is character uppercase: "+ returns.isUpperCase('f'));
      
      int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter number to be squared: "));
      System.out.println(num1 + "^2 = " + returns.calculateSquare(num1));
       
       char char2ndposition = returns.characterPosition("PROG");
       System.out.println("Character in 2nd position: " + char2ndposition);
       
       String yourName = JOptionPane.showInputDialog("What is your name?: ");
       System.out.println(yourName + " has " + returns.nameCount(yourName) + " characters. ");
       
             
    }
     public static void printWelcomeMessage(){
                  System.out.println("-----Welcome to PROG5121 session-----");
              }
     
 
}
