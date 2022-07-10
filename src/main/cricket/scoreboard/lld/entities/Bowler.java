package main.cricket.scoreboard.lld.entities;

public class Bowler extends Player{

    private int totalOvers ;
    private int oversCompleted = 0;
    Over over;

    public Bowler(String playerName) {
        super(playerName);
    }

    public int getTotalOvers() {
        return totalOvers;
    }

    public void setTotalOvers(int totalOvers) {
        this.totalOvers = totalOvers;
    }

    public int getOversCompleted() {
        return oversCompleted;
    }

    public void setOversCompleted(int oversCompleted) {
        this.oversCompleted = oversCompleted;
    }
}
