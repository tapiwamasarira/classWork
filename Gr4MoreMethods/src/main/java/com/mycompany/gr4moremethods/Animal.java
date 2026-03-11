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

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public String getBreed() {
        return breed;
    }

    public String getColour() {
        return colour;
    }
    
    
}
