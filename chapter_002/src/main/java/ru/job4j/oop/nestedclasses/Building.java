package ru.job4j.oop.nestedclasses;

public abstract class Building {
    private String name, address, type;

    public Building(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Building{"
                + "name='" + name + '\''
                + ", address='" + address + '\''
                + ", type='" + type + '\''
                + '}';
    }

    public static class Platform extends Building {
        public Platform(String name, String address) {
            super(name, address);
            super.setType("Platform");
        }
    }

    public static class House extends Building {
        public House(String name, String address) {
            super(name, address);
            super.setType("House");
        }
    }

    public static class Shop extends Building {
        public Shop(String name, String address) {
            super(name, address);
            super.setType("Shop");
        }
    }
}
