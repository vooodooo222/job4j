package ru.job4j.search;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        var queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent4", 1));
        queue.put(new Task("urgent3", 1));
        queue.put(new Task("urgent2", 1));
        queue.put(new Task("urgent1", 1));
        queue.put(new Task("middle2", 3));
        queue.put(new Task("urgent0", 1));
        queue.put(new Task("middle1", 3));
        var result = queue.take();
        assertThat(result.getDesc(), is("urgent0"));
    }
}