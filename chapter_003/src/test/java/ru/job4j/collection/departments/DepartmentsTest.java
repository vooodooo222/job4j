package ru.job4j.collection.departments;

import org.junit.Test;
import java.util.List;
import java.util.Arrays;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {
    @Test
    public void whenMissedAndSortNaturalOrder() {
        List<String> input = Arrays.asList("k1/sk1", "k2/sk1/ssk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1", "k2", "k2/sk1", "k2/sk1/ssk1");
        List<String> result = Departments.sortAsc(Departments.fillGaps(input));
        assertThat(result, is(expect));
    }

    @Test
    public void whenMissedAndSortReversOrder() {
        List<String> input = Arrays.asList("k1/sk1", "k2/sk1/ssk2", "k2/sk1/ssk1");
        List<String> expect = Arrays.asList("k2", "k2/sk1", "k2/sk1/ssk1", "k2/sk1/ssk2", "k1", "k1/sk1");
        List<String> result = Departments.sortDesc(Departments.fillGaps(input));
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
        List<String> input = Arrays.asList("k1", "k1/sk1", "k2", "k2/sk1", "k2/sk1/ssk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1", "k2", "k2/sk1", "k2/sk1/ssk1");
        List<String> result = Departments.sortAsc(Departments.fillGaps(input));
        assertThat(result, is(expect));
    }
}