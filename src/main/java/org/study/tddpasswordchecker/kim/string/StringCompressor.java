package org.study.tddpasswordchecker.kim.string;

public class StringCompressor {
    public String compress(String input) {
        String result = String.valueOf(input.charAt(0));
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            char ch = input.charAt(i);
            char prev = input.charAt(i - 1);
            if (ch == prev) {
                count++;
                if (i == input.length() - 1) {
                    result += count;
                }
            } else {
                if (count > 1) {
                    result += count;
                    count = 1;
                }
                result += ch;
            }
        }
        return result;
    }
}
