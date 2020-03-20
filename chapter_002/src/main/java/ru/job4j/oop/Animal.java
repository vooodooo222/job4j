package ru.job4j.oop;

public class Animal {
    public Animal() {
        super();
        System.out.println("Created Animal");
    }

    public Animal(String name) {
        super();
        System.out.println("Created Animal: " + name);
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger("Kesha");
    }
}
