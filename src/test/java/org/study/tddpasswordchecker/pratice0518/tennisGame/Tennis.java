package org.study.tddpasswordchecker.pratice0518.tennisGame;



public class Tennis {
    private Player playerOne;
    private Player playerTwo;

    public Tennis(String playerOneName, String playerTwoName) {
        this.playerOne = new Player(playerOneName);
        this.playerTwo = new Player(playerTwoName);
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
            return getSameScore();
        }
        return getPlayerOneScoreName() + "," + getPlayerTwoScoreName();
    }

    private String getSameScore() {
        if (playerOne.getScore() == 0) return "Love all";
        else if (playerOne.getScore() == 1) return "Fifteen all";
        else return "Thirty all";
    }

    private String getAdvantageName() {
        return playerOne.getScore() > playerTwo.getScore() ? playerOne.getName() : playerTwo.getName();
    }

    private boolean hasAdvantage() {
        return Math.abs(playerOne.getScore() - playerTwo.getScore()) == 1
                && (playerOne.getScore() >= 3 && playerTwo.getScore() >= 3);
    }

    private String getWinnerName() {
        if (playerOne.getScore() > playerTwo.getScore()) return playerOne.getName();
        else return playerTwo.getName();
    }

    private boolean hasWinner() {
        return Math.abs(playerOne.getScore() - playerTwo.getScore()) >= 2
                && (playerOne.getScore() >= 4 || playerTwo.getScore() >= 4);
    }

    private boolean isDeuce() {
        return playerOne.getScore() == playerTwo.getScore() && playerOne.getScore() >= 3;
    }

    private boolean isSame() {
        return playerOne.getScore() == playerTwo.getScore();
    }

    private String getPlayerOneScoreName() {
        if (playerOne.getScore() == 0) return "Love";
        else if (playerOne.getScore() == 1) return "Fifteen";
        else if (playerOne.getScore() == 2) return "Thirty";
        else return "Forty";
    }

    private String getPlayerTwoScoreName() {
        if (playerTwo.getScore() == 0) return "Love";
        else if (playerTwo.getScore() == 1) return "Fifteen";
        else if (playerTwo.getScore() == 2) return "Thirty";
        else return "Forty";
    }

    public void playerOneScores() {
        playerOne.plusScore();
    }

    public void playerTwoScores() {
        playerTwo.plusScore();
    }
}
