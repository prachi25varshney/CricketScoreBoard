package main.cricket.scoreboard.lld.entities;

public abstract class Player {
    private final String playerName;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

}
