package ru.job4j.streamapi.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Matrix {
    public static List<Integer> flatMap(Integer[][] matrixArray) {
        return Arrays.stream(matrixArray)
                .flatMap(Stream::of).sorted()
                .collect(Collectors.toList());
    }
}
