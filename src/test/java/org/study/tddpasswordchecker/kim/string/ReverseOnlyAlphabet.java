package org.study.tddpasswordchecker.kim.string;

public class ReverseOnlyAlphabet {
    public String reverse(String input) {
        if (input == null) throw new IllegalArgumentException();
        if (input.isEmpty()) return "";

        int lt = 0;
        int rt = input.length() - 1;
        char[] charArray = input.toCharArray();
        while (lt < rt) {
            swapIfLetters(charArray, lt, rt);
            lt++;
            rt--;
        }
        return new String(charArray);
    }

    private void swapIfLetters(char[] charArray, int lt, int rt) {
        if (Character.isLetter(charArray[lt]) && Character.isLetter(charArray[rt])) {
            char tmp = charArray[lt];
            charArray[lt] = charArray[rt];
            charArray[rt] = tmp;
        }
    }
}
