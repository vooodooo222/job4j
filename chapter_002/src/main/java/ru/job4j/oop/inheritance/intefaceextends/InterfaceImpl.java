package ru.job4j.oop.inheritance.intefaceextends;

public class InterfaceImpl implements Interface0, Interface1, Interface2 {
    @Override
    public void method0() {
        System.out.println("0");
    }

    @Override
    public void method1() {
        System.out.println("1");
    }

    @Override
    public void method2() {
        System.out.println("2");
    }

    public static void main(String[] args) {
        Interface1 interface1 = new InterfaceImpl();
        interface1.method1();
        Interface2 interface2 = (Interface2) interface1;
        interface2.method2();
        // результат:
        // 1
        // 2
        Parent3 parent3 = new Parent3();
        parent3.m1();
        parent3.m2();
        parent3.m3();
        // результат:
        // m1
        // m2
        // m3
    }
}
