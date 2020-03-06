package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {

    @Test
    public void max11() {
        int result = SqMax.max(4, 1, 2, 3);
        assertThat(result, is(4));
    }

    @Test
    public void max12() {
        int result = SqMax.max(4, 1, 3, 2);
        assertThat(result, is(4));
    }

    @Test
    public void max13() {
        int result = SqMax.max(4, 2, 1, 3);
        assertThat(result, is(4));
    }

    @Test
    public void max14() {
        int result = SqMax.max(4, 3, 1, 2);
        assertThat(result, is(4));
    }

    @Test
    public void max15() {
        int result = SqMax.max(4, 2, 3, 1);
        assertThat(result, is(4));
    }

    @Test
    public void max16() {
        int result = SqMax.max(4, 3, 2, 1);
        assertThat(result, is(4));
    }


    @Test
    public void max21() {
        int result = SqMax.max(1, 4, 2, 3);
        assertThat(result, is(4));
    }

    @Test
    public void max22() {
        int result = SqMax.max(1, 4, 3, 2);
        assertThat(result, is(4));
    }

    @Test
    public void max23() {
        int result = SqMax.max(2, 4, 1, 3);
        assertThat(result, is(4));
    }

    @Test
    public void max24() {
        int result = SqMax.max(2, 4, 3, 1);
        assertThat(result, is(4));
    }

    @Test
    public void max25() {
        int result = SqMax.max(3, 4, 1, 2);
        assertThat(result, is(4));
    }

    @Test
    public void max26() {
        int result = SqMax.max(3, 4, 2, 1);
        assertThat(result, is(4));
    }

    @Test
    public void max31() {
        int result = SqMax.max(1, 2, 4, 3);
        assertThat(result, is(4));
    }

    @Test
    public void max32() {
        int result = SqMax.max(2, 1, 4, 3);
        assertThat(result, is(4));
    }

    @Test
    public void max33() {
        int result = SqMax.max(3, 1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void max34() {
        int result = SqMax.max(3, 2, 4, 1);
        assertThat(result, is(4));
    }

    @Test
    public void max35() {
        int result = SqMax.max(1, 3, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void max36() {
        int result = SqMax.max(2, 3, 4, 1);
        assertThat(result, is(4));
    }

    @Test
    public void max41() {
        int result = SqMax.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void max42() {
        int result = SqMax.max(1, 3, 2, 4);
        assertThat(result, is(4));
    }

    @Test
    public void max43() {
        int result = SqMax.max(2, 1, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void max44() {
        int result = SqMax.max(2, 3, 1, 4);
        assertThat(result, is(4));
    }

    @Test
    public void max45() {
        int result = SqMax.max(3, 2, 1, 4);
        assertThat(result, is(4));
    }

    @Test
    public void max46() {
        int result = SqMax.max(3, 1, 2, 4);
        assertThat(result, is(4));
    }

}
