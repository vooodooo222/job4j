package ru.job4j.tracker;

import java.util.Comparator;

public class SortByNameItemRevers implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        return second.getName().compareTo(first.getName());
    }
}
