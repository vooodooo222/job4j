package ru.job4j.lambda;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FunctionCalculateTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        // y=kx+b
        FunctionCalculate function = new FunctionCalculate();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        // y=ax^2+bx+c
        FunctionCalculate function = new FunctionCalculate();
        List<Double> result = function.diapason(1, 4, x -> Math.pow(2 * x, 2) + (3 * x) + 1);
        List<Double> expected = Arrays.asList(8D, 23D, 46D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSignificantFunctionThenSignificantResults() {
        // y=a^x
        FunctionCalculate function = new FunctionCalculate();
        List<Double> result = function.diapason(1, 4, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(2D, 4D, 8D);
        assertThat(result, is(expected));
    }
}