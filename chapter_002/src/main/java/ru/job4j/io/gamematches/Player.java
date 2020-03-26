package ru.job4j.io.gamematches;

import java.util.Scanner;

public class Player {

    private int number;

    int maxMatchesCanTake;

    int takeMatchesCount;

    public Player() {
        this.setNumber(0);
        this.setMaxMatchesCanTake(3);
        this.setTakeMatchesCount(0);
    }

    /**
     * ввод количества вытягиваемых спичек
     * ввести можно только значение от 1 до N
     * всего 3 попытки, иначе метод вернет false
     */
    public boolean move() {
        boolean result = false;
        Scanner input = new Scanner(System.in);
        for (int tryCount = 0; tryCount < 3; tryCount++) {
            this.setTakeMatchesCount(Integer.parseInt(input.nextLine()));
            if (this.getTakeMatchesCount() >= 1 && this.getTakeMatchesCount() <= this.getMaxMatchesCanTake()) {
                result = true;
                break;
            }
            System.out.println("Вы указали неверное количество спичек: "
                    + this.getTakeMatchesCount()
                    + ". Забрать можно только от 1 до "
                    + this.getMaxMatchesCanTake() + " спичек. Укажите еще раз.");
        }
        return result;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMaxMatchesCanTake() {
        return maxMatchesCanTake;
    }

    public void setMaxMatchesCanTake(int maxMatchesCanTake) {
        this.maxMatchesCanTake = maxMatchesCanTake;
    }

    public int getTakeMatchesCount() {
        return takeMatchesCount;
    }

    public void setTakeMatchesCount(int takeMatchesCount) {
        this.takeMatchesCount = takeMatchesCount;
    }

}
