package ru.job4j.tracker;

import java.util.Comparator;

/**
 * Описывает бизнес модель заявки
 */
public class Item implements Comparable<Item> {
    private String id;
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s %s", getId(), getName());
    }

    @Override
    public int compareTo(Item item) {
        return this.getName().compareTo(item.getName());
    }
}
