package ru.job4j.array;

/**
 * Square
 * @author Aleksandrov Vladimir (lazer_shtamp@mail.ru)
 */
public class Square {
    /**
     * Заполняет массив элементами от 0 до bound возведенными в квадрат
     * @param arraySize - размер массива
     * @return - массив с элементами от 0 до bound возведенными в квадрат
     */
    public static int[] calculate(int arraySize) {
        int[] rst = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            rst[i] = i * i;
        }
        return rst;
    }

    /**
     * Выводит в консоль массив с элементами от 0 до 3 возведенными в квадрат
     * @param args - args
     */
    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
