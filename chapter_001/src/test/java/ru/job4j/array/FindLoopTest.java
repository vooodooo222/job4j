package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHasNot5ThenNegative() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {4, 10, 3};
        int value = 5;
        int indexFound = find.indexOf(input, value);
        int indexExpect = -1;
        assertThat(indexFound, is(indexExpect));
    }

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int indexFound = find.indexOf(input, value);
        int indexExpect = 0;
        assertThat(indexFound, is(indexExpect));
    }

    @Test
    public void whenFind3() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int startIndex = 2;
        int finishIndex = 4;
        int indexFound = find.indexOf(input, value, startIndex, finishIndex);
        int indexExpect = 3;
        assertThat(indexFound, is(indexExpect));
    }

    @Test
    public void whenFind44() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 2, 10, 2, 44};
        int value = 44;
        int startIndex = 0;
        int finishIndex = 4;
        int indexFound = find.indexOf(input, value, startIndex, finishIndex);
        int indexExpect = 4;
        assertThat(indexFound, is(indexExpect));
    }

    @Test
    public void whenStartIndexOutOfBoundsThenNegative() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int startIndex = -1;
        int finishIndex = 4;
        int indexFound = find.indexOf(input, value, startIndex, finishIndex);
        int indexExpect = -1;
        assertThat(indexFound, is(indexExpect));
    }

    @Test
    public void whenFinishIndexOutOfBoundsThenNegative() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int startIndex = 2;
        int finishIndex = 6;
        int indexFound = find.indexOf(input, value, startIndex, finishIndex);
        int indexExpect = -1;
        assertThat(indexFound, is(indexExpect));
    }

    @Test
    public void whenArrayIsEmptyThenNegative() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {};
        int value = 2;
        int startIndex = 0;
        int finishIndex = 1;
        int indexFound = find.indexOf(input, value, startIndex, finishIndex);
        int indexExpect = -1;
        assertThat(indexFound, is(indexExpect));
    }
}
