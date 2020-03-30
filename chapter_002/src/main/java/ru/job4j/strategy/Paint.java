package ru.job4j.strategy;

public class Paint {
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    public static void main(String[] args) {
        Shape shape = new Triangle();
        new Paint().draw(shape);
        shape = new Square();
        new Paint().draw(shape);
    }
}
