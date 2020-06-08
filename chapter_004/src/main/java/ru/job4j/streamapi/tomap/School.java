package ru.job4j.streamapi.tomap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class School {
    public Map<String, Student> toMap(List<Student> students) {
        return students.stream().collect(Collectors.toMap(
                Student::getSurname,
                s -> s,
                (s1, s2) -> s1
                )
        );
    }
}
