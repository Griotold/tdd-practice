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
        int firstRollInFrame = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (isSpare(firstRollInFrame)) {
                score += 10 + rolls[firstRollInFrame + 2];
                firstRollInFrame += 2;
            } else if (isStrike(firstRollInFrame)) {
                score += 10 + rolls[firstRollInFrame + 1] + rolls[firstRollInFrame + 2];
                firstRollInFrame++;
            } else {
                score += rolls[firstRollInFrame] + rolls[firstRollInFrame + 1];
                firstRollInFrame += 2;
            }
        }
        return score;
    }

    private boolean isStrike(int firstRollInFrame) {
        return rolls[firstRollInFrame] == 10;
    }

    private boolean isSpare(int firstRollInFrame) {
        return rolls[firstRollInFrame] + rolls[firstRollInFrame + 1] == 10;
    }
}
