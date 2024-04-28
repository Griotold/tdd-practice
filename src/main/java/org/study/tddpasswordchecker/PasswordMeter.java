package org.study.tddpasswordchecker;

public class PasswordMeter {
    public PasswordStrength meter(String pw) throws IllegalArgumentException {
        isNullOrEmpty(pw);
        int count = 0;
        count = calcalutateCount(pw, count);

        if (count == 1 || count == 0) return PasswordStrength.WEAK;
        else if (count == 2) return PasswordStrength.NORMAL;

        return PasswordStrength.STRONG;
    }

    private int calcalutateCount(String pw, int count) {
        if (pw.length() >= 8) count++;
        if (isFoundUppercase(pw)) count++;
        if (isContainsDigit(pw)) count++;
        return count;
    }

    private static void isNullOrEmpty(String pw) {
        if (pw == null || pw.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    private static boolean isContainsDigit(String pw) {
        for (char ch : pw.toCharArray()) {
            if (Character.isDigit(ch)) {
                return true;
            }
        }
        return false;
    }

    private boolean isFoundUppercase(String pw) {
        for (char c : pw.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }
}
