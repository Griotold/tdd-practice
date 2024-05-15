package org.study.tddpasswordchecker.expirydatecalculator0515;

import java.time.LocalDate;

public class PayData0515 {
    private LocalDate firstBillingDate;
    private LocalDate billingDate;
    private int payAmount;

    private PayData0515() {}

    public PayData0515(LocalDate firstBillingDate, LocalDate billingDate, int payAmount) {
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
        private PayData0515 data = new PayData0515();

        public Builder firstBillingDate(LocalDate firstBillingDate) {
            data.firstBillingDate = firstBillingDate;
            return this;
        }

        public Builder billingDate(LocalDate billingDate) {
            data.billingDate = billingDate;
            return this;
        }

        public Builder payAmount(int payAmount) {
            data.payAmount = payAmount;
            return this;
        }

        public PayData0515 build() {
            return data;
        }
    }

    public int getAddMonths() {
        int years = payAmount / 100_000;
        int months = (payAmount % 100_000) / 10_000;
        return years * 12 + months;
    }

}
