package org.study.tddpasswordchecker.kim.string;

public class FindingCharacter {
    public int find(String str, char c) {
        if (str.length() > 100) throw new IllegalArgumentException("문자열은 100자를 넘지 않습니다.");
        int result = 0;
        char[] charArray = str.toCharArray();
        for (char ch : charArray) {
            char lowerCase = Character.toLowerCase(ch);
            if (lowerCase == c) result++;
        }
        return result;
    }
}
