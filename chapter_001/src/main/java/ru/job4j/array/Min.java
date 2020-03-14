package ru.job4j.array;

/**
 * Min
 * @author Aleksandrov Vladimir (lazer_shtamp@mail.ru)
 */
public class Min {
    /**
     * Поиск минимального значения в массиве array
     * @param array - массив чисел
     * @return - минимальное значение в массиве
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }
}
