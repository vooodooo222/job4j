package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
        if (position == 1) {
            System.out.println("Песенка крокодила Гены: \n"
                    + "Пусть бегут неуклюже\n"
                    + "Пешеходы по лужам...\n");
        } else if (position == 2) {
            System.out.println("Спокойной ночи: \n"
                    + "Спят усталые игрушки\n"
                    + "Спят усталые игрушки, книжки спят...\n");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox goldJukebox = new Jukebox();
        goldJukebox.music(1);
        goldJukebox.music(2);
        goldJukebox.music(3);
    }
}
