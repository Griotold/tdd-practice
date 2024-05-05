package org.study.tddpasswordchecker.passwordchecker2;

import org.study.tddpasswordchecker.passwordchecker.PasswordStrength;

public class PasswordStrengthMeter {

    public PasswordStrength meter(String password) {
        if (password == null) return PasswordStrength.INVALID;
        if (password.length() < 8) {
            return PasswordStrength.NORMAL;
        }

        boolean containsNumber = meetsContainingNumberCriteria(password);
        if (!containsNumber) return PasswordStrength.NORMAL;
        return PasswordStrength.STRONG;
    }

    private boolean meetsContainingNumberCriteria(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}
