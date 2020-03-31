package ru.job4j.patterns.simuduck.ducks.behaviors.fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("duck can`t fly");
    }
}
