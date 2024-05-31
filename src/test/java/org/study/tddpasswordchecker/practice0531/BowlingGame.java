package org.study.tddpasswordchecker.practice0531;

public class BowlingGame {
    private int score = 0;
    private final int[] rolls = new int[21];
    private int currentRoll = 0;

    public BowlingGame() {

    }
    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int getScore() {
        int result = 0;
        for (int roll : rolls) {
            result += roll;
        }

        for (int i = 0; i < rolls.length - 1; i+=2) {
            if(rolls[i] + rolls[i+1] == 10) result += rolls[i+2];
        }
        return result;
    }
}
