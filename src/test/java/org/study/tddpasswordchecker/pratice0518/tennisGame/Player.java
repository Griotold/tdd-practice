package org.study.tddpasswordchecker.pratice0518.tennisGame;

public class Player {
    private int score;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public void plusScore() {
        score++;
    }
}
