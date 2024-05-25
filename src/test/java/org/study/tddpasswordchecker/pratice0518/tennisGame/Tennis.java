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
        if (isSame()) {
            if (playerOneScore == 0) return "Love all";
            else if (playerOneScore == 1) return "Fifteen all";
            else if (playerOneScore == 2) return "Thirty all";
            else return "Forty all";
        }
        return getPlayerOneScoreName() + "," + getPlayerTwoScoreName();
    }

    private boolean isSame() {
        return playerOneScore == playerTwoScore;
    }

    private String getPlayerOneScoreName() {
        if (playerOneScore == 0) return "Love";
        else if (playerOneScore == 1) return "Fifteen";
        else if (playerOneScore == 2) return "Thirty";
        else return "Forty";
    }

    private String getPlayerTwoScoreName() {
        if (playerTwoScore == 0) return "Love";
        else if (playerTwoScore == 1) return "Fifteen";
        else if (playerTwoScore == 2) return "Thirty";
        else return "Forty";
    }

    public void playerOneScores() {
        playerOneScore++;
    }

    public void playerTwoScores() {
        playerTwoScore++;
    }
}
