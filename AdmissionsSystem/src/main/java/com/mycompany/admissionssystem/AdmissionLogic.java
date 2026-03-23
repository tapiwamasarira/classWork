
package com.mycompany.admissionssystem;
public class AdmissionLogic {
    public String determineDecision (double average, boolean mathsPassed, int age){
        //Check if students are eligible based on their age
        if(age < 17 ){
           return "NOT ELIGBLE"; 
        }
       
        //check if students are accepted based on their age, average and math mark
        if(average >= 70 && mathsPassed == true){
            return "ACCEPTED";
        }else if(average >= 60 && mathsPassed == true){
            return "WAITLISTED";    
        }else{
            return "REJECTED";
        }  
    }
    //this method checks is students are eligible for a scholarship
    public boolean isScholarshipCandidate(double average){
         if(average >= 85){
            return true;
            
        }
        return false;
                
    }
}
