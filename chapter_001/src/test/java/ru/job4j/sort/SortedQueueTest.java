package ru.job4j.sort;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SortedQueueTest {
    @Test
    public void testViewValue() {
        SortedQueue sortedQueue = new SortedQueue(new int[]{3, 4, 7});
        sortedQueue.currentReadCell.index = 1;
        int expect = 4;
        int result = sortedQueue.viewValue();
        assertThat(result, is(expect));
    }

    @Test
    public void testPushOutValue() {
        SortedQueue sortedQueue = new SortedQueue(new int[]{3, 4, 7});
        sortedQueue.currentReadCell.index = 2;
        int expect = 7;
        int result = sortedQueue.pushOutValue();
        assertThat(result, is(expect));
        boolean booleanExpect = true;
        boolean booleanResult = sortedQueue.empty();
        assertThat(booleanResult, is(booleanExpect));
    }

    @Test
    public void testWrite() {
        SortedQueue sortedQueue = new SortedQueue(new int[]{3, 4, 7});
        sortedQueue.currentWriteCell.index = 2;
        sortedQueue.write(9);
        sortedQueue.currentReadCell.index = 2;
        int expect = 9;
        int result = sortedQueue.viewValue();
        assertThat(result, is(expect));
    }

    @Test
    public void testSetArray() {
        SortedQueue sortedQueue = new SortedQueue(new int[]{3, 4, 7});
        int[] expect = new int[]{3, 4, 7};
        int[] result = new int[]{0, 0, 0};
        sortedQueue.setArray(result);
        assertThat(result, is(expect));
    }

    @Test
    public void testEmpty() {
        SortedQueue sortedQueue = new SortedQueue(new int[0]);
        boolean expect = true;
        boolean result = sortedQueue.empty();
        assertThat(result, is(expect));
    }

    @Test
    public void testSetNextReadIndexValue() {
        SortedQueue sortedQueue = new SortedQueue(new int[]{3, 4, 7});
        sortedQueue.setNextReadIndexValue();
        sortedQueue.setNextReadIndexValue();
        int expect = 7;
        int result = sortedQueue.viewValue();
        assertThat(result, is(expect));
    }

    @Test
    public void testSetNextWriteIndexValue() {
        SortedQueue sortedQueue = new SortedQueue(new int[]{3, 4, 7});
        sortedQueue.setNextWriteIndexValue();
        sortedQueue.setNextWriteIndexValue();
        sortedQueue.write(9);
        sortedQueue.setNextReadIndexValue();
        sortedQueue.setNextReadIndexValue();
        int expect = 9;
        int result = sortedQueue.viewValue();
        assertThat(result, is(expect));
    }

    @Test
    public void testPop() {
        SortedQueue sortedQueue = new SortedQueue(new int[]{3, 4, 7});
        sortedQueue.pop();
        sortedQueue.pop();
        int expect = 7;
        int result = sortedQueue.viewValue();
        assertThat(result, is(expect));
    }
}