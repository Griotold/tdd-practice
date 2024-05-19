package org.study.tddpasswordchecker.pratice0518.tennis;

public class TennisGame {
    private Player playerOne;
    private Player playerTwo;

    public TennisGame(String playerOne, String PlayerTwo) {
        this.playerOne = new Player(playerOne);
        this.playerTwo = new Player(PlayerTwo);
    }

    public String getScore() {
        TennisScore oneScore = TennisScore.findByPoint(playerOne.getPoint());
        TennisScore twoScore = TennisScore.findByPoint(playerTwo.getPoint());
        if (oneScore == twoScore) {
            if (oneScore.getPoint() >= 3)
            return "Deuce";
        }

        if (oneScore == TennisScore.WINNER) {
            return playerOne.getName() + " wins";
        }
        if (twoScore == TennisScore.WINNER) {
            return playerTwo.getName() + " wins";
        }
        if (oneScore == twoScore) {
            return oneScore.getScore() + " all";
        } else {
            return oneScore.getScore() + ", " + twoScore.getScore();
        }
    }

    public void playerOneScores() {
        playerOne.win();
    }

    public void playerTwoScores() {
        playerTwo.win();
    }
}
