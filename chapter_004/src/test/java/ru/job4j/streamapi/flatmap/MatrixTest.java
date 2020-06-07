package ru.job4j.streamapi.flatmap;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void getClassAList() {
        Integer[][] matrixArray = new Integer[][]
                {
                        {0, 1, 2},
                        {9, 8, 7},
                        {3, 4, 5}
                };
        List<Integer> actualCollection = Matrix.flatMap(matrixArray);
        List<Integer> expectedCollection = Arrays.asList(0, 1, 2, 3, 4, 5, 7, 8, 9);
        assertThat(actualCollection, is(expectedCollection));
    }
}