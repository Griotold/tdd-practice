package org.study.tddpasswordchecker.before0518.passwordchecker2;

import org.study.tddpasswordchecker.before0518.passwordchecker.PasswordStrength;

public class PasswordStrengthMeter {

    public PasswordStrength meter(String password) {
        if (password == null || password.isEmpty()) return PasswordStrength.INVALID;
        int metCount = getMetCounts(password);

        if (metCount <= 1) return PasswordStrength.WEAK;
        if (metCount == 2) return PasswordStrength.NORMAL;

        return PasswordStrength.STRONG;
    }

    private int getMetCounts(String password) {
        int metCount = 0;

        if (meetsLengthCriteria(password)) metCount++;
        if (meetsContainingNumberCriteria(password)) metCount++;
        if (meetsContainingUppercaseCriteria(password)) metCount++;

        return metCount;
    }

    private boolean meetsLengthCriteria(String password) {
        return password.length() >= 8;
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
