package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell < board[row].length; cell++) {
            if ( board[row][cell] != 'X' ) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int cell) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][cell] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for ( int i = 0; i < board.length; i++ ) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for ( int i = 0; i < board.length; i++ ) {
            if ( board[i][i] == 'X' &&
                    ( monoHorizontal(board, i) ||
                            monoVertical(board, i) ) ) {
                result = true;
                break;
            }
        }
        return result;
    }
}
