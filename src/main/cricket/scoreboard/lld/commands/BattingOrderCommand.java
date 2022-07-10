package main.cricket.scoreboard.lld.commands;

import main.cricket.scoreboard.lld.entities.Match;
import main.cricket.scoreboard.lld.entities.Team;
import main.cricket.scoreboard.lld.parseInput.InputCommand;
import main.cricket.scoreboard.lld.entities.ScoreBoard;

import java.util.List;

public class BattingOrderCommand extends Commands {
    public BattingOrderCommand(ScoreBoard scoreBoard) {
        super(scoreBoard);
    }

    @Override
    public void execute(Match match,InputCommand command) {

        List<String> list = command.getParams();
        Team team = new Team(list.subList(1, list.size()), list.get(0));
        match.getTeams().add(team);
    }
}
