package main.cricket.scoreboard.lld.commands;

import main.cricket.scoreboard.lld.entities.Match;
import main.cricket.scoreboard.lld.parseInput.InputCommand;
import main.cricket.scoreboard.lld.entities.ScoreBoard;

public abstract class Commands {

    protected ScoreBoard cricketScoreBoard;

    public Commands(ScoreBoard cricketScoreBoard) {
        this.cricketScoreBoard = cricketScoreBoard;
    }

    public abstract void execute(Match match, InputCommand command);
}
