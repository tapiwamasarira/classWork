/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.gr4employeeperformance;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class managementSystemTest {
    
    public managementSystemTest() {
    }

    /**
     * Test of getMonthlySales method, of class managementSystem.
     */
    @Test
    public void testGetMonthlySales() {
        System.out.println("getMonthlySales");
        double expResult = 0.0;
        double result = managementSystem.getMonthlySales();
        assertEquals(expResult, result, 0);
        
    }

    /**
     * Test of getNumOfTasks method, of class managementSystem.
     */
    @Test
    public void testGetNumOfTasks() {
        System.out.println("getNumOfTasks");
        int expResult = 0;
        int result = managementSystem.getNumOfTasks();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getHoursWorked method, of class managementSystem.
     */
    @Test
    public void testGetHoursWorked() {
        System.out.println("getHoursWorked");
        int expResult = 0;
        int result = managementSystem.getHoursWorked();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setMonthlySales method, of class managementSystem.
     */
    @Test
    public void testSetMonthlySales() {
        System.out.println("setMonthlySales");
        double aMonthlySales = 0.0;
        managementSystem.setMonthlySales(aMonthlySales);
        
    }

    /**
     * Test of setNumOfTasks method, of class managementSystem.
     */
    @Test
    public void testSetNumOfTasks() {
        System.out.println("setNumOfTasks");
        int aNumOfTasks = 0;
        managementSystem.setNumOfTasks(aNumOfTasks);
        
    }

    /**
     * Test of setHoursWorked method, of class managementSystem.
     */
    @Test
    public void testSetHoursWorked() {
        System.out.println("setHoursWorked");
        int aHoursWorked = 0;
        managementSystem.setHoursWorked(aHoursWorked);
        
    }

    /**
     * Test of calculatePerfomanceScore method, of class managementSystem.
     */
    @Test
    public void testCalculatePerfomanceScore() {
        System.out.println("calculatePerfomanceScore");
        double monthlySales = 20000;
        int numOfTasks = 10;
        double expResult = 52;
        double result = managementSystem.calculatePerfomanceScore(monthlySales, numOfTasks);
        assertEquals(expResult, result,40);
        
    }

    /**
     * Test of isEligibleForBonus method, of class managementSystem.
     */
    @Test
    public void testIsEligibleForBonus() {
        System.out.println("isEligibleForBonus");
        double score = 0.0;
        managementSystem instance = null;
        boolean expResult = false;
        boolean result = instance.isEligibleForBonus(score);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of calculateEffiencency method, of class managementSystem.
     */
    @Test
    public void testCalculateEffiencency() {
        System.out.println("calculateEffiencency");
        int numOfTasks = 0;
        int hoursWorked = 0;
        managementSystem instance = null;
        double expResult = 0.0;
        double result = instance.calculateEffiencency(numOfTasks, hoursWorked);
        assertEquals(expResult, result, 0);
        
    }

    /**
     * Test of getPerformanceLevel method, of class managementSystem.
     */
    @Test
    public void testGetPerformanceLevel() {
        System.out.println("getPerformanceLevel");
        double score = 0.0;
        String expResult = "";
        String result = managementSystem.getPerformanceLevel(score);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of displayReport method, of class managementSystem.
     */
    @Test
    public void testDisplayReport() {
        System.out.println("displayReport");
        managementSystem instance = null;
        instance.displayReport();
        
    }

    /**
     * Test of getEmployeeName method, of class managementSystem.
     */
    @Test
    public void testGetEmployeeName() {
        System.out.println("getEmployeeName");
        managementSystem instance = null;
        String expResult = "";
        String result = instance.getEmployeeName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getEmployeeID method, of class managementSystem.
     */
    @Test
    public void testGetEmployeeID() {
        System.out.println("getEmployeeID");
        managementSystem instance = null;
        String expResult = "";
        String result = instance.getEmployeeID();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setEmployeeName method, of class managementSystem.
     */
    @Test
    public void testSetEmployeeName() {
        System.out.println("setEmployeeName");
        String employeeName = "";
        managementSystem instance = null;
        instance.setEmployeeName(employeeName);
       
    }

    /**
     * Test of setEmployeeID method, of class managementSystem.
     */
    @Test
    public void testSetEmployeeID() {
        System.out.println("setEmployeeID");
        String employeeID = "";
        managementSystem instance = null;
        instance.setEmployeeID(employeeID);
        
    }
    
}
