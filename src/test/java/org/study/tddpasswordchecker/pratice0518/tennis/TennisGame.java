package org.study.tddpasswordchecker.pratice0518.tennis;

public class TennisGame {
    private int PlayerOneScore;
    private int PlayerTwoScore;

    public TennisGame(String playerOne, String PlayerTwo) {
    }


    public String getScore() {
        if (PlayerOneScore == 1) {
            return "Fifteen, Love";
        }
        return "Love all";
    }

    public void playerOneScores() {
        PlayerOneScore++;
    }
}
