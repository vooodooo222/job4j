package ru.job4j.array;

/**
 * AlgoArray
 * @author Aleksandrov Vladimir (lazer_shtamp@mail.ru)
 */
public class AlgoArray {
    /**
     * Вывод значений массива в консоль после перестановки
     * значений по индексам в данном массиве
     * @param args - args
     */
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        swap(array, 0, 3);
        swap(array, 1, 2);
        swap(array, 3, 4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    /**
     * Перестановка значений по индексам в массиве
     * @param array - массив, в котором значения по указанным индексам меняются местами
     * @param firstIndex - первый индекс значения из массива
     * @param secondIndex - второй индекс значения из массива
     */
    public static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
