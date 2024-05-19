package org.study.tddpasswordchecker.pratice0518.tennis;

public class TennisGame {
    private int playerOneScore;
    private int playerTwoScore;

    public TennisGame(String playerOne, String PlayerTwo) {
    }


    public String getScore() {
        if (playerOneScore == 0 && playerTwoScore == 0) {
            return "Love all";
        }
        if (playerOneScore == 1 && playerTwoScore == 0) {
            return "Fifteen, Love";
        }
        return "Fifteen all";
    }

    public void playerOneScores() {
        playerOneScore++;
    }

    public void playerTwoScores() {
        playerTwoScore++;
    }
}
