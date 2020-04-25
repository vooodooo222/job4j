package ru.job4j.collection.sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompareNameByIncreasing() {
        int rsl = new JobDescByNameByIncreasing().compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 0)
        );
        assertThat(rsl, greaterThan(0));
        rsl = new JobDescByNameByIncreasing().compare(
                new Job("Fix bug", 0),
                new Job("Impl task", 0)
        );
        assertThat(rsl, lessThan(0));
        rsl = new JobDescByNameByIncreasing().compare(
                new Job("Fix bug", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, equalTo(0));
    }

    @Test
    public void whenCompareNameByDecreasing() {
        int rsl = new JobDescByNameByDecreasing().compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 0)
        );
        assertThat(rsl, lessThan(0));
        rsl = new JobDescByNameByDecreasing().compare(
                new Job("Fix bug", 0),
                new Job("Impl task", 0)
        );
        assertThat(rsl, greaterThan(0));
        rsl = new JobDescByNameByDecreasing().compare(
                new Job("Fix bug", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, equalTo(0));
    }

    @Test
    public void whenComparePriorityByIncreasing() {
        int rsl = new JobDescByPriorityByIncreasing().compare(
                new Job("Fix bug", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
        rsl = new JobDescByPriorityByIncreasing().compare(
                new Job("Fix bug", 1),
                new Job("Fix bug", 0)
        );
        assertThat(rsl, greaterThan(0));
        rsl = new JobDescByPriorityByIncreasing().compare(
                new Job("Fix bug", 0),
                new Job("X bug", 0)
        );
        assertThat(rsl, equalTo(0));
    }

    @Test
    public void whenComparePriorityByDecreasing() {
        int rsl = new JobDescByPriorityByDecreasing().compare(
                new Job("Fix bug", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
        rsl = new JobDescByPriorityByDecreasing().compare(
                new Job("Fix bug", 1),
                new Job("Fix bug", 0)
        );
        assertThat(rsl, lessThan(0));
        rsl = new JobDescByPriorityByDecreasing().compare(
                new Job("Fix bug", 0),
                new Job("X bug", 0)
        );
        assertThat(rsl, equalTo(0));
    }

    @Test
    public void whenCompareNameByIncreasingAndPriorityByIncreasing() {
        Comparator<Job> cmpNamePriorityByIncreasing =
                new JobDescByNameByIncreasing().thenComparing(
                        new JobDescByPriorityByIncreasing());
        int rsl = cmpNamePriorityByIncreasing.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
        rsl = cmpNamePriorityByIncreasing.compare(
                new Job("Fix bug", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompareNameByDecreasingAndPriorityByDecreasing() {
        Comparator<Job> cmpNamePriorityByDecreasing =
                new JobDescByNameByDecreasing().thenComparing(
                        new JobDescByPriorityByDecreasing());
        int rsl = cmpNamePriorityByDecreasing.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
        rsl = cmpNamePriorityByDecreasing.compare(
                new Job("Fix bug", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompareNameByIncreasingAndPriorityByDecreasing() {
        Comparator<Job> cmpNameByIncreasingPriorityByDecreasing =
                new JobDescByNameByIncreasing().thenComparing(
                        new JobDescByPriorityByDecreasing());
        int rsl = cmpNameByIncreasingPriorityByDecreasing.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
        rsl = cmpNameByIncreasingPriorityByDecreasing.compare(
                new Job("Fix bug", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompareNameByDecreasingAndPriorityByIncreasing() {
        Comparator<Job> cmpNameByDecreasingPriorityByIncreasing =
                new JobDescByNameByDecreasing().thenComparing(
                        new JobDescByPriorityByIncreasing());
        int rsl = cmpNameByDecreasingPriorityByIncreasing.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
        rsl = cmpNameByDecreasingPriorityByIncreasing.compare(
                new Job("Fix bug", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenSortByNameByIncreasingAndPriorityByIncreasing() {
        Comparator<Job> cmpNameByIncreasingPriorityByIncreasing =
                new JobDescByNameByIncreasing().thenComparing(
                        new JobDescByPriorityByIncreasing());
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        jobs.sort(cmpNameByIncreasingPriorityByIncreasing);
        assertThat(jobs.get(0).getName(), is("Fix bug"));
        assertThat(jobs.get(3).getName(), is("X task"));
        assertThat(jobs.get(0).getPriority(), is(1));
        assertThat(jobs.get(3).getPriority(), is(0));
    }

    @Test
    public void whenSortByNameByDecreasingAndPriorityByDecreasing() {
        Comparator<Job> cmpNameByDecreasingPriorityByDecreasing =
                new JobDescByNameByDecreasing().thenComparing(
                        new JobDescByPriorityByDecreasing());
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        jobs.sort(cmpNameByDecreasingPriorityByDecreasing);
        assertThat(jobs.get(0).getName(), is("X task"));
        assertThat(jobs.get(3).getName(), is("Fix bug"));
        assertThat(jobs.get(0).getPriority(), is(0));
        assertThat(jobs.get(3).getPriority(), is(1));
    }

    @Test
    public void whenSortByNameByIncreasingAndPriorityByDecreasing() {
        Comparator<Job> cmpNameByIncreasingPriorityByDecreasing =
                new JobDescByNameByIncreasing().thenComparing(
                        new JobDescByPriorityByDecreasing());
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        jobs.sort(cmpNameByIncreasingPriorityByDecreasing);
        assertThat(jobs.get(0).getName(), is("Fix bug"));
        assertThat(jobs.get(3).getName(), is("X task"));
        assertThat(jobs.get(0).getPriority(), is(4));
        assertThat(jobs.get(3).getPriority(), is(0));
    }

    @Test
    public void whenSortByNameByDecreasingAndPriorityByIncreasing() {
        Comparator<Job> cmpNameByDecreasingPriorityByIncreasing =
                new JobDescByNameByDecreasing().thenComparing(
                        new JobDescByPriorityByIncreasing());
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        jobs.sort(cmpNameByDecreasingPriorityByIncreasing);
        assertThat(jobs.get(0).getName(), is("X task"));
        assertThat(jobs.get(3).getName(), is("Fix bug"));
        assertThat(jobs.get(0).getPriority(), is(0));
        assertThat(jobs.get(3).getPriority(), is(4));
    }
}