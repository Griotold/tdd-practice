package org.study.tddpasswordchecker.practice0531;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class BowlingGameTest {
    BowlingGame bowlingGame;

    @BeforeEach
    void setUp() {
        bowlingGame = new BowlingGame();
    }

    void rollMany(int times, int pins) {
        for (int i = 0; i < times; i++) {
            bowlingGame.roll(pins);
        }
    }

    @Test
    void canRoll() {
        bowlingGame.roll(0);
    }

    @Test
    void gutterGame() {
        rollMany(20, 0);
        int score = bowlingGame.getScore();
        assertThat(score).isEqualTo(0);
    }

    @Test
    void allRollsKnockDownOnePin() {
        rollMany(20, 1);
        int score = bowlingGame.getScore();
        assertThat(score).isEqualTo(20);
    }
    @Disabled
    @Test
    void strikeFirstFrame() {
        bowlingGame.roll(10); // first frame end!
        bowlingGame.roll(6);
        bowlingGame.roll(3);
        rollMany(16, 0);
        int score = bowlingGame.getScore();
        assertThat(score).isEqualTo(27);
    }

}
