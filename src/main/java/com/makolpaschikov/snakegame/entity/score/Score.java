package com.makolpaschikov.snakegame.entity.score;

public class Score implements ScoreUI {

    private int score = 0;

    @Override
    public void reset() {
        this.score = 0;
    }

    @Override
    public int getScore() {
        return this.score;
    }

    @Override
    public void increaseScore() {
        this.score = this.score + 20;
    }

}
