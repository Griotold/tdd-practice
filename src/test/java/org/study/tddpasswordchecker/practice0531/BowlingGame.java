package org.study.tddpasswordchecker.practice0531;

public class BowlingGame {
    private int score;
    public void roll(int pins) {
        score += pins;
    }

    public int getScore() {
        return score;
    }
}
