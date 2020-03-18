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
}
