package org.study.tddpasswordchecker.pratice0518.tennis;

public enum TennisScore {
    LOVE("Love", 0),
    FIFTEEN("Fifteen", 1),
    THIRTY("Thirty", 2),
    FORTY("Forty", 3),;

    private final String score;
    private final int point;

    TennisScore(String score, int point) {
        this.score = score;
        this.point = point;
    }

    public static TennisScore findByPoint(int point) {
        for (TennisScore tennisScore : values()) {
            if (tennisScore.getPoint() == point) {
                return tennisScore;
            }
        }
        return null;
    }


    public String getScore() {
        return score;
    }

    public int getPoint() {
        return point;
    }
}
