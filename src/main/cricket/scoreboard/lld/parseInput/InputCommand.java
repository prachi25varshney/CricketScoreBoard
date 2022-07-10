package main.cricket.scoreboard.lld.parseInput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputCommand {
    private final String commandName;
    private final List<String> params;

    public InputCommand(final String inputLine) {
        final List<String> inputList = Arrays.stream(inputLine.trim().split(" "))
                .map(String::trim)
                .filter(x -> (x.length() > 0)).collect(Collectors.toList());


        this.commandName = inputList.get(0);
        inputList.remove(0);
        params = inputList;
    }

    public String getCommandName() {
        return commandName;
    }

    public List<String> getParams() {
        return params;
    }
}
