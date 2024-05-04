package org.study.tddpasswordchecker.notehighlight;

public class NoteHighlight {

    public String highlight(String str) {
        int index = str.indexOf("note");
        if (index == -1) {
            return str;
        }
        int preIndex = index - 1;
        if (preIndex >= 0) {
            char pre = str.charAt(preIndex);

            if (isNonSpace(pre)) {
                return str;
            }
        }

        return str.replace("note", "{note}");
    }

    private static boolean isNonSpace(char ch) {
        return (ch >= 'a' && ch <= 'y') || (ch >= '0' && ch <= '9');
    }
}
