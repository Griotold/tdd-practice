package org.study.tddpasswordchecker.kim.string;

public class ReverseOnlyAlphabet {
    public String reverse(String input) {
        if (input == null) throw new IllegalArgumentException();

        return new StringBuilder(input).reverse().toString();
    }
}
