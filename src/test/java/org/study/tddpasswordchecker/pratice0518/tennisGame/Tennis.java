package org.study.tddpasswordchecker.pratice0518.tennisGame;

public class Tennis {
    private int playerOneScore;
    private int playerTwoScore;
    public String getScore() {
        if (playerOneScore == 1) return "Fifteen,Love";
        return "Love all";
    }

    public void playerOneScores() {
        playerOneScore++;
    }
}
