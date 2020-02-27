package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for ( int i = start; i <= finish; ++i ) {
            int tmp = sum;
            sum = sum + i;
            System.out.println(tmp + "+" + i + "=" + sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println("---------------------------");
        System.out.println(sum(3, 8));
        System.out.println("---------------------------");
        System.out.println(sum(1, 1));
        System.out.println("---------------------------");
        System.out.println(sum(2, 1));
        System.out.println("---------------------------");
        System.out.println(sum(-1, 1));
        System.out.println("---------------------------");
    }
}
