package ru.job4j.io.gamematches;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MatchesTest {

    @Test
    public void delete() {
        Matches matches = new Matches();
        Player player = matches.getPlayers()[0];
        matches.delete(player);
        assertThat(matches.getPlayers()[0].getNumber(), is(2));
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