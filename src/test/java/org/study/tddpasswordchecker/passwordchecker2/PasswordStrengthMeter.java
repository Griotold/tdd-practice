package org.study.tddpasswordchecker.passwordchecker2;

import org.study.tddpasswordchecker.passwordchecker.PasswordStrength;

public class PasswordStrengthMeter {

    public PasswordStrength meter(String password) {
        if (password == null || password.isEmpty()) return PasswordStrength.INVALID;
        if (password.length() < 8) {
            return PasswordStrength.NORMAL;
        }

        boolean containsNumber = meetsContainingNumberCriteria(password);
        if (!containsNumber) return PasswordStrength.NORMAL;

        boolean containsUppercase = meetsContainingUppercaseCriteria(password);
        if (!containsUppercase) return PasswordStrength.NORMAL;

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

    private boolean meetsContainingUppercaseCriteria(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }
}
