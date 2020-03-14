package ru.job4j.array;

/**
 * Matrix
 * @author Aleksandrov Vladimir (lazer_shtamp@mail.ru)
 */
public class Matrix {
    /**
     * Возвращает двумерный массив типа int, заполненный значениями таблицы умножения
     * @param size - размер таблицы
     * @return - двумерный массив таблицы умножения c типом int
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int row = 0; row < table.length; row++) {
            for (int cell = 0; cell < table[row].length; cell++) {
                table[row][cell] = (row + 1) * (cell + 1);
            }
        }
        return table;
    }
}
