package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, double salary, double percent) {
        int year = 0;
        double debt = amount;
        while (debt > 0) {
            double debtPercent = debt * (percent / 100);
            debt = debt + debtPercent - salary;
            year = year + 1;
        }
        return year;
    }
}
