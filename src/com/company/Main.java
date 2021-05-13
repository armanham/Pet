package com.company;

public class Main {

    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.setName("Pet");
        pet.setAnimal("Cat");
        pet.setAge(7);
        System.out.println(pet.getName());
        System.out.println(pet.getAnimal());
        System.out.println(pet.getAge());
    }
}
