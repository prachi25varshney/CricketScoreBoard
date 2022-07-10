package main.cricket.scoreboard.lld.entities;

import java.util.ArrayList;
import java.util.List;

public class Match {

    private int noOfPlayersPerTeam;
    private int noOfOvers;
    private final List<Team> teams;
    private ScoreBoard scoreBoard;

    public Match() {

        this.teams = new ArrayList<>(2);
        ScoreBoard scoreBoard = new ScoreBoard();
    }

    public int getNoOfPlayersPerTeam() {
        return noOfPlayersPerTeam;
    }

    public int getNoOfOvers() {
        return noOfOvers;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public ScoreBoard getScoreBoard() {
        return scoreBoard;
    }

    public void setNoOfPlayersPerTeam(int noOfPlayersPerTeam) {
        this.noOfPlayersPerTeam = noOfPlayersPerTeam;
    }

    public void setNoOfOvers(int noOfOvers) {
        this.noOfOvers = noOfOvers;
    }
}
