package org.study.tddpasswordchecker.passwordchecker2;

import org.study.tddpasswordchecker.passwordchecker.PasswordStrength;

public class PasswordStrengthMeter {

    public PasswordStrength meter(String password) {
        if (password.length() < 8) {
            return PasswordStrength.NORMAL;
        }
        return PasswordStrength.STRONG;
    }
}
