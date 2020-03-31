package ru.job4j.patterns.simuduck.ducks.behaviors.quack;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("squack-squack");
    }
}
