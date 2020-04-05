package ru.job4j.oop.inheritance.intefaceextends;

public class Parent3 implements IParent1, IParent2 {
    @Override
    public void m1() {
        new Parent1().m1();
    }

    @Override
    public void m2() {
        new Parent2().m2();
    }

    public void m3() {
        System.out.println("m3");
    }
}
