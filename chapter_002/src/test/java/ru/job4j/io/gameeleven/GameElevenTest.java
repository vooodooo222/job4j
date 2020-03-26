package ru.job4j.io.gameeleven;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class GameElevenTest {

    @Test
    public void delete() {
        GameEleven gameEleven = new GameEleven();
        Player player = gameEleven.getPlayers()[0];
        gameEleven.delete(player);
        assertThat(gameEleven.getPlayers()[1].getNumber(), is(1));
    }

    @Test
    public void printGameInfo() {
    }

    @Test
    public void run() {
    }

    @Test
    public void getMatchesCount() {
    }

    @Test
    public void setMatchesCount() {
    }

    @Test
    public void getPlayersCount() {
    }

    @Test
    public void setPlayersCount() {
    }

    @Test
    public void getPlayers() {
    }

    @Test
    public void setPlayers() {
    }

    @Test
    public void getPositionPlayersCount() {
    }

    @Test
    public void setPositionPlayersCount() {
    }
}