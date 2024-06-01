package org.study.tddpasswordchecker.book.ch7;

public class RegisterResult {
    private CardValidity validity;

    public RegisterResult(CardValidity validity) {
        this.validity = validity;
    }

    public static RegisterResult error(CardValidity validity) {
        return new RegisterResult(validity);
    }

    public static RegisterResult success(CardValidity validity) {
        return new RegisterResult(validity);
    }

    public CardValidity getValidity() {
        return validity;
    }
}
