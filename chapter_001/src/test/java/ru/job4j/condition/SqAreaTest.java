package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
    @Test
    public void square() {
        int in_perimeter = 14;
        int in_coefficient = 2;
        double out = SqArea.square(in_perimeter, in_coefficient);
        Assert.assertEquals(10.88, out, 0.01);
    }
}
