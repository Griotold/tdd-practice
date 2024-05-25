package org.study.tddpasswordchecker.pratice0518.tennisGame;

public class Tennis {
    private int playerOneScore;
    private int playerTwoScore;
    private String playerOneName;
    private String playerTwoName;

    public Tennis(String playerOneName, String playerTwoName) {
        this.playerOneName = playerOneName;
        this.playerTwoName = playerTwoName;
    }

    public String getScore() {
        if (playerOneScore == playerTwoScore && playerOneScore == 1) {
            return "Fifteen all";
        }
        if (playerOneScore == 1) return "Fifteen,Love";
        if (playerTwoScore == 2) return "Love,Thirty";
        return "Love all";
    }

    public void playerOneScores() {
        playerOneScore++;
    }

    public void playerTwoScores() {
        playerTwoScore++;
    }
}
