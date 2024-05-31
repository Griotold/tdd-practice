package org.study.tddpasswordchecker.practice0531;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BowlingGameTest {
    BowlingGame bowlingGame;

    @BeforeEach
    void setUp() {
        bowlingGame = new BowlingGame();
    }

    @Test
    void canRoll() {
        bowlingGame.roll(0);
    }

    @Test
    void gutterGame() {
        for (int i = 0; i < 20; i++) {
            bowlingGame.roll(0);
        }
        int score = bowlingGame.getScore();
        Assertions.assertThat(score).isEqualTo(0);
    }

}
