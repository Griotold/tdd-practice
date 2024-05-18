package org.study.tddpasswordchecker.before0518.expirydatecalculator0515;

import java.time.LocalDate;

public class PayData0515 {
    private static final int MONTHLY_PAYMONT = 10_000;
    private static final int ANNUAL_PAYMENT = 100_000;
    private static final int MONTHS_IN_YEAR = 12;

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
        int years = payAmount / ANNUAL_PAYMENT;
        int months = (payAmount % ANNUAL_PAYMENT) / MONTHLY_PAYMONT;
        return years * MONTHS_IN_YEAR + months;
    }

}
