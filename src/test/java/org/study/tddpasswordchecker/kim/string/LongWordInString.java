package org.study.tddpasswordchecker.kim.string;

public class LongWordInString {

    public String getLongWord(String input) {
        if (isBadInput(input)) throw new IllegalArgumentException();

        String[] split = input.split(" ");
        String result = "";
        int max = Integer.MIN_VALUE;
        for (String word : split) {
            int length = word.length();
            if (length > max) result = word;
            max = Math.max(max, length);
        }
        return result;
    }

    private boolean isBadInput(String input) {
        return input == null || input.isEmpty();
    }
}
