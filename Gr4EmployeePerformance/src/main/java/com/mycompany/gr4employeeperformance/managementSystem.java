package com.mycompany.gr4employeeperformance;
public class managementSystem {
    // variables are initialsed as private to protect sensitive data 
    private String employeeName;
    private String employeeID;
    private static double monthlySales;
    private static int numOfTasks;
    private static int hoursWorked;
    
    // constructor used to initialise data fields to appropriate starting values
    public managementSystem(String name, String empID, double sales, int tasks, int hours){
      employeeName = name;
      employeeID = empID;
      monthlySales = sales;
      numOfTasks = tasks;
      hoursWorked = hours;
    }
    
    public static double calculatePerfomanceScore(){
        double score = (monthlySales / 1000) + (numOfTasks*2);
        return score;
    }
    
    public boolean isEligibleForBonus(){
        double score = calculatePerfomanceScore();
        return score >= 50;
    }
    
    public double calculateEffiencency(){
        double efficiency = numOfTasks / hoursWorked;
        return efficiency;
    }
    
    public static String getPerformanceLevel(){
      double score = calculatePerfomanceScore();
        if (score >= 80){
        return "Excellent";
        }else if(score > 50 && score < 79){
    return "Good";
        }else{
    return "Poor";
        }   
    }
    
    public void displayReport(){
        System.out.println("------EMPLOYEE REPORT------");
        System.out.println("Name: "+ employeeName);
        System.out.println("Employee ID: "+ employeeID);
        System.out.println("Performance Score: " + calculatePerfomanceScore());
        System.out.println("Effieciency: " + calculateEffiencency());
        System.out.println("Performance Level: "+ getPerformanceLevel());
        System.out.println("Bonus Eligible: "+isEligibleForBonus());
        System.out.println("---------------------------");   
    }
    
        
    }   
   

