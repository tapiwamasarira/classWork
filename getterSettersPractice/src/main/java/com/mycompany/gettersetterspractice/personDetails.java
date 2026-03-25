
package com.mycompany.gettersetterspractice;

public class personDetails {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void displayDetails(){
        System.out.println("Your name: "+ name);
        System.out.println("Your age: "+ age);
    }
    
}
