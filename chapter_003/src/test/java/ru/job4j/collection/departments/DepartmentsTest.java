package ru.job4j.collection.departments;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {

    @Before
    public void checkPerformanceOn() {
        Departments.checkPerformance = true;
    }

    @After
    public void checkPerformanceOff() {
        Departments.checkPerformance = false;
        System.out.println("");
    }

    @Test
    public void whenMissedAndSortNaturalOrderWithHashSet() {
        System.out.println(new Throwable().getStackTrace()[0].getMethodName());
        List<String> input = List.of("k1/sk1", "k2/sk1/ssk1");
        List<String> expect = List.of("k1", "k1/sk1", "k2", "k2/sk1", "k2/sk1/ssk1");
        List<String> result = Departments.fillGapsByHashSet(input, Comparator.naturalOrder());
        assertThat(result, is(expect));
    }

    @Test
    public void whenMissedAndSortReversOrderWithHashSet() {
        System.out.println(new Throwable().getStackTrace()[0].getMethodName());
        List<String> input = List.of("k1/sk1", "k2/sk1/ssk2", "k2/sk1/ssk1");
        List<String> expect = List.of("k2", "k2/sk1", "k2/sk1/ssk1", "k2/sk1/ssk2", "k1", "k1/sk1");
        List<String> result = Departments.fillGapsByHashSet(input, new DepDescComp());
        assertThat(result, is(expect));
    }

    @Test
    public void whenMissedAndSortNaturalOrderWithTreeSet() {
        System.out.println(new Throwable().getStackTrace()[0].getMethodName());
        List<String> input = List.of("k1/sk1", "k2/sk1/ssk1");
        List<String> expect = List.of("k1", "k1/sk1", "k2", "k2/sk1", "k2/sk1/ssk1");
        List<String> result = Departments.fillGapsByTreeSet(input, Comparator.naturalOrder());
        assertThat(result, is(expect));
    }

    @Test
    public void whenMissedAndSortReversOrderWithTreeSet() {
        System.out.println(new Throwable().getStackTrace()[0].getMethodName());
        List<String> input = List.of("k1/sk1", "k2/sk1/ssk2", "k2/sk1/ssk1");
        List<String> expect = List.of("k2", "k2/sk1", "k2/sk1/ssk1", "k2/sk1/ssk2", "k1", "k1/sk1");
        List<String> result = Departments.fillGapsByTreeSet(input, new DepDescComp());
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
        System.out.println(new Throwable().getStackTrace()[0].getMethodName());
        List<String> input = List.of("k1", "k1/sk1", "k2", "k2/sk1", "k2/sk1/ssk1");
        List<String> expect = List.of("k1", "k1/sk1", "k2", "k2/sk1", "k2/sk1/ssk1");
        List<String> result = Departments.fillGapsByHashSet(input, Comparator.naturalOrder());
        assertThat(result, is(expect));
    }
}