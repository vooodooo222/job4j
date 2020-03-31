package ru.job4j.patterns.simuduck.ducks.behaviors.fly;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("duck fly with wings");
    }
}
