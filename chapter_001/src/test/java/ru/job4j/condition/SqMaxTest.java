package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void max1() {
        int result = SqMax.max(7,4,6,5);
        assertThat(result, is(7));
    }

    @Test
    public void max2() {
        int result = SqMax.max(6,7,4,5);
        assertThat(result, is(7));
    }

    @Test
    public void max3() {
        int result = SqMax.max(6,4,7,5);
        assertThat(result, is(7));
    }

    @Test
    public void max4() {
        int result = SqMax.max(6,4,5,7);
        assertThat(result, is(7));
    }
}
