package ru.job4j.patterns.simuduck.ducks.behaviors.quack;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack-quack");
    }
}
