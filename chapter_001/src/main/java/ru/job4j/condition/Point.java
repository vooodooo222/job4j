package ru.job4j.condition;

/**
 * Point
 * @author Aleksandrov Vladimir (lazer_shtamp@mail.ru)
 */
public class Point {
    /**
     * Координата X
     */
    private int x;

    /**
     * Координата Y
     */
    private int y;

    /**
     * Координата Z
     */
    private int z;

    /**
     * Конструктор класса Point для двумерной плоскости
     * @param x - координата X
     * @param y - координата Y
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Конструктор класса Point для трехмерного пространства
     * @param x - координата X
     * @param y - координата Y
     * @param z - координата Z
     */
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Считает дистанцию между текущей точкой и указанной точкой во входном параметре
     * @param that - точка 2
     * @return значение дистанции между текущей точкой и указанной точкой во входном параметре
     */
    public double distance(Point that) {
        return Math.sqrt(Math.pow((that.x - this.x), 2) + Math.pow((that.y - this.y), 2));
    }

    /**
     * Считает дистанцию между текущей точкой и указанной точкой во входном параметре в трехмерном пространстве
     * @param that - точка 2 в трехмерном пространстве
     * @return значение дистанции между текущей точкой и указанной точкой во входном параметре
     */
    public double distance3d(Point that) {
        return Math.sqrt(Math.pow((that.x - this.x), 2) + Math.pow((that.y - this.y), 2) + Math.pow((that.z - this.z), 2));
    }

    /**
     * Вывод в консоль значение дистанции между двумя точками
     * @param args - args
     */
    public static void main(String[] args) {
        Point a = new Point(3, 2);
        Point b = new Point(5, 5);
        double result = a.distance(b);
        System.out.println("result (3, 2) to (5, 5) " + result);
    }
}
