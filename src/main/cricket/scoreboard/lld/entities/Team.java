package main.cricket.scoreboard.lld.entities;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private final String teamName;
    private final List<Player> playerList;
    private final List<Player>  outPlayersList;

    public Team(List<String> players, String teamName) {
        this.teamName = teamName;
        this.playerList = new ArrayList<>();
        players.forEach(x -> this.playerList.add(new Batsman(x)));
        this.outPlayersList = new ArrayList<>();
    }

    public List<Player> getOutPlayersList() {
        return outPlayersList;
    }

    public String getTeamName() {
        return teamName;
    }
}
