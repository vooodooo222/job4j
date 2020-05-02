package ru.job4j.collection.headfirst;

import java.util.ArrayList;

public class TestGenerics {
    public static void main(String[] args) {
        new TestGenerics().go();
    }

    public void go() {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        takeAnimals(animals);       // everything works well
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        takeAnimals(dogs);       // compiling error!!!
    }

    public void takeAnimals(ArrayList<Animal> animals) {
        animals.add(new Cat()); // there is a problem in that List Dogs can`t store objects Cat
        for (Animal a : animals) {
            a.eat();
        }
    }
}

abstract class Animal {
    void eat() {
        System.out.println("животное ecт");
    }
}

class Dog extends Animal {
    void bark() { }
}

class Cat extends Animal {
    void meow() { }
}
