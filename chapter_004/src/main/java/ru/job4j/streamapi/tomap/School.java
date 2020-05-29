package ru.job4j.streamapi.tomap;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class School {
    public Map<String, Student> toMap(List<Student> students,
                                      Function<Student, String> function1,
                                      Function<Student, Student> function2) {
        return students.stream().collect(Collectors.toMap(function1, function2));
    }
}
