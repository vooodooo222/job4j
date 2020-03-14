package ru.job4j.array;

/**
 * SwitchArray
 * @author Aleksandrov Vladimir (lazer_shtamp@mail.ru)
 */
public class SwitchArray {
    /**
     * Обменивает значения массива по указанным индексам
     * @param array - массив
     * @param firstIndex - первый индекс обмена
     * @param secondIndex - второй индекс обмена
     * @return - новый результирующий массив после обмена
     */
    public static int[] swap(int[] array, int firstIndex, int secondIndex) {
        int[] swapArray = array.clone();    // входной массив не трогаем
        boolean isIndexesValid = firstIndex >= 0 && secondIndex >= 0 && firstIndex < array.length && secondIndex < array.length;
        if (isIndexesValid) {
            swapArray[firstIndex] = array[secondIndex];
            swapArray[secondIndex] = array[firstIndex];
        }
        return swapArray;
    }

    /**
     * Обменивает значения массива по начальному и конечному индексам
     * @param array - массив
     * @return - новый результирующий массив после обмена
     */
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    /**
     * Создает и инициализирует массив от 1 до 6.
     * Вызывает метод обмена значений массива по начальному и конечному индексам.
     * Выводит на консоль результат значений текущего массива.
     * @param args - args
     */
    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}
