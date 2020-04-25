package ru.job4j.collection.sort;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;
import java.util.Arrays;

public class LexSortTest {
    @Test
    public void sortNum1and2and10() {
        String[] input = {
                "100.1.2. Task.B",
                "10.1. Task.",
                "1. Task.",
                "2.1. TaskA.",
                "2.2. Task.",
                "2.1. TaskB.",
                "100.1.2. Task.A",
                "20. Task."
        };
        String[] out = {
                "1. Task.",
                "2.1. TaskA.",
                "2.1. TaskB.",
                "2.2. Task.",
                "10.1. Task.",
                "20. Task.",
                "100.1.2. Task.A",
                "100.1.2. Task.B"
        };
        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }
}