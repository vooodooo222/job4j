package ru.job4j.streamapi.filter;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.*;

public class School {
    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toList());
    }
}
