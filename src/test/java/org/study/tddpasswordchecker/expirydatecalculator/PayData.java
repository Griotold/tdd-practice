package org.study.tddpasswordchecker.expirydatecalculator;

import java.time.LocalDate;

public class PayData {
    private LocalDate firstBillingDate;
    private LocalDate billingDate;
    private int payAmount;

    public PayData() {}

    public PayData(LocalDate firstBillingDate, LocalDate billingDate, int payAmount) {
        this.firstBillingDate = firstBillingDate;
        this.billingDate = billingDate;
        this.payAmount = payAmount;
    }

    public LocalDate getFirstBillingDate() {
        return firstBillingDate;
    }

    public LocalDate getBillingDate() {
        return billingDate;
    }

    public int getPayAmount() {
        return payAmount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private PayData data = new PayData();

        public Builder billingDate(LocalDate billingDate) {
            data.billingDate = billingDate;
            return this;
        }

        public Builder payAmount(int payAmount) {
            data.payAmount = payAmount;
            return this;
        }

        public Builder firstBillingDate(LocalDate firstBillingDate) {
            data.firstBillingDate = firstBillingDate;
            return this;
        }

        public PayData build() {
            return data;
        }
    }

    public int getAddMonths() {
        if (payAmount < 100_000) return payAmount / 10_000;
        int years = payAmount / 100_000;
        int zaturi = payAmount % 100_000;
        return years * 12 + zaturi / 10_000;
    }
}
