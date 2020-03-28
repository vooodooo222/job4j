package ru.job4j.poly;

public interface Transport {
    void drive();

    void takePassengers(int passengers);

    int refuel(int fuel);
}
