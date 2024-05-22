package org.study.tddpasswordchecker.pratice0518.tennisGame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TennisTest {

    @Test
    void testNewGameShouldReturnLoveAll() {
        Tennis tennis = new Tennis();
        String score = tennis.getScore();
        assertThat(score).isEqualTo("Love all");
    }

    @Test
    void testPlayerOneWinsFirstBall() {
        Tennis tennis = new Tennis();
        tennis.playerOneScores();
        String score = tennis.getScore();
        assertThat(score).isEqualTo("Fifteen,Love");
    }

}
