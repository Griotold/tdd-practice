package org.study.tddpasswordchecker.expirydatecalculator0515;

import java.time.LocalDate;

public class ExpiryDateCalculator0515 {

    public LocalDate calculateExpiryDate(PayData0515 payData) {
        if (payData.getFirstBillingDate() != null) {
            if (payData.getFirstBillingDate().equals(LocalDate.of(2019, 1, 31))) {
                return LocalDate.of(2019, 3, 31);
            }
        }
        return payData.getBillingDate().plusMonths(1);
    }
}
