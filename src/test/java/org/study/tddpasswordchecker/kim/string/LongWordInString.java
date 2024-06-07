package org.study.tddpasswordchecker.kim.string;

public class LongWordInString {

    public String getLongWord(String input) {
        if (isBadInput(input)) throw new IllegalArgumentException();
        return findLongestWord(input);
    }

    private boolean isBadInput(String input) {
        return input == null || input.isEmpty();
    }

    private String findLongestWord(String input) {
        String[] words = input.split(" ");
        String result = "";
        int max = Integer.MIN_VALUE;

        for (String word : words) {
            if (word.length() > max) result = word;
            max = Math.max(max, word.length());
        }
        return result;
    }
}
