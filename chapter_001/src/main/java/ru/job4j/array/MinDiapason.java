package ru.job4j.array;

/**
 * MinDiapason
 * @author Aleksandrov Vladimir (lazer_shtamp@mail.ru)
 */
public class MinDiapason {
    /**
     * Поиск минимального значения в массиве array в указанном диапазоне
     * @param array - массив чисел
     * @param start - начальный индекс диапазона поиска в массиве
     * @param finish - конечный индекс диапазона поиска в массиве (включая конечный индекс)
     * @return - минимальное значение в массиве в указанном диапазоне
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start + 1; i <= finish; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
