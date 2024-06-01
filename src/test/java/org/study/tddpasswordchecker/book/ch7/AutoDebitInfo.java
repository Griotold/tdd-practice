package org.study.tddpasswordchecker.book.ch7;

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

    }
}
