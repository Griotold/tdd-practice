package org.study.tddpasswordchecker.expirydatecalculator0515;

import java.time.LocalDate;

public class ExpiryDateCalculator0515 {
    public LocalDate calculateExpiryDate(LocalDate billingDate, int payAmount) {
        return billingDate.plusMonths(1);
    }
}
