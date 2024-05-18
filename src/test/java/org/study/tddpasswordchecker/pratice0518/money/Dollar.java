package org.study.tddpasswordchecker.pratice0518.money;

public class Dollar {
    public int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount *multiplier);
    }
}
