package org.study.tddpasswordchecker.practice0531;

public class BowlingGame {
    private final int[] rolls = new int[21];
    private int currentRoll = 0;

    public BowlingGame() {

    }
    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int getScore() {
        int score = 0;
        for (int roll : rolls) {
            score += roll;
        }
        return score;
    }
}
