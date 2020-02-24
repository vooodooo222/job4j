package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        int in_x1 = 0;
        int in_x2 = 2;
        int in_y1 = 0;
        int in_y2 = 0;
        double out = Point.distance(in_x1, in_y1, in_x2, in_y2);
        Assert.assertEquals(2.0, out, 0.1);
    }
}
