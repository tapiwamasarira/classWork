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
    
    public static double getMonthlySales() {
        return monthlySales;
    }

    public static int getNumOfTasks() {
        return numOfTasks;
    }

    public static int getHoursWorked() {
        return hoursWorked;
    }
    
    public static void setMonthlySales(double aMonthlySales) {
        monthlySales = aMonthlySales;
    }

    public static void setNumOfTasks(int aNumOfTasks) {
        numOfTasks = aNumOfTasks;
    }

    public static void setHoursWorked(int aHoursWorked) {
        hoursWorked = aHoursWorked;
    }
    
    
    
    public static double calculatePerfomanceScore(double monthlySales, int numOfTasks){
        double score = (monthlySales / 1000) + (numOfTasks*2);
        return score;
    }
    
    public boolean isEligibleForBonus(double score){
        score = calculatePerfomanceScore(monthlySales, numOfTasks);
        return score >= 50;
    }
    
    public double calculateEffiencency(int numOfTasks, int hoursWorked){
        double efficiency = numOfTasks / hoursWorked;
        return efficiency;
    }
    
    public static String getPerformanceLevel(double score){
      score = calculatePerfomanceScore(monthlySales,numOfTasks);
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
        System.out.println("Performance Score: " + calculatePerfomanceScore(monthlySales, numOfTasks));
        System.out.println("Effieciency: " + calculateEffiencency(numOfTasks, hoursWorked));
        System.out.println("Performance Level: "+ getPerformanceLevel(calculatePerfomanceScore(monthlySales,numOfTasks)));
        System.out.println("Bonus Eligible: "+isEligibleForBonus(calculatePerfomanceScore(monthlySales,numOfTasks)));
        System.out.println("---------------------------");   
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    
        
    }   
   

