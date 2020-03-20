package ru.job4j.oop;

public class Tiger extends Predator {
    public Tiger() {
        System.out.println("Created Tiger");
    }

    public Tiger(String name) {
        super("Tiger");
        System.out.println("Created Tiger: " + name);
    }
}
