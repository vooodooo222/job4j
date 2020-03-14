package ru.job4j.array;

/**
 * SortSelected
 * @author Aleksandrov Vladimir (lazer_shtamp@mail.ru)
 */
public class SortSelected {
    /**
     * Сортирует значения целочисленного массива по возрастанию
     * В цикле пробегается по массиву начиная с 0. В каждой итерации цикла:
     * 1. Ищет минимальное значение в диапазоне от текущего до последнего индекса массива
     * 2. Ищет индекс найденного минимального значения в диапазоне от текущего до последнего индекса массива
     * 3. Меняет значение найденного индекса со значением текущего индекса массива
     * @param data - не отсортированный массив чисел
     * @return - отсортированный массив чисел
     */
    public static int[] sort(int[] data) {
        int lastIndex = data.length - 1;
        FindLoop findLoop = new FindLoop();
        for (int index = 0; index < data.length; index++) {
            int value = MinDiapason.findMin(data, index, lastIndex);
            int indexFound = findLoop.indexOf(data, value, index, lastIndex);
            swap(data, index, indexFound);
        }
        return data;
    }

    /**
     * Обмен значений массива по указанным индексам
     * @param data - массив чисел
     * @param firstIndex - первый индекс для обмена значений со вторым
     * @param secondIndex - второй индекс для обмена значений с первым
     */
    public static void swap(int[] data, int firstIndex, int secondIndex) {
        int tmp = data[firstIndex];
        data[firstIndex] = data[secondIndex];
        data[secondIndex] = tmp;
    }
}
