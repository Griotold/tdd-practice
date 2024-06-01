package org.study.tddpasswordchecker.book.ch7.autodebit;

import java.time.LocalDateTime;

public class AutoDebitInfo {
    private String userId;
    private String cardNumber;
    private LocalDateTime createdAt;

    public AutoDebitInfo(String userId, String cardNumber, LocalDateTime createdAt) {
        this.userId = userId;
        this.cardNumber = cardNumber;
        this.createdAt = createdAt;
    }

    public void changeCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getUserId() {
        return userId;
    }

    public String gerCardNumber() {
        return cardNumber;
    }
}
