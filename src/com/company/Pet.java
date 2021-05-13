package com.company;

public class Pet {
    private String name;
    private String animal;
    private int age;
    
     public Pet(String name, String animal, int age) {
        setName(name);
        setAnimal(animal);
        setAge(age);
    }

    public Pet() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Try again!");
        }
    }

    public String getName() {
        System.out.print("Name: ");
        return name;
    }

    public String getAnimal() {
        System.out.print("Animal: ");
        return animal;
    }

    public int getAge() {
        System.out.print("Age: ");
        return age;
    }
}
