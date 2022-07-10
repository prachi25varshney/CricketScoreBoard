package main.cricket.scoreboard.lld;

import main.cricket.scoreboard.lld.commands.Commands;
import main.cricket.scoreboard.lld.entities.Match;
import main.cricket.scoreboard.lld.enums.Command;
import main.cricket.scoreboard.lld.parseInput.InputCommand;
import main.cricket.scoreboard.lld.entities.ScoreBoard;

import java.util.Scanner;

public class CricketScoreBoardApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Match match = new Match();
        ScoreBoard cricketScoreBoard = match.getScoreBoard();

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            InputCommand command = new InputCommand(input);
            Commands commands = Command.valueOf(command.getCommandName()).getCommandClass(cricketScoreBoard);
            commands.execute(match,command);
        }
    }

}
