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

    private void createScore(int playerOneScores, int playerTwoScores) {
        for (int i = 0; i < playerOneScores; i++) {
            tennis.playerOneScores();
        }

        for (int i = 0; i < playerTwoScores; i++) {
            tennis.playerTwoScores();
        }
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

    @Test
    void testPlayerTwoWinsFirstTwoBalls() {
        createScore(0, 2);
        assertScore("Love,Thirty");
    }

    @Test
    void testPlayerOneWinsFirstThreeBalls() {
        createScore(3, 0);
        assertScore("Forty,Love");
    }

    @Test
    void testPlayerAreDeuce() {
        createScore(3, 3);
        assertScore("Deuce");
    }

    @Test
    void testPlayerOneWinsGame() {
        createScore(4, 0);
        assertScore("Novak Dokovic wins");
    }

    @Test
    public void testPlayerTwoWinsGame(){
        createScore(1,4);
        assertScore("Rafael Nadal wins");
    }

    @Test
    void testPlayersAreDeuce4() throws Exception {
        createScore(4, 4);
        assertScore("Deuce");
    }

    @Test
    public void testPlayerTwoAdvantage(){
        createScore(4, 5);
        assertScore("Advantage Rafael Nadal");
    }

    @Test
    public void testPlayerOneAdvantage(){
        createScore(5, 4);
        assertScore("Advantage Novak Dokovic");
    }

    @Test
    public void testPlayerTwoWins(){
        createScore(2, 4);
        assertScore("Rafael Nadal wins");
    }

    @Test
    public void testPlayerTwoWinsAfterAdvantage(){
        createScore(6, 8);
        assertScore("Rafael Nadal wins");
    }

    @Test
    public void testPlayerOneWinsAfterAdvantage(){
        createScore(8, 6);
        assertScore("Novak Dokovic wins");
    }
}
