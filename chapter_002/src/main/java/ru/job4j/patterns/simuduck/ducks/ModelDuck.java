package ru.job4j.patterns.simuduck.ducks;

import ru.job4j.patterns.simuduck.ducks.behaviors.fly.FlyNoWay;
import ru.job4j.patterns.simuduck.ducks.behaviors.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        super.flyBehavior = new FlyNoWay();
        super.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I’m a model duck");
    }
}
