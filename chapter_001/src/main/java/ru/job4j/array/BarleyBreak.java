package ru.job4j.array;

public class BarleyBreak {
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
