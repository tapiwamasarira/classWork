package com.mycompany.gr4looping;
public class Gr4Looping {

    public static void main(String[] args) {
       //While loop...
       int lcv = 1; //1.initialising loop control variable
       
       // infinite loop DONT DO IT
       /*while(6 > 2){
           System.out.println("I can't STOP");   
       }*/
       
      
       
       while(lcv < 11){ //2.testing the lcv
           System.out.println("LCV: " + lcv);
           lcv++;//3. altering the lcv
       }
       
       System.out.println("--------------------");
       int x  = 9; //initialising loop control variable
       int y = 1;
       while (x < 109){
           System.out.println(y + " x 9 = " + x);
           y++;
           x+=9;
       }
       
       System.out.println("--------------------");
       int z = 1;
       while(z < 101){
           if(z%5==0 && z%3==0){
               System.out.println("Fizz-Buzz");
           }else if(z%3==0){
               System.out.println("Fizz");
           }else if (z%5==0){
               System.out.println("Buzz");
           }else{
               System.out.println(" - " + z);
           }
          z++;
       }
       
       
    }
}
