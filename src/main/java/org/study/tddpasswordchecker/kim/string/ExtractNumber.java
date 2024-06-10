package org.study.tddpasswordchecker.kim.string;

public class ExtractNumber {
    public int extract(String input) {
        String result = "";
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                result += ch;
            }
        }
        return Integer.parseInt(result);
    }
}
