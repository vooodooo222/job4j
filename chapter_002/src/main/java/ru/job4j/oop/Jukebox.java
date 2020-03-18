package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
        if (position == 1) {
            System.out.println("Песенка крокодила Гены: " + System.lineSeparator()
                    + "Пусть бегут неуклюже" + System.lineSeparator()
                    + "Пешеходы по лужам..." + System.lineSeparator());
        } else if (position == 2) {
            System.out.println("Спокойной ночи: " + System.lineSeparator()
                    + "Спят усталые игрушки" + System.lineSeparator()
                    + "Спят усталые игрушки, книжки спят..." + System.lineSeparator());
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
