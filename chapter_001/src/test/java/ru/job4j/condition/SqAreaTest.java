package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
    @Test
    public void square() {
        int inPerimeter = 14;
        int inCoefficient = 2;
        double out = SqArea.square(inPerimeter, inCoefficient);
        Assert.assertEquals(10.88, out, 0.01);
    }
}
