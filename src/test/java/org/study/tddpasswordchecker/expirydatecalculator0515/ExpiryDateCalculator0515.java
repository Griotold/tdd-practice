package org.study.tddpasswordchecker.expirydatecalculator0515;

import java.time.LocalDate;

public class ExpiryDateCalculator0515 {

    public LocalDate calculateExpiryDate(PayData0515 paydata) {
        return paydata.getBillingDate().plusMonths(1);
    }
}
