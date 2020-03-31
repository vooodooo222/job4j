package ru.job4j.patterns.simuduck.ducks;

import ru.job4j.patterns.simuduck.ducks.behaviors.fly.FlyNoWay;
import ru.job4j.patterns.simuduck.ducks.behaviors.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super.quackBehavior = new Squeak();
        super.flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I’m a real Rubber duck");
    }
}
