package org.study.tddpasswordchecker.practice0531;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

public class BowlingGameTest {
    BowlingGame bowlingGame;

    @BeforeEach
    void setUp() {
        bowlingGame = new BowlingGame();
    }

    private void rollMany(int times, int pins) {
        for (int i = 0; i < times; i++) {
            bowlingGame.roll(pins);
        }
    }

    private void assertScore(int expectedScore) {
        int score = bowlingGame.getScore();
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    void canRoll() {
        bowlingGame.roll(0);
    }

    @Test
    void gutterGame() {
        rollMany(20, 0);
        assertScore(0);
    }

    @Test
    void testAllOnes() {
        rollMany(20, 1);
        assertScore(20);
    }

    @Test
    void testOneSpare() {
        rollSpare();
        bowlingGame.roll(3);
        rollMany(17, 0);
        assertScore(16);
    }

    private void rollSpare() {
        bowlingGame.roll(5);
        bowlingGame.roll(5);
    }
}
