package ru.job4j.ex;

import org.junit.Test;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void factCalc() {
        new Fact().calc(-1);
    }
}