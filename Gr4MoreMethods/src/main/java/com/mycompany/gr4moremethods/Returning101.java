
package com.mycompany.gr4moremethods;
public class Returning101 {
    
    public boolean isNameEmpty(String name){
        return name.isEmpty();
    }
    //test whether a character is upper case
    public boolean isUpperCase(char letter){
        return Character.isUpperCase(letter);
    }
    //calculate the square of a number
    public int calculateSquare(int num){
        return Math.powExact(num,2);
    }
    //find the character at the second position of a string
    public char characterPosition(String word){
        return word.charAt(1);
    }
    
    public int nameCount(String name){
        return name.length();
    }
}
