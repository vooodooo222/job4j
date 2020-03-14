package ru.job4j.array;

/**
 * Defragment
 * @author Aleksandrov Vladimir (lazer_shtamp@mail.ru)
 */
public class Defragment {
    /**
     * Переносит в начало массива все не нулевые строки начиная с нулевого индекса по порядку
     * Все нулевые ячейки переносит в конец массива
     * @param array - массив строк
     * @return - результирующий массив строк
     */
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int nextIndex = index + 1;
                while (nextIndex < array.length) {
                    if (array[nextIndex] != null) {
                        array[index] = array[nextIndex];
                        array[nextIndex] = null;
                        break;
                    }
                    nextIndex++;
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    /**
     * Проверка работы метода compress.
     * Соаздние строкового массива с пустыми ячейками, передача данного массива методу compress,
     * последовательный вывод результата строк массива в консоль
     * @param args - args
     */
    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
