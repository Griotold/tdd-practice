package org.study.tddpasswordchecker.pratice0518.tennis;

public class Player {
    private int point;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void win() {
        point++;
    }

    public int getPoint() {
        return point;
    }

    public String getName() {
        return name;
    }
}
