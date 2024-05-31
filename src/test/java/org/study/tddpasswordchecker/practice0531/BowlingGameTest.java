package org.study.tddpasswordchecker.practice0531;

import org.junit.jupiter.api.Test;

public class BowlingGameTest {

    @Test
    void canRoll() {
        BowlingGame bowlingGame = new BowlingGame();
        bowlingGame.roll(0);
    }

}
