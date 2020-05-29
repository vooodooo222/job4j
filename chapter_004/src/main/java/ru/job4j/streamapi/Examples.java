package ru.job4j.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class Examples {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 3, 1, 4, 6, 8, 2, 3, 9).stream().filter(
                p -> p % 2 == 0                 // 2, 4, 6, 8, 2
        ).sorted()                              // 2, 2, 4, 6, 8
                .distinct()                     // 2, 4, 6, 8
                .map(
                        f -> f / 2              // 1, 2, 3, 4
                ).collect(Collectors.toList());
        list.forEach(System.out::println);      // 1, 2, 3, 4
    }
}
