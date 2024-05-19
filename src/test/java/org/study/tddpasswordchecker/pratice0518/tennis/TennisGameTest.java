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

    private void assertTennisGameScore(String expected) {
        String score = game.getScore();
        assertThat(score).isEqualTo(expected);
    }

    @Test
    void testNewGameShouldReturnLoveAll() throws Exception {
        assertTennisGameScore("Love all");
    }

    @Test
    void testPlayerOneWinsFirstBall() throws Exception {
        game.playerOneScores();
        assertTennisGameScore("Fifteen, Love");

    }

    @Test
    void testFifteenAll() throws Exception {
        game.playerOneScores();
        game.playerTwoScores();
        assertTennisGameScore("Fifteen all");
    }

}
