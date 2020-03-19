package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To1Then1() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To2Then2() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To3To4Then4() {
        int result = Max.max(2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax4To3To2Then2() {
        int result = Max.max(4, 3, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax3To4To2Then4() {
        int result = Max.max(3, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax2To4To3Then2() {
        int result = Max.max(2, 4, 3);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax2To3To4To5Then4() {
        int result = Max.max(2, 3, 4, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax5To4To3To2Then2() {
        int result = Max.max(5, 4, 3, 2);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax3To5To4To2Then4() {
        int result = Max.max(3, 5, 4, 2);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax2To5To4To3Then2() {
        int result = Max.max(2, 5, 4, 3);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax3To4To5To2Then4() {
        int result = Max.max(3, 4, 5, 2);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax2To4To5To3Then2() {
        int result = Max.max(2, 4, 5, 3);
        assertThat(result, is(5));
    }
}
