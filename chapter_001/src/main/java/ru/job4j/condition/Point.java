package ru.job4j.condition;

/**
 * Point
 * @author Aleksandrov Vladimir (lazer_shtamp@mail.ru)
 */
public class Point {
    /**
     * Считает дистанцию между двумя точками
     * @param x1 - координата X точки 1
     * @param y1 - координата Y точки 1
     * @param x2 - координата X точки 2
     * @param y2 - координата Y точки 2
     * @return значение дистанции между двумя точками
     */
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl1 = Math.pow((x2 - x1), 2);
        double rsl2 = Math.pow((y2 - y1), 2);
        double sumRes = rsl1 + rsl2;
        return Math.sqrt(sumRes);
    }

    /**
     * Вывод в консоль значение дистанции между двумя точками
     * @param args - args
     */
    public static void main(String[] args) {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double result = Point.distance(x1, y1, x2, y2);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
