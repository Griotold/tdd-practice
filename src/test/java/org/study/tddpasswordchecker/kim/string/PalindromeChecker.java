package org.study.tddpasswordchecker.kim.string;

public class PalindromeChecker {
    public String check(String input) {
        int lt = 0;
        int rt = input.length() - 1;
        String lowerCase = input.toLowerCase();
        while (lt < rt) {
            if (lowerCase.charAt(lt) != lowerCase.charAt(rt)) {
                return "NO";
            }
            lt++;
            rt--;
        }
        return "YES";
    }
}
