package org.study.tddpasswordchecker.bowling;

public class Game {
    private int score;

    public void roll(int pins) {
        this.score += pins;
    }

    public int getScore() {
        return score;
    }
}
