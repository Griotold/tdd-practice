package org.study.tddpasswordchecker.practice0531;

public class BowlingGame {
    private Frame[] frames = new Frame[10];
    private int score;
    private int index;

    public BowlingGame() {
        for (int i = 0; i < 10; i++) {
            frames[i] = new Frame();
        }
        score = 0;
        index = 0;
    }
    public void roll(int pins) {
        if (frames[index].isFrameFinished()) {
            index++;
        }
        score += frames[index].roll(pins);
    }

    public int getScore() {
        return score;
    }
}
