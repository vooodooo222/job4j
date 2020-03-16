package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public int exchange(Battery another) {
        int load = another.load + this.load;
        this.load = 0;
        return load;
    }

    public static void main(String[] args) {
        Battery firstBattery = new Battery(60);
        Battery secondBattery = new Battery(40);
        System.out.println("first battery: " + firstBattery.load + ". second battery: " + secondBattery.load);
        secondBattery.load = firstBattery.exchange(secondBattery);
        System.out.println("first battery: " + firstBattery.load + ". second battery: " + secondBattery.load);
    }
}
