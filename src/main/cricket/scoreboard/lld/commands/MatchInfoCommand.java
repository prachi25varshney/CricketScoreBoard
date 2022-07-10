package main.cricket.scoreboard.lld.commands;

import main.cricket.scoreboard.lld.entities.Match;
import main.cricket.scoreboard.lld.parseInput.InputCommand;
import main.cricket.scoreboard.lld.entities.ScoreBoard;

public class MatchInfoCommand extends Commands {
    public MatchInfoCommand(ScoreBoard scoreBoard) {
        super(scoreBoard);
    }

    @Override
    public void execute(Match match,InputCommand command) {

    }
}
