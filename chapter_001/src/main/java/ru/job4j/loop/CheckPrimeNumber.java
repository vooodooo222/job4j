package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean isCanPrimeNumber = number >= 2;
        for (int i = 2; i * i <= number; i++) {
            if ((number % i) == 0) {
                isCanPrimeNumber = false;
                break;
            }
        }
        return isCanPrimeNumber;
    }
}
