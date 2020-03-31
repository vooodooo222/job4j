package ru.job4j.patterns.simuduck.ducks;

import ru.job4j.patterns.simuduck.ducks.behaviors.fly.FlyWithWings;
import ru.job4j.patterns.simuduck.ducks.behaviors.quack.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        super.quackBehavior = new Quack();
        super.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I’m a real Redhead duck");
    }
}
