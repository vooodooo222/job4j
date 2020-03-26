package ru.job4j.io.gameeleven;

public class GameEleven {

    private int matchesCount;

    private int playersCount;

    private Player[] players;

    int positionPlayersCount;

    public GameEleven() {
        this.setMatchesCount(11);
        this.setPlayersCount(2);
        this.init();
    }

    public GameEleven(int matchesCount, int playersCount) {
        this.setMatchesCount(matchesCount);
        this.setPlayersCount(playersCount);
        this.init();
    }

    private void init() {
        this.setPlayers(new Player[this.getPlayersCount()]);
        this.addPlayers();
        this.setPositionPlayersCount(this.getPlayers().length);
    }

    public void printGameInfo() {
        System.out.println(" На столе лежит количество спичек: " + this.getMatchesCount()
                + ". Два игрока по очереди берут от 1 до 3 спичек. Выигрывает тот, кто забрал последние спички.");
    }

    public boolean delete(Player player) {
        int index = this.indexOf(player);
        boolean result = false;
        if (index != -1) {
            System.arraycopy(this.players, index + 1, this.players, index, this.positionPlayersCount - index + 1);
            this.getPlayers()[this.positionPlayersCount - 1] = null;
            this.positionPlayersCount--;
            result = true;
        }
        return result;
    }

    private int indexOf(Player player) {
        int rsl = -1;
        for (int index = 0; index < this.positionPlayersCount; index++) {
            if (getPlayers()[index].equals(player)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public void run() {
        while (this.getMatchesCount() > 0) {
            for (Player player : this.getPlayers()) {
                System.out.println("Ход игрока " + player.getNumber());
                if (!player.move()) {
                    System.out.println("Игрок " + player.getNumber()
                    + " пытался сжульничать. Данный игрок удаляется из игры и считается одним из проигравших.");
                    this.delete(player);
                    continue;
                }
                int matchesLeftCount = this.calculateMatchesLeft(player.getTakeMatchesCount());
                if (isPlayerWin()) {
                    System.out.println("Игрок " + player.getNumber() + " победил!");
                    break;
                }
                System.out.println("Осталось количество спичек: " + matchesLeftCount);
            }
        }
    }

    /**
     * Проверка победы
     * @return Возвращает true если спичек больше не осталось, иначе - false
     */
    private boolean isPlayerWin() {
        return this.getMatchesCount() <= 0;
    }

    /**
     * Вычисление оставшихся спичек
     * @return Возвращает количество оставшихся спичек
     */
    private int calculateMatchesLeft(int takeMatchesCount) {
        this.setMatchesCount(this.getMatchesCount() - takeMatchesCount);
        return this.getMatchesCount();
    }

    public int getMatchesCount() {
        return matchesCount;
    }

    public void setMatchesCount(int matchesCount) {
        this.matchesCount = matchesCount;
    }

    public int getPlayersCount() {
        return playersCount;
    }

    public void setPlayersCount(int playersCount) {
        this.playersCount = playersCount;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    private void addPlayers() {
        for (int currentPlayer = 1; currentPlayer <= this.getPlayers().length; currentPlayer++) {
            this.getPlayers()[currentPlayer - 1] = new Player();
            this.getPlayers()[currentPlayer - 1].setNumber(currentPlayer);
        }
    }

    public int getPositionPlayersCount() {
        return positionPlayersCount;
    }

    public void setPositionPlayersCount(int positionPlayersCount) {
        this.positionPlayersCount = positionPlayersCount;
    }

}
