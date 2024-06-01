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
        int i = 0;
        for (int frame = 0; frame < 10; frame++) {
            score += rolls[i] + rolls[i + 1];
            i += 2;
        }
        return score;
    }
}
