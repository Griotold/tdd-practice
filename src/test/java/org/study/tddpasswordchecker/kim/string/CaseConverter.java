package org.study.tddpasswordchecker.kim.string;

public class CaseConverter {
    public String convert(String input) {
        String result = "";
        for (char ch : input.toCharArray()) {
            result = convertEachCharacter(ch, result);
        }
        return result;
    }

    private String convertEachCharacter(char ch, String result) {
        if (Character.isUpperCase(ch)) {
            result += Character.toLowerCase(ch);
        } else {
            result += Character.toUpperCase(ch);
        }
        return result;
    }
}
