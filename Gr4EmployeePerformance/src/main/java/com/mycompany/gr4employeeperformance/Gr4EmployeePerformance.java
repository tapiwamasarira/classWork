package com.mycompany.gr4employeeperformance;
import java.util.Scanner;

public class Gr4EmployeePerformance {

    public static void main(String[] args) {
        //instantiate an object of the Scanner class
        Scanner inputObj = new Scanner(System.in);
        
        //prompt user to enter their name
        System.out.println("Enter your Name: ");
        
        String empName = inputObj.next();
        
        System.out.println("Enter your Employee ID: ");
        
        String empID = inputObj.next();
        
        
        System.out.println("Enter your monthly sales: ");
        
        double sales = inputObj.nextDouble();
        
        System.out.println("Enter your number of tasks you've completed: ");
        
        int tasks = inputObj.nextInt();
        
        System.out.println("Enter the number of hours you've worked: ");
        
        int hours = inputObj.nextInt();
        
        //instatiate an object of the management system class
        managementSystem employee0 = new managementSystem(empName, empID, sales,tasks,hours);
        //generate an employee report
        employee0.displayReport();
        
        
    }
}
