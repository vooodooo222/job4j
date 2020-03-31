package ru.job4j.patterns.simuduck;

import ru.job4j.patterns.simuduck.ducks.*;
import ru.job4j.patterns.simuduck.ducks.behaviors.fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.performQuack();
        duck.performFly();
        duck = new RedheadDuck();
        duck.display();
        duck.performQuack();
        duck.performFly();
        duck = new DecoyDuck();
        duck.display();
        duck.performQuack();
        duck.performFly();
        duck = new RubberDuck();
        duck.display();
        duck.performQuack();
        duck.performFly();
        Duck model = new ModelDuck();
        model.display();
        model.performFly(); // не умеет летать
        model.setFlyBehavior(new FlyRocketPowered());   // даем возможность летать с рекативным двигателем
        model.performFly();
        // Способность утки-model к полету переключается динамически! Если бы
        //реализация находилась в иерархии Duck, ТАКОЕ было бы невозможно
    }
}
