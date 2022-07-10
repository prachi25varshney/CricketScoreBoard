package main.cricket.scoreboard.lld.entities;

public class Batsman extends Player{

    private  boolean onStrike = false;
    private int totalRunsScored = 0;
    private final ScoreCard scoreCard;

    public Batsman(String playerName) {
        super(playerName);
        this.scoreCard = new ScoreCard();
    }

    public boolean isOnStrike() {
        return onStrike;
    }

    public void setOnStrike(boolean onStrike) {
        this.onStrike = onStrike;
    }

    public int getTotalRunsScored() {
        return this.totalRunsScored;
    }

    public void setTotalRunsScored(int runsScored) {
        this.totalRunsScored += runsScored;
    }

    public ScoreCard getScoreCard() {
        return scoreCard;
    }
}
