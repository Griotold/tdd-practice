package org.study.tddpasswordchecker.pratice0518.tennis;

public class TennisGame {
    private int playerOneScore;
    private int playerTwoScore;
    private TennisScore oneScore;
    private TennisScore twoScore;

    public TennisGame(String playerOne, String PlayerTwo) {
    }


    public String getScore() {
        oneScore = TennisScore.findByPoint(playerOneScore);
        twoScore = TennisScore.findByPoint(playerTwoScore);

        if (oneScore == twoScore) {
            return oneScore.getScore() + " all";
        } else {
            return oneScore.getScore() + ", " + twoScore.getScore();
        }
    }

    public void playerOneScores() {
        playerOneScore++;
    }

    public void playerTwoScores() {
        playerTwoScore++;
    }
}
