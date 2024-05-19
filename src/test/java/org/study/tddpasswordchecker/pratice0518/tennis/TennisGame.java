package org.study.tddpasswordchecker.pratice0518.tennis;

import java.util.Optional;

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

        if (isDeuce(oneScore, twoScore)) return "Deuce";

        // 이 부분 리팩토링 하는 방법 없을까?
        Optional<String> winner = findWinner(oneScore, twoScore);
        if (findWinner(oneScore, twoScore).isPresent()) return winner.get() + " wins";

        if (oneScore == twoScore) {
            return oneScore.getScore() + " all";
        } else {
            return oneScore.getScore() + ", " + twoScore.getScore();
        }
    }

    private boolean isDeuce(TennisScore oneScore, TennisScore twoScore) {
        return oneScore == twoScore && oneScore.getPoint() >= 3;
    }

    private Optional<String> findWinner(TennisScore oneScore, TennisScore twoScore) {
        if (oneScore == TennisScore.WINNER) {
            return Optional.of(playerOne.getName());
        }
        if (twoScore == TennisScore.WINNER) {
            return Optional.of(playerTwo.getName());
        }
        return Optional.empty();
    }

    public void playerOneScores() {
        playerOne.win();
    }

    public void playerTwoScores() {
        playerTwo.win();
    }
}
