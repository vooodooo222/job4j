package ru.job4j.patterns.simuduck.ducks;

import ru.job4j.patterns.simuduck.ducks.behaviors.fly.FlyNoWay;
import ru.job4j.patterns.simuduck.ducks.behaviors.quack.Quack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I’m a real Decoy duck");
    }
}
