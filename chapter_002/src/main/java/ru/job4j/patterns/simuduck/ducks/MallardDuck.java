package ru.job4j.patterns.simuduck.ducks;

import ru.job4j.patterns.simuduck.ducks.behaviors.fly.FlyWithWings;
import ru.job4j.patterns.simuduck.ducks.behaviors.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I’m a real Mallard duck");
    }
}
