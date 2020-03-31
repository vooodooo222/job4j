package ru.job4j.patterns.simuduck.ducks.behaviors.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("“<< Silence >>");
    }
}
