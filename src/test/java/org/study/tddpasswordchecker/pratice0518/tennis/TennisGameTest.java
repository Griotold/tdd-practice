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

    private void createScore(int oneScore, int twoScore) {
        for (int i = 0; i < oneScore; i++) {
            game.playerOneScores();
        }

        for (int i = 0; i < twoScore; i++) {
            game.playerTwoScores();
        }
    }

    @Test
    void testNewGameShouldReturnLoveAll() throws Exception {
        assertTennisGameScore("Love all");
    }

    @Test
    void testPlayerOneWinsFirstBall() throws Exception {
        createScore(1, 0);
        assertTennisGameScore("Fifteen, Love");

    }

    @Test
    void testFifteenAll() throws Exception {
        createScore(1, 1);
        assertTennisGameScore("Fifteen all");
    }

    @Test
    void testPlayerTwoWinsFirstTwoBalls() throws Exception {
        createScore(0, 2);
        assertTennisGameScore("Love, Thirty");
    }

    @Test
    void testPlayerOneWinsFirstThreeBalls() {
        createScore(3, 0);
        assertTennisGameScore("Forty, Love");
    }

    @Test
    void testPlayersAreDeuce() {
        createScore(3, 3);
        assertTennisGameScore("Deuce");
    }
}
