package ru.job4j.condition;

// В программе известны периметр прямоугольника и коэффициент K.
// нужно по этим параметрам вычислить длину и высоту прямоугольника, а потом вычислить площадь полученного прямоугольника.
// L = h * k;
// p = 2 * (L + h); где L - длина, h - высота
// p = 2 * (h * k + h);
// p = 2 * h * (k + 1);
// h * 2 * (k + 1) = p;
// h = p / 2 * (k + 1);
// s = L * h; - формула для вычисления площади прямоугольника.

public class SqArea {
    public static double square(int perimeter, int coefficient) {

        double height = (float)perimeter / ( 2 * (coefficient + 1) );
//        System.out.println("height=" + height);
        double length = height * coefficient;
//        System.out.println("length=" + length);
        double rsl = length * height;
        return rsl;
    }

    public static void main(String[] args) {
        int perimeter = 14;
        int coefficient = 2;
        double square = SqArea.square(perimeter, coefficient);
        System.out.println("perimeter = " + perimeter + "\ncoefficient = " + coefficient + "\nsquare = " + square);
    }
}
