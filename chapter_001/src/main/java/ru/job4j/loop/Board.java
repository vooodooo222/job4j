package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        int cell = 0;
        int tmp_width = width;
        for (int row = 0; row < height; row++) {
            for (; cell < tmp_width; cell++) {
                if (cell % 2 == 0 ) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            // добавляем перевод на новую строку.
            System.out.println();

            // вернем счетчику ячейки значения по умолчанию
            cell = 0;
            tmp_width = width;

            // если строка четная
            if (row % 2 == 0) {
                // сместим счетчик ячейки на 1
                cell = cell + 1;
                tmp_width = tmp_width + 1;
            }
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
