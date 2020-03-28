package ru.job4j.tracker;

/**
 * Описывает бизнес модель заявки
 */
public class Item {
    private String id;
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("item - name: " + this.getName() + System.lineSeparator()
                         + "         id: " + this.getId());
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
}
