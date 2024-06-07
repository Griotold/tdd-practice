package org.study.tddpasswordchecker.kim.string;

public class LongWordInString {

    public String getLongWord(String input) {
        if (isBadInput(input)) throw new IllegalArgumentException();
        return null;
    }

    private boolean isBadInput(String input) {
        return input == null || input.isEmpty();
    }
}
