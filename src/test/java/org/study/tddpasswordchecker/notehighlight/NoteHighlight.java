package org.study.tddpasswordchecker.notehighlight;

public class NoteHighlight {

    public String highlight(String str) {
        int index = str.indexOf("note");
        if (index == -1) {
            return str;
        }
        if (isPreCharacterNotSpace(str, index)) return str;
        return str.replace("note", "{note}");
    }

    private boolean isPreCharacterNotSpace(String str, int index) {
        int preCharacterIndex = index - 1;

        if (preCharacterIndex >= 0) {
            char ch = str.charAt(preCharacterIndex);
            if (ch >= 'a' && ch <= 'z' ||(ch >= '0' && ch <= '9')) {
                return true;
            }
        }

        return false;
    }

}
