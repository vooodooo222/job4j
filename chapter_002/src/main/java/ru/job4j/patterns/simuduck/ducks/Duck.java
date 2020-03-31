package ru.job4j.patterns.simuduck.ducks;

import ru.job4j.patterns.simuduck.ducks.behaviors.fly.FlyBehavior;
import ru.job4j.patterns.simuduck.ducks.behaviors.quack.QuackBehavior;

public abstract class Duck {

    /**
     * Аспект/алгоритм поведения - летать
     */
    FlyBehavior flyBehavior;

    /**
     * Аспект/алгоритм поведения - крякать
     */
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    /**
     * Делегирование операции классам аспекта/алгоритма поведения - летать
     */
    public void performFly() {
        flyBehavior.fly();
    }

    /**
     * Делегирование операции классам аспекта/алгоритма поведения - крякать
     */
    public void performQuack() {
        quackBehavior.quack();
    }

    /**
     * Динамическая смена операции аспектам/алгоритма поведения - летать
     */
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    /**
     * Динамическая смена операции аспекта/алгоритма поведения - крякать
     */
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

}
