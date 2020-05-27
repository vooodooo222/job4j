package ru.job4j.streamapi.filter;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SchoolTest {
    private final List<Student> studentList = new ArrayList<>();

    @Before
    public void setUp() {
        studentList.add(new Student(0, "Sasha1"));
        studentList.add(new Student(20, "Sasha2"));
        studentList.add(new Student(49, "Sasha3"));
        studentList.add(new Student(50, "Sasha4"));
        studentList.add(new Student(69, "Sasha5"));
        studentList.add(new Student(70, "Sasha6"));
        studentList.add(new Student(99, "Sasha7"));
        studentList.add(new Student(100, "Sasha8"));
    }

    @Test
    public void getClassAList() {
        School school = new School();
        final int lowLevel = 70;
        final int highLevel = 100;
        List<Student> actualStudents = school.collect(studentList,
                s -> s.getScore() >= lowLevel && s.getScore() <= highLevel);   // <=, чтобы учитывать 100 баллов
        List<Student> expectedStudents = new ArrayList<>();
        expectedStudents.add(new Student(70, "Sasha6"));
        expectedStudents.add(new Student(99, "Sasha7"));
        expectedStudents.add(new Student(100, "Sasha8"));
        assertThat(actualStudents, is(expectedStudents));
    }

    @Test
    public void getClassBList() {
        School school = new School();
        final int lowLevel = 50;
        final int highLevel = 70;
        List<Student> actualStudents = school.collect(studentList,
                s -> s.getScore() >= lowLevel && s.getScore() < highLevel);
        List<Student> expectedStudents = new ArrayList<>();
        expectedStudents.add(new Student(50, "Sasha4"));
        expectedStudents.add(new Student(69, "Sasha5"));
        assertThat(actualStudents, is(expectedStudents));
    }

    @Test
    public void getClassCList() {
        School school = new School();
        final int lowLevel = 0;
        final int highLevel = 50;
        List<Student> actualStudents = school.collect(studentList,
                s -> s.getScore() >= lowLevel && s.getScore() < highLevel);
        List<Student> expectedStudents = new ArrayList<>();
        expectedStudents.add(new Student(0, "Sasha1"));
        expectedStudents.add(new Student(20, "Sasha2"));
        expectedStudents.add(new Student(49, "Sasha3"));
        assertThat(actualStudents, is(expectedStudents));
    }
}