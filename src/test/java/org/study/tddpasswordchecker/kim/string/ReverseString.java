package org.study.tddpasswordchecker.kim.string;

public class ReverseString {
    public String reverse(String input) {
        if (input == null) throw new IllegalArgumentException();
        StringBuilder sb = new StringBuilder(input);
        StringBuilder reverse = sb.reverse();
        return reverse.toString();
    }
}
