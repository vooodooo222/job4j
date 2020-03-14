package ru.job4j.array;

/**
 * FindLoop
 * @author Aleksandrov Vladimir (lazer_shtamp@mail.ru)
 */
public class FindLoop {
    /**
     * Возвращает индекс значения в массиве
     * @param data - массив, в котором идет поиск
     * @param value - значение, по которому идет поиск индекса
     * @return - индекс найденного значения
     */
    public int indexOf(int[] data, int value) {
        int indexFound = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == value) {
                indexFound = index;
                break;
            }
        }
        return indexFound;
    }

    /**
     * Возвращает индекс значения в массиве в пределах указанного диапазона индексов
     * @param data - массив, в котором идет поиск
     * @param value - значение, по которому идет поиск индекса
     * @param startIndex - первый индекс массива
     * @param finishIndex - последный индекс массива
     * @return - индекс найденного значения
     */
    public int indexOf(int[] data, int value, int startIndex, int finishIndex) {
        int indexFound = -1;
        for (int index = startIndex; index <= finishIndex; index++) {
            if (data[index] == value) {
                indexFound = index;
                break;
            }
        }
        return indexFound;
    }
}
