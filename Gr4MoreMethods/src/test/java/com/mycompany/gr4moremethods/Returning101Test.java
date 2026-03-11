
package com.mycompany.gr4moremethods;

import org.junit.Test;
import static org.junit.Assert.*;


public class Returning101Test {
    Returning101 test1 = new Returning101();
    
    public Returning101Test() {
    }

    @org.junit.Test
    public void testIsNameEmpty() {
        assertTrue(test1.isNameEmpty(""));
    }

    @org.junit.Test
    public void testIsUpperCase(){
        assertTrue(test1.isUpperCase('h'));
    }

    @org.junit.Test
    public void testCalculateSquare() {
        int expected = 25;
        int actual = test1.calculateSquare(5);
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void testCharacterPosition() {
        char expected = 'R';
        char actual = test1.characterPosition("PROG5121");
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void testNameCount() {
        int expected = 8;
        int actual = test1.nameCount("PROG5121");
                assertEquals(expected,actual);
    }
    
}
