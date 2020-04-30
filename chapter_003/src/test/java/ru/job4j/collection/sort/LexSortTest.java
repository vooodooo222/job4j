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
                "100.1.2. Tas",
                "Z2.2",
                "2.1. TaskA.",
                "Z2",
                "MN",
                "2.2. Task.",
                "2.1. TaskB.",
                "Z1",
                "100.1.2. Task.2.B",
                "AZ",
                "100.1.2. Task.A",
                "NM",
                "100.1.2. Task.2.A",
                "Z2.1",
                "100.1.2. Tas",
                "20. Task."
        };
        String[] out = {
                "1. Task.",
                "2.1. TaskA.",
                "2.1. TaskB.",
                "2.2. Task.",
                "10.1. Task.",
                "20. Task.",
                "100.1.2. Tas",
                "100.1.2. Tas",
                "100.1.2. Task.2.A",
                "100.1.2. Task.2.B",
                "100.1.2. Task.A",
                "100.1.2. Task.B",
                "AZ",
                "MN",
                "NM",
                "Z1",
                "Z2",
                "Z2.1",
                "Z2.2"
        };
        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }


    @Test
    public void sortIncorrectNum() {
        String[] input = {
                "1zz.1.2. Tas",
                "1aa.1.2. Tas",
                "1z2.1.2. Tas",
                "1z10.1.2. Tas",
        };
        String[] out = {
                "1aa.1.2. Tas",
                "1z10.1.2. Tas",
                "1z2.1.2. Tas",
                "1zz.1.2. Tas",
        };
        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }
}