package main.cricket.scoreboard.lld.entities;

import main.cricket.scoreboard.lld.enums.BallType;

public class Ball {

    private Over over;
    private int ballNo;
    private int scorePerBall;
    private BallType ballType = BallType.NORMAL;

    public Over getOver(){
        return this.over;
    }

    public void setOver(Over over) {
        this.over = over;
    }

    public int getBallNo(){
        return this.ballNo;
    }

    public void setBallNo(int ballNo) {
        this.ballNo = ballNo;
    }

    public int getScorePerBall(){
        return this.scorePerBall;
    }

    public void setScorePerBall(int scorePerBall) {
        this.scorePerBall = scorePerBall;
    }

    public BallType getBallType() {
        return ballType;
    }

    public void setBallType(BallType ballType) {
        this.ballType = ballType;
    }
}
