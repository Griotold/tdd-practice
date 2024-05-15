package org.study.tddpasswordchecker.expirydatecalculator0515;

import java.time.LocalDate;

public class ExpiryDateCalculator0515 {

    public LocalDate calculateExpiryDate(PayData0515 payData) {
        if (payData.getFirstBillingDate() != null) {
            LocalDate candidateExp = payData.getBillingDate().plusMonths(1);
            if (payData.getFirstBillingDate().getDayOfMonth() != candidateExp.getDayOfMonth()) {
                return candidateExp.withDayOfMonth(payData.getFirstBillingDate().getDayOfMonth());
            }
        }
        return payData.getBillingDate().plusMonths(1);
    }
}
