package ru.job4j.streamapi.tomap;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SchoolTest {
    private final List<Student> studentList = new ArrayList<>();

    @Before
    public void setUp() {
        studentList.add(new Student(69, "Sasha5"));
        studentList.add(new Student(70, "Sasha6"));
        studentList.add(new Student(99, "Sasha7"));
        studentList.add(new Student(100, "Sasha8"));
        studentList.add(new Student(0, "Sasha1"));
        studentList.add(new Student(20, "Sasha2"));
        studentList.add(new Student(49, "Sasha3"));
        studentList.add(new Student(50, "Sasha4"));
    }

    @Test
    public void getClassAList() {
        School school = new School();
        Map<String, Student> actualMapStudents = school.toMap(studentList,
                Student::getSurname,
                f -> f
        );
        Map<String, Student> expectedMapStudents = new HashMap<>();
        expectedMapStudents.put("Sasha1", new Student(0, "Sasha1"));
        expectedMapStudents.put("Sasha2", new Student(20, "Sasha2"));
        expectedMapStudents.put("Sasha3", new Student(49, "Sasha3"));
        expectedMapStudents.put("Sasha4", new Student(50, "Sasha4"));
        expectedMapStudents.put("Sasha5", new Student(69, "Sasha5"));
        expectedMapStudents.put("Sasha6", new Student(70, "Sasha6"));
        expectedMapStudents.put("Sasha7", new Student(99, "Sasha7"));
        expectedMapStudents.put("Sasha8", new Student(100, "Sasha8"));
        assertThat(actualMapStudents, is(expectedMapStudents));
    }
}