package ru.job4j.calculator;

/**
 * Calculator
 * Contains and performs arithmetic operations
 * @author Vladimir Aleksandrov (lazer_shtamp@mail.ru)
 */
public class Calculator {

    /**
     * plus.
     * @param first - first value of expression
     * @param second - second value of expression
     */
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    /**
     * main.
     * @param args - input parameter of program
     */
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int onePlusTwo = one + two;
        System.out.println(onePlusTwo);

        int six = 6;
        int four = 4;
        int five = 5;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);

        int size = 10;
        size = 100;
        size = size - 5;
        System.out.println(size);

        Calculator.plus(100, 500);
        Calculator.plus(4, 2);
        Calculator.plus(3, 5);
    }
}
