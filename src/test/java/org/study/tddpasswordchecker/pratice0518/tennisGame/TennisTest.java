package org.study.tddpasswordchecker.pratice0518.tennisGame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TennisTest {

    Tennis tennis;

    @BeforeEach
    void setUp() {
        tennis = new Tennis("Novak Dokovic", "Rafael Nadal");
    }

    void assertScore(String expectedScore) {
        String score = tennis.getScore();
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    void testNewGameShouldReturnLoveAll() {
        assertScore("Love all");
    }

    @Test
    void testPlayerOneWinsFirstBall() {
        tennis.playerOneScores();
        assertScore("Fifteen,Love");
    }

    @Test
    void testPlayerFifteenAll() {
        tennis.playerOneScores();
        tennis.playerTwoScores();
        assertScore("Fifteen all");
    }

}
