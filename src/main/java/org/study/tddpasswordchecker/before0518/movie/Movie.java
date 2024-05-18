package org.study.tddpasswordchecker.before0518.movie;

public class Movie {

    private int sumOfPoint;
    private int countOfRate;

    public int average() {
        return countOfRate == 0 ? 0 : sumOfPoint / countOfRate;
    }

    public void rate(int point) {
        this.sumOfPoint += point;
        countOfRate++;
    }
}
