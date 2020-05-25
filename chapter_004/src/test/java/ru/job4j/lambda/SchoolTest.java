package ru.job4j.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matchers;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SchoolTest {
    @Test
    public void getClassAList() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(0, "Sasha1"));
        studentList.add(new Student(20, "Sasha2"));
        studentList.add(new Student(49, "Sasha3"));
        studentList.add(new Student(50, "Sasha4"));
        studentList.add(new Student(69, "Sasha5"));
        studentList.add(new Student(70, "Sasha6"));
        studentList.add(new Student(99, "Sasha7"));
        studentList.add(new Student(100, "Sasha8"));
        School school = new School();
        int suitableStudentsCount = 3;
        final int lowLevel = 70;
        final int highLevel = 100;
        List<Student> actualStudents = school.collect(studentList,
                s -> s.getScore() >= lowLevel && s.getScore() <= highLevel);   // <=, чтобы учитывать 100 баллов
        for (Student actualStudent : actualStudents) {
            assertThat(actualStudent.getScore(), Matchers.greaterThan(lowLevel - 1));
        }
        for (Student actualStudent : actualStudents) {
            assertThat(actualStudent.getScore(), Matchers.lessThan(highLevel + 1)); // +1, чтобы учитывать 100 баллов
        }
        assertThat(actualStudents.size(), is(suitableStudentsCount));
    }

    @Test
    public void getClassBList() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(0, "Sasha1"));
        studentList.add(new Student(20, "Sasha2"));
        studentList.add(new Student(49, "Sasha3"));
        studentList.add(new Student(50, "Sasha4"));
        studentList.add(new Student(69, "Sasha5"));
        studentList.add(new Student(70, "Sasha6"));
        studentList.add(new Student(99, "Sasha7"));
        studentList.add(new Student(100, "Sasha8"));
        School school = new School();
        int suitableStudentsCount = 2;
        final int lowLevel = 50;
        final int highLevel = 70;
        List<Student> actualStudents = school.collect(studentList,
                s -> s.getScore() >= lowLevel && s.getScore() < highLevel);
        for (Student actualStudent : actualStudents) {
            assertThat(actualStudent.getScore(), Matchers.greaterThan(lowLevel - 1));
        }
        for (Student actualStudent : actualStudents) {
            assertThat(actualStudent.getScore(), Matchers.lessThan(highLevel));
        }
        assertThat(actualStudents.size(), is(suitableStudentsCount));
    }

    @Test
    public void getClassCList() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(0, "Sasha1"));
        studentList.add(new Student(20, "Sasha2"));
        studentList.add(new Student(49, "Sasha3"));
        studentList.add(new Student(50, "Sasha4"));
        studentList.add(new Student(69, "Sasha5"));
        studentList.add(new Student(70, "Sasha6"));
        studentList.add(new Student(99, "Sasha7"));
        studentList.add(new Student(100, "Sasha8"));
        School school = new School();
        int suitableStudentsCount = 3;
        final int lowLevel = 0;
        final int highLevel = 50;
        List<Student> actualStudents = school.collect(studentList,
                s -> s.getScore() >= lowLevel && s.getScore() < highLevel);
        for (Student actualStudent : actualStudents) {
            assertThat(actualStudent.getScore(), Matchers.greaterThan(lowLevel - 1));
        }
        for (Student actualStudent : actualStudents) {
            assertThat(actualStudent.getScore(), Matchers.lessThan(highLevel));
        }
        assertThat(actualStudents.size(), is(suitableStudentsCount));
    }
}