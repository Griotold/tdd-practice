package org.study.tddpasswordchecker.expirydatecalculator;

import java.time.LocalDate;

public class PayData {
    // todo 질문2. 상수로 추출했는데 가독성 개선이 있는지
    private static final int MONTHLY_PAYMENT_THRESHOLD = 10_000;
    private static final int ANNUAL_PAYMENT_THRESHOLD = 100_000;
    private static final int MONTHS_IN_YEAR = 12;

    private LocalDate firstBillingDate;
    private LocalDate billingDate;
    private int payAmount;

    public PayData() {
    }

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
        if (payAmount < ANNUAL_PAYMENT_THRESHOLD) {
            return payAmount / MONTHLY_PAYMENT_THRESHOLD;
        }
        int years = payAmount / ANNUAL_PAYMENT_THRESHOLD;
        int remainingAmount = payAmount % ANNUAL_PAYMENT_THRESHOLD;
        return years * MONTHS_IN_YEAR + remainingAmount / MONTHLY_PAYMENT_THRESHOLD;
    }
}
