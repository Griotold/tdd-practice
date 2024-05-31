package org.study.tddpasswordchecker.practice0531;

public class Frame {
    private Frame nextFrame;
    private int firstRoll;
    private int secondRoll;
    private boolean isSecondRoll;
    private boolean isFrameFinished;

    public int roll(int pins) {
        if (isSecondRoll) {
            secondRoll = pins;
            isFrameFinished = true;
            return secondRoll;
        }

        firstRoll = pins;
        isSecondRoll = true;
        return firstRoll;
    }

    public boolean isFrameFinished() {
        return isFrameFinished;
    }
}
