package com.mycompany.gr4moremethods;
public class Animal {
    private String animalName;
    private int animalAge;
    private String breed;
    private String colour;
    public Animal(String name, int age, String breed, String color){
        animalName = name;
        animalAge = age;
        this.breed = breed;
        colour = color;
        
    }
    public void printAnimalDetails(){
        System.out.println("Animal: " + animalName);
        System.out.println("Animal age: "+ animalAge);
        System.out.println("Animal Breed: " + breed);
        System.out.println("Animal Colour: " + colour);
    }
    
}
