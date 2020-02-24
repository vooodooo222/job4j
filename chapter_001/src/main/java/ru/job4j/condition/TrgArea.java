package ru.job4j.condition;

// p = (a + b + c) / 2;
// x = p * (p - a) * (p - b) * (p - c);
// s = sqrt(x);

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double x = p * (p - a) * (p - b) * (p - c);
        double rsl = Math.sqrt(x);
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
