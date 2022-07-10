package main.cricket.scoreboard.lld.commands;

import main.cricket.scoreboard.lld.entities.Match;
import main.cricket.scoreboard.lld.parseInput.InputCommand;
import main.cricket.scoreboard.lld.entities.ScoreBoard;

import java.util.List;

public class AddPlayerCommand extends Commands{
    public AddPlayerCommand(ScoreBoard cricketScoreBoard) {
        super(cricketScoreBoard);
    }

    @Override
    public void execute(Match match, InputCommand command) {
        List<String> list = command.getParams();
        match.setNoOfPlayersPerTeam(Integer.parseInt(list.get(0)));
    }
}
