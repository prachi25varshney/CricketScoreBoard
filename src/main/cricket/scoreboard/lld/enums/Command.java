package main.cricket.scoreboard.lld.enums;

import main.cricket.scoreboard.lld.commands.*;
import main.cricket.scoreboard.lld.entities.ScoreBoard;

public enum Command {
    ADDTOTALPLAYER() {
        @Override
        public Commands getCommandClass(ScoreBoard scoreBoard) {
            return new AddPlayerCommand(scoreBoard);
        }
    },
    MATCHINFO() {
        @Override
        public Commands getCommandClass(ScoreBoard scoreBoard) {
            return new MatchInfoCommand(scoreBoard);
        }
    },
    BATTINGORDER() {
        @Override
        public Commands getCommandClass(ScoreBoard scoreBoard) {
            return new BattingOrderCommand(scoreBoard);
        }
    },
    ADDOVER() {
        @Override
        public Commands getCommandClass(ScoreBoard scoreBoard) {
            return new AddOverCommand(scoreBoard);
        }
    },
    RESULT(){
        @Override
        public Commands getCommandClass(ScoreBoard scoreBoard) {
            return new ResultCommand(scoreBoard);
        }
    };

    public abstract Commands getCommandClass(ScoreBoard scoreBoard);
}
