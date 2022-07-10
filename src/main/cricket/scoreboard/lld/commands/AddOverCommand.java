package main.cricket.scoreboard.lld.commands;

import main.cricket.scoreboard.lld.entities.Match;
import main.cricket.scoreboard.lld.parseInput.InputCommand;
import main.cricket.scoreboard.lld.entities.ScoreBoard;

import java.util.List;

public class AddOverCommand extends Commands {
    public AddOverCommand(ScoreBoard scoreBoard) {
        super(scoreBoard);
    }

    @Override
    public void execute(Match match,InputCommand command) {
        List<String> list = command.getParams();
        match.setNoOfOvers(Integer.parseInt(list.get(0)));
    }
}
