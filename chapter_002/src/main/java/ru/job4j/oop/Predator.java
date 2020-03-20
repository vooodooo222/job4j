package ru.job4j.oop;

public class Predator extends Animal {
    public Predator() {
        System.out.println("Created Predator");
    }

    public Predator(String name) {
        super("Predator");
        System.out.println("Created Predator: " + name);
    }
}
