package ru.job4j.array;

/**
 * BarleyBreak
 * @author Aleksandrov Vladimir (lazer_shtamp@mail.ru)
 */
public class BarleyBreak {
    /**
     * Создание и подсчет количества ячеек созданного массива
     * @param args - args
     */
    public static void main(String[] args) {
        int[][] table = new int[3][3];
        int sum = 0;
        for (int row = 0; row < table.length; row++) {
            for (int cell = 0; cell < table[row].length; cell++) {
                table[row][cell] = ++sum;
            }
        }
    }
}
