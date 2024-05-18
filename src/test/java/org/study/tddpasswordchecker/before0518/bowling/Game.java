package org.study.tddpasswordchecker.before0518.bowling;

public class Game {
    private int score;

    public void roll(int pins) {
        this.score += pins;
    }

    public int getScore() {
        return score;
    }
}
