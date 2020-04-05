package ru.job4j.oop.composition;

/**
 * Пример множетвенного наследования через композицию
 */
public class C {
    private A a = new A();
    private B b = new B();

    public void mA() {
        a.mA();
    }

    public void mB() {
        b.mB();
    }

    public void mC() {
        System.out.println("mC");
    }

    public static void main(String[] args) {
        C c = new C();
        c.mA();
        c.mB();
        c.mC();
        // результат:
        // mA
        // mB
        // mC
    }
}
