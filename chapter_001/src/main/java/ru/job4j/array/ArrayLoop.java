package ru.job4j.array;

/**
 * ArrayLoop
 * @author Aleksandrov Vladimir (lazer_shtamp@mail.ru)
 */
public class ArrayLoop {
    /**
     * Создание, инициализация и вывод значений массива в консоль
     * @param args - args
     */
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index * 2 + 3;
        }
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }

    }
}
