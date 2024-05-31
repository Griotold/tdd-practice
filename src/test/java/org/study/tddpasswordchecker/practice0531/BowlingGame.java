package org.study.tddpasswordchecker.practice0531;

public class BowlingGame {
    private int score;

    public BowlingGame() {

    }
    public void roll(int pins) {
       score += pins;
    }

    public int getScore() {
        return score;
    }
}
