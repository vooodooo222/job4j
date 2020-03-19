package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void validAreaOfTriangle() {
        Point a = new Point(0, 0);
        Point b = new Point(3, 0);
        Point c = new Point(0, 6);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        Assert.assertEquals(8.99, result, 0.01);
    }

    @Test
    public void notValidAreaOfTriangle() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        Point c = new Point(4, 0);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        Assert.assertEquals(-1, result, 0.01);
    }

    @Test
    public void returnHalfPerimeterOfTriangle() {
        Point a = new Point(0, 0);
        Point b = new Point(3, 0);
        Point c = new Point(0, 6);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.halfPerimeter(a.distance(b), b.distance(c), a.distance(c));
        Assert.assertEquals(7.85, result, 0.01);
    }

    @Test
    public void whenExist() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        Point c = new Point(0, 2);
        Triangle triangle = new Triangle(a, b, c);
        double ab = a.distance(b);
        double bc = b.distance(c);
        double ac = a.distance(c);
        boolean result = triangle.exist(ab, bc, ac);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotExist() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        Point c = new Point(4, 0);
        Triangle triangle = new Triangle(a, b, c);
        double ab = a.distance(b);
        double bc = b.distance(c);
        double ac = a.distance(c);
        boolean result = triangle.exist(ab, bc, ac);
        assertThat(result, is(false));
    }
}
