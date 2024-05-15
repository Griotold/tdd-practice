package org.study.tddpasswordchecker.expirydatecalculator0515;

import java.time.LocalDate;

public class PayData0515 {
    private LocalDate billingDate;
    private int payAmount;

    private PayData0515() {}

    public PayData0515(LocalDate billingDate, int payAmount) {
        this.billingDate = billingDate;
        this.payAmount = payAmount;
    }

    public LocalDate getBillingDate() {
        return billingDate;
    }

    public int getPayAmount() {
        return payAmount;
    }

}
