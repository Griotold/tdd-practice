package org.study.tddpasswordchecker.pratice0518.money;

public class Dollor {
    public int amount;

    public Dollor(int amount) {
        this.amount = amount;
    }

    public void times(int multiplier) {
        amount *= multiplier;
    }
}
