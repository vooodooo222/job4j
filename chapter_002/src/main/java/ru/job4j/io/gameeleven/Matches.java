package ru.job4j.io.gameeleven;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        GameEleven gameEleven = new GameEleven();
        gameEleven.printGameInfo();
        gameEleven.run();
        GameEleven gameEleven2 = new GameEleven(7, 3);
        gameEleven2.printGameInfo();
        gameEleven2.run();
    }
}
