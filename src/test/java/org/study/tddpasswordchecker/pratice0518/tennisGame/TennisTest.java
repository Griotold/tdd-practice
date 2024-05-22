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

    @Test
    void testNewGameShouldReturnLoveAll() {
        String score = tennis.getScore();
        assertThat(score).isEqualTo("Love all");
    }

    @Test
    void testPlayerOneWinsFirstBall() {
        tennis.playerOneScores();
        String score = tennis.getScore();
        assertThat(score).isEqualTo("Fifteen,Love");
    }

    @Test
    void testPlayerFifteenAll() {
        tennis.playerOneScores();
        tennis.playerTwoScores();
        String score = tennis.getScore();
        assertThat(score).isEqualTo("Fifteen all");
    }

}
