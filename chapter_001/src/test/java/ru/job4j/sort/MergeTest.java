package ru.job4j.sort;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@Ignore
public class MergeTest {
    @Test
    public void whenBothEmpty() {
        Merge algo = new Merge();
        int[] expect = new int[0];
        int[] result = algo.merge(
                new int[0],
                new int[0]
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenAscOrder() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 4};
        int[] result = algo.merge(
                new int[] {1, 2},
                new int[] {3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftLess() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 3, 4};
        int[] result = algo.merge(
                new int[] {1, 2, 3},
                new int[] {3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftGreat() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 4, 4};
        int[] result = algo.merge(
                new int[] {1, 2},
                new int[] {3, 4, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftEmpty() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 4};
        int[] result = algo.merge(
                new int[] {},
                new int[] {1, 2, 3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenBothFillZero() {
        Merge algo = new Merge();
        int[] expect = {0, 0, 0, 0, 0, 0, 0, 0};
        int[] result = algo.merge(
                new int[] {0, 0, 0, 0},
                new int[] {0, 0, 0, 0}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void testFillValueFromSlaveUntilMasterCellLargest() {
        SortedQueue master = new SortedQueue(new int[]{7});
        SortedQueue slave = new SortedQueue(new int[]{2, 4, 6, 8});
        SortedQueue rsl = new SortedQueue(new int[master.length + slave.length]);
        Merge mergeAlgorithm = new Merge();
        mergeAlgorithm.fillValueFromSlaveUntilMasterCellLargest(master, slave, rsl);
        int[] expect = {2, 4, 6, 7, 0};
        int[] result = new int[5];
        rsl.setArray(result);
        assertThat(result, is(expect));
    }
}