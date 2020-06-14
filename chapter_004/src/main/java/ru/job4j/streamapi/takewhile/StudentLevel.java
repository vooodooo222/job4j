package ru.job4j.streamapi.takewhile;

import ru.job4j.streamapi.filter.Student;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentLevel {
    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .flatMap(Stream::ofNullable)
                .sorted((left, right) -> Integer.compare(left.getScore(), right.getScore()))
                .dropWhile(st -> st.getScore() < bound)
                .collect(Collectors.toList());
    }
}
