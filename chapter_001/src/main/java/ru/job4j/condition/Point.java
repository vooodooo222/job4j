package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
//        System.out.println("x1:" + x1 + " x2:" + x2 + " y1:" + y1 + " y2:" + y2);

        double rsl1 = Math.pow( (x2 - x1), 2 );
//        System.out.println("(x2 - x1)^2 = " + rsl1);

        double rsl2 = Math.pow( (y2 - y1), 2 );
//        System.out.println("(y2 - y1)^2 = " + rsl2);

        double sumRes = rsl1 + rsl2;
//        System.out.println("rsl1 + rsl2 = " + sumRes);

        return Math.sqrt(sumRes);
    }

    public static void main(String[] args) {
        int x1 = 0;
        int x2 = 2;
        int y1 = 0;
        int y2 = 0;
        double result = Point.distance(x1, y1, x2, y2);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
