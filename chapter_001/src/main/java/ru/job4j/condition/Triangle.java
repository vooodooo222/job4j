package ru.job4j.condition;

/**
 * Triangle
 * @author Aleksandrov Vladimir (lazer_shtamp@mail.ru)
 */
public class Triangle {
    /**
     * Точка A
     */
    private Point a;

    /**
     * Точка B
     */
    private Point b;

    /**
     * Точка C
     */
    private Point c;

    /**
     * Конструктор класса Triangle
     * @param a - точка A
     * @param b - точка B
     * @param c - точка C
     */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Метод вычисления полупериметра треугольника по длинам сторон.
     *
     * Формула.
     *
     * p = (ab + bc + ac) / 2
     *
     * @param ab расстояние между точками a b
     * @param bc расстояние между точками b c
     * @param ac расстояние между точками a c
     * @return Периметр.
     */
    public double halfPerimeter(double ab, double bc, double ac) {
        return (ab + bc + ac) / 2;
    }

    /**
     * Метод должен вычислить площадь треугольника.
     *
     * Формула Герона.
     *
     * S = √ p *(p - ab) * (p - bc) * (p - ac)
     *
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * @return Вернуть площадь, если треугольник существует или -1.
     */
    public double area() {
        double rsl = -1;
        double ab = a.distance(b);
        double bc = b.distance(c);
        double ac = a.distance(c);
        double p = halfPerimeter(ab, bc, ac);
        if (this.exist(ab, bc, ac)) {
            rsl = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
        }
        return rsl;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     * @param ab расстояние между точками a b
     * @param bc расстояние между точками b c
     * @param ac расстояние между точками a c
     * @return true в случае успеха, иначе false
     */
    protected boolean exist(double ab, double bc, double ac) {
        return (ab + ac > bc) && (ac + bc > ab) && (ab + bc > ac);
    }
}
