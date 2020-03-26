package ru.job4j.io.gameeleven;

public class GameEleven {

    private int matchesCount;

    private int playersCount;

    private Player[] players;

    int positionPlayersCount;

    private Player[] roguePlayers;

    int positionRoguePlayersCount;

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
        this.setRoguePlayers(new Player[this.getPlayersCount()]);
        this.setPositionPlayersCount(this.getPlayers().length);
        this.setPositionRoguePlayersCount(0);
    }

    public void printGameInfo() {
        System.out.println("Правила: На столе лежит количество спичек: " + this.getMatchesCount()
                + ". Количество игроков: " + this.getPositionPlayersCount()
                + ". Игроки по очереди берут от 1 до 3 спичек. Выигрывает тот, кто забрал последние спички.");
    }

    public void run() {
        while (this.getMatchesCount() > 0 && this.getPositionPlayersCount() > 0) {
            for (int currentPlayer = 0; currentPlayer < this.getPositionPlayersCount(); currentPlayer++) {
                System.out.println("Текущее количество спичек: " + this.getMatchesCount());
                Player player = this.getPlayers()[currentPlayer];
                System.out.println("Ход игрока " + player.getNumber());
                if (!player.move()) {
                    System.out.println("Игрок " + player.getNumber()
                    + " пытался сжульничать. Данный игрок удаляется из игры и считается одним из проигравших.");
                    this.saveRougePlayersNeedToDelete(player);
                    continue;
                }
                this.calculateMatchesLeft(player.getTakeMatchesCount());
                if (isPlayerWin()) {
                    System.out.println("Игрок " + player.getNumber() + " победил!");
                    break;
                }
            }
            this.deleteRougePlayers();
        }
        if (!isPlayerWin()) {
            System.out.println("Победителей нет. Игра закончена.");
        }
    }

    private void deleteRougePlayers() {
        for (int currentPlayer = 0; currentPlayer < this.getPositionRoguePlayersCount(); currentPlayer++) {
            Player rougePlayer = this.getRoguePlayers()[currentPlayer];
            this.delete(rougePlayer);
        }
        this.setPositionRoguePlayersCount(0);
    }

    private void saveRougePlayersNeedToDelete(Player player) {
        this.getRoguePlayers()[this.getPositionRoguePlayersCount()] = player;
        this.setPositionRoguePlayersCount(this.getPositionRoguePlayersCount() + 1);
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

    public boolean delete(Player player) {
        int index = this.indexOf(player);
        boolean result = false;
        if (index != -1) {
            System.arraycopy(this.getPlayers(), index + 1, this.getPlayers(), index, this.getPositionPlayersCount() - (index + 1));
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

    public Player[] getRoguePlayers() {
        return roguePlayers;
    }

    public void setRoguePlayers(Player[] roguePlayers) {
        this.roguePlayers = roguePlayers;
    }

    public int getPositionRoguePlayersCount() {
        return positionRoguePlayersCount;
    }

    public void setPositionRoguePlayersCount(int positionRoguePlayersCount) {
        this.positionRoguePlayersCount = positionRoguePlayersCount;
    }

}
