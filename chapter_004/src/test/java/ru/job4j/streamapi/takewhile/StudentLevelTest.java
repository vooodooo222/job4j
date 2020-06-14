package ru.job4j.streamapi.takewhile;

import org.junit.Test;
import ru.job4j.streamapi.filter.Student;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StudentLevelTest {
    @Test
    public void whenSorted() {
        List<Student> input = new ArrayList<>();
        input.add(new Student(15, "Sasha"));
        input.add(new Student(128, "Pety"));
        input.add(new Student(28, "Masha"));
        input.add(new Student(10, "Egor"));
        List<Student> expected = List.of(
                new Student(28, "Masha"),
                new Student(128, "Pety")
        );
        assertThat(StudentLevel.levelOf(input, 20), is(expected));
    }

    @Test
    public void whenOnlyNull() {
        List<Student> input = new ArrayList<>();
        input.add(null);
        List<Student> expected = List.of();
        assertThat(StudentLevel.levelOf(input, 100), is(expected));
    }

    @Test
    public void whenHasNull() {
        List<Student> input = new ArrayList<>();
        input.add(null);
        input.add(new Student(28, "Pety"));
        List<Student> expected = List.of(new Student(28, "Pety"));
        assertThat(StudentLevel.levelOf(input, 10), is(expected));
    }
}