package ru.job4j.collection.sort;

import java.util.Comparator;

public class JobDescByNameByDecreasing implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
