package org.study.tddpasswordchecker.pratice0518.tennis;

public class TennisGame {
    private int playerOneScore;
    private int playerTwoScore;
    private TennisScore oneScore;
    private TennisScore twoScore;

    public TennisGame(String playerOne, String PlayerTwo) {
    }


    public String getScore() {
        StringBuilder sb = new StringBuilder();
        if (playerOneScore == playerTwoScore) {
            if (playerOneScore == 0) {
                return "Love all";
            } else if (playerOneScore == 1) {
                return "Fifteen all";
            } else if (playerOneScore == 2) {
                return "Thirty all";
            }
        } else {
            if (playerOneScore == 0) {
                sb.append("Love, ");
            } else if (playerOneScore == 1) {
                sb.append("Fifteen, ");
            } else if (playerOneScore == 2) {
                sb.append("Thirty, ");
            }

            if (playerTwoScore == 0) {
                sb.append("Love");
            } else if (playerTwoScore == 1) {
                sb.append("Fifteen");
            } else if (playerTwoScore == 2) {
                sb.append("Thirty");
            }
        }
        return sb.toString();
    }

    public void playerOneScores() {
        playerOneScore++;
    }

    public void playerTwoScores() {
        playerTwoScore++;
    }
}
