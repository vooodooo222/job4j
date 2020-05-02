package ru.job4j.collection.headfirst.collections.mountains;

public class Mountain {
    String name;
    int height;

    public Mountain(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Mountain{"
               + "name='" + name + '\''
               + ", height=" + height
               + '}';
    }
}
