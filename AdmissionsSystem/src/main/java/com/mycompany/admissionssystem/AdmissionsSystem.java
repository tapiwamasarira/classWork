
package com.mycompany.admissionssystem;
/*ICE TASK 3
GROUP 14
Tapiwa Masarira - ST10521654
Thabang Manyathela - ST10523818
Sabelo Gwele - ST10485571
Helder Cardoso - ST10512565
Mukhesi Tshivhase - ST10476909
*/
import java.util.Scanner;
public class AdmissionsSystem {

    public static void main(String[] args) {
        //instantiate an object of the Scanner class
        Scanner inputObj = new Scanner(System.in);
        
        Applicant user1 = new Applicant();
        
        //instantiate an object of the admission logic class
        AdmissionLogic logicObj = new AdmissionLogic();
        
        //prompt the user to put their information in
        System.out.println("Enter applicant name: ");
        user1.name = inputObj.nextLine();
        
       
        System.out.println("Enter average mark: ");
        user1.average = inputObj.nextDouble();
        
        
        System.out.println("Did the student pass mathematics? (true/false): ");
        user1.mathsPassed = inputObj.nextBoolean();
        
        System.out.println("Enter applicant age: ");
        user1.age = inputObj.nextInt();
        
        //print applicant summary
        System.out.println("Applicant Summary");
        System.out.println("Name: " + user1.name);
        System.out.println("Average: "+ user1.average);
        System.out.println("Maths passed: "+ user1.mathsPassed);
        System.out.println("Decision: "+ logicObj.determineDecision(user1.average, user1.mathsPassed, user1.age ));
        System.out.println("This student qualifies for a scholarship: "+ logicObj.isScholarshipCandidate(user1.average));
        
    }
}
