package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                if((row + cell) % 2 == 0 ) {
                    System.out.print("X");
                } else {
                    System.out.print("O");
                }
            }
            // добавляем перевод на новую строку.
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("-----------");
        paint(0, 0);
        System.out.println("-----------");
        paint(1, 1);
        System.out.println("-----------");
        paint(2, 2);
        System.out.println("-----------");
        paint(3, 3);
        System.out.println("-----------");
        paint(4, 4);
        System.out.println("-----------");
        paint(5, 5);
        System.out.println("-----------");
        paint(7, 5);
        System.out.println("-----------");
        paint(-7, -5);
        System.out.println("-----------");
        paint(-5, -7);
        System.out.println("-----------");
        paint(7, -5);
        System.out.println("-----------");
        paint(-7, 5);
        System.out.println("-----------");
    }
}
