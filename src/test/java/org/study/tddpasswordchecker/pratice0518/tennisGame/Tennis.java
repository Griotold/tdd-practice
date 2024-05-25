package org.study.tddpasswordchecker.pratice0518.tennisGame;

import org.springframework.test.annotation.IfProfileValue;

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
        if (hasWinner()) {
            return getWinnerName() + " wins";
        }
        if (hasAdvantage()) {
            return "Advantage " + getAdvantageName();
        }
        if (isDeuce()) return "Deuce";
        if (isSame()) {
            if (playerOneScore == 0) return "Love all";
            else if (playerOneScore == 1) return "Fifteen all";
            else return "Thirty all";
        }
        return getPlayerOneScoreName() + "," + getPlayerTwoScoreName();
    }

    private String getAdvantageName() {
        return playerOneScore > playerTwoScore ? playerOneName : playerTwoName;
    }

    private boolean hasAdvantage() {
        return Math.abs(playerOneScore - playerTwoScore) == 1 && (playerOneScore >= 3 && playerTwoScore >= 3);
    }

    private String getWinnerName() {
        if (playerOneScore > playerTwoScore) return playerOneName;
        else return playerTwoName;
    }

    private boolean hasWinner() {
        return Math.abs(playerOneScore - playerTwoScore) >= 2 && (playerOneScore >= 4 || playerTwoScore >= 4);
    }

    private boolean isDeuce() {
        return playerOneScore == playerTwoScore && playerOneScore >= 3;
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
