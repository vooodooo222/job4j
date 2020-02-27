package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumNumbersFromZeroToTenThenFiftyFive() {
        int rsl = Counter.sum(0, 10);
        int expected = 55;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumNumbersFromNineToFourThenZero() {
        int rsl = Counter.sum(9, 4);
        int expected = 0;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumNumbersFromTwoToTwoThenZero() {
        int rsl = Counter.sum(2, 2);
        int expected = 2;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumNumbersFromNegativeNineToNineThenZero() {
        int rsl = Counter.sum(-9, 9);
        int expected = 0;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromNegativeNineToNineThenZero() {
        int rsl = Counter.sumByEven(-9, 9);
        int expected = 0;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromNegativeEightToEightThenZero() {
        int rsl = Counter.sumByEven(-8, 8);
        int expected = 0;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromNineToFourThenZero() {
        int rsl = Counter.sumByEven(9, 4);
        int expected = 0;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromTwoToTwoThenZero() {
        int rsl = Counter.sumByEven(2, 2);
        int expected = 2;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromOneToOneThenZero() {
        int rsl = Counter.sumByEven(1, 1);
        int expected = 0;
        assertThat(rsl, is(expected));
    }
}
