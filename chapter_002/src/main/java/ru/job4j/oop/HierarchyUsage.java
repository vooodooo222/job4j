package ru.job4j.oop;

import java.lang.Object;

public class HierarchyUsage {
    public static void main(String[] args) {
        // создаем объекта класса Car.
        Car car = new Car();
        // делаем приведение к типу родителя Transport.
        Transport tp = car;
        // делаем приведение к типу родителя Object.
        Object obj = car;
        // Приведение типа при создании объекта.
        Object ocar = new Car();
        // Приведение типа за счет понижения по иерархии.
        Car carFromObject = (Car) ocar;

        // Ошибка в приведении типа.
        Object bicycle = new Bicycle();
        //Car cb = (Car) bicycle; // код завершится с ошибок приведения типов ClassCastException
    }
}
