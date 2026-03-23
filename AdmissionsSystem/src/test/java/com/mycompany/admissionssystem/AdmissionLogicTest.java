
package com.mycompany.admissionssystem;
import org.junit.Test;
import static org.junit.Assert.*;

public class AdmissionLogicTest {
    AdmissionLogic logicObj = new AdmissionLogic();
    public AdmissionLogicTest() {
    }

    @Test
    public void testDetermineDecision() {
        //Test applicants who are accepted
        String expected = "ACCEPTED";
        String actual = logicObj.determineDecision(70, true, 19);
        assertEquals(expected,actual);   
        
        expected = "REJECTED";
        //Test applicants who are rejected
        actual = logicObj.determineDecision(45, true, 19);
        assertEquals(expected,actual); 
        
        expected = "WAITLISTED";
        //Test applicants who are waitlisted
        actual = logicObj.determineDecision(65, true, 19);
        assertEquals(expected,actual); 
        
    
        
    }

    @Test
    public void testIsScholarshipCandidate() {
        //tests if applicant is a scholarship canditate
        boolean expected = true;
        boolean actual = logicObj.isScholarshipCandidate(90);
        assertEquals(expected,actual); 
        
        //tests if applicant is not a scholarship canditate
        actual = logicObj.isScholarshipCandidate(70);
        assertNotEquals(expected,actual);
        
    }
    
    
}
