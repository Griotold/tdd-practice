package org.study.tddpasswordchecker.expirydatecalculator;

import java.time.LocalDate;
import java.time.YearMonth;

public class ExpiryDateCalculator {

    public LocalDate calculateExpiryDate(PayData payData) {
        int addedMonths = payData.getAddMonths();

        if (payData.getFirstBillingDate() != null) {
            return expiryDateUsingFirstBillingDate(payData, addedMonths);
        } else {
            return payData.getBillingDate().plusMonths(addedMonths);
        }
    }

    private LocalDate expiryDateUsingFirstBillingDate(PayData payData, int addedMonths) {
        LocalDate candidateExp = payData.getBillingDate().plusMonths(addedMonths);

        if (!isSameDayOfMonth(payData.getFirstBillingDate(), candidateExp)) {
            final int dayLenOfCandiMon = lastDayOfMonth(candidateExp);
            final int dayOfFirstBilling = payData.getFirstBillingDate().getDayOfMonth();
            if (dayLenOfCandiMon < dayOfFirstBilling) {
                return candidateExp.withDayOfMonth(dayLenOfCandiMon);
            }
            return candidateExp.withDayOfMonth(
                    dayOfFirstBilling);
        } else {
            return candidateExp;
        }
    }

    private static int lastDayOfMonth(LocalDate candidateExp) {
        return YearMonth.from(candidateExp).lengthOfMonth();
    }

    // todo. 질문 1. !isSameDayOfMonth VS isSameDayOfMonth
    private boolean isSameDayOfMonth(LocalDate firstBillingDate, LocalDate candidateExp) {
        int dayOfFirstBilling = firstBillingDate.getDayOfMonth();
        int dayOfCandidateExp = candidateExp.getDayOfMonth();
        return dayOfFirstBilling == dayOfCandidateExp;
    }
}
