package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        Point a = new Point(3, 2);
        Point b = new Point(5, 5);
        double out = a.distance(b);
        Assert.assertEquals(3.6, out, 0.1);
    }

    @Test
    public void distance3d() {
        Point a = new Point(3, 2, 1);
        Point b = new Point(5, 5, 2);
        double out = a.distance3d(b);
        Assert.assertEquals(3.74, out, 0.01);
    }
}
