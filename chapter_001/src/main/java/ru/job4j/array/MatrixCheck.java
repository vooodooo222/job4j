package ru.job4j.array;

/**
 * MatrixCheck
 * @author Aleksandrov Vladimir (lazer_shtamp@mail.ru)
 */
public class MatrixCheck {
    /**
     * Проверяет указанную строку row в массиве board на то, что все ячейки имеют одинаковое значение 'X'
     * @param board - двумерный массив символов в роли игровой доски
     * @param row - индекс строки массива
     * @return - true если в строке с индексом row все ячейки имеют одинаковое значение 'X', иначе - false
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell < board[row].length; cell++) {
            if (board[row][cell] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Проверяет указанную колонку column в массиве board на то, что все ячейки имеют одинаковое значение 'X'
     * @param board - двумерный массив символов в роли игровой доски
     * @param column - индекс колонки массива
     * @return - true если в колонке с индексом column все ячейки имеют одинаковое значение 'X', иначе - false
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Проверяет диагональ в массиве board начиная с 0 на то, что все ячейки имеют одинаковое значение 'X'
     * Только для двумерного массива с равным количеством строк и колонок
     * @param board - двумерный массив символов в роли игровой доски
     * @return - результирующий массив со значениями диагонали
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    /**
     * Проверяет результат выигрыша
     * Выигрышем является тот случай, когда выполняются следующие условия (1 && (2 || 3)), где:
     * 1. По одинаковому индексу строки и столбца игровой доски (начиная с 0) лежит значение 'X'
     * 2. В указанной строке на игровой доске все ячейки имеют одинаковое значение 'X'
     * 3. В указанном столбце на игровой доске все ячейки имеют одинаковое значение 'X'
     * @param board - двумерный массив символов в роли игровой доски
     * @return - true в случае выигрыша, иначе - false
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X' && (monoHorizontal(board, i) ||  monoVertical(board, i))) {
                result = true;
                break;
            }
        }
        return result;
    }
}
