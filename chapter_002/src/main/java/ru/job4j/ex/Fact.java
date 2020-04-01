package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        System.out.println("Fact -1 is : " + new Fact().calc(-1));
    }

    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n should be more or equal zero");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
