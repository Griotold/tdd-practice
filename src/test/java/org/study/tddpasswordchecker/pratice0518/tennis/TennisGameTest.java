package org.study.tddpasswordchecker.pratice0518.tennis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TennisGameTest {
    TennisGame game;

    @BeforeEach
    void setUp() {
        game = new TennisGame("Iga Swiatek", "Aryna Sabalenka");
    }

    @Test
    void testNewGameShouldReturnLoveAll() throws Exception {
        String score = game.getScore();
        assertThat(score).isEqualTo("Love all");
    }

    @Test
    void testPlayerOneWinsFirstBall() throws Exception {
        game.playerOneScores();
        String score = game.getScore();
        assertThat(score).isEqualTo("Fifteen, Love");
    }

    @Test
    void testFifteenAll() throws Exception {
        game.playerOneScores();
        game.playerTwoScores();
        String score = game.getScore();
        assertThat(score).isEqualTo("Fifteen all");
    }

}
