package org.study.tddpasswordchecker.before0518.notehighlight;

public class NoteHighlight {

    public String highlight(String str) {
        int index = str.indexOf("note");
        if (index == -1) {
            return str;
        }
        if (isPreCharacterNotSpace(str, index)) return str;
        if (isPostCharacterNotSpace(str, index)) return str;
        return str.replace("note", "{note}");
    }

    private boolean isPreCharacterNotSpace(String str, int index) {
        int preCharacterIndex = index - 1;
        return (preCharacterIndex >= 0 && isNonSpace(str.charAt(preCharacterIndex)));
    }

    private boolean isPostCharacterNotSpace(String str, int index) {
        int postCharacterIndex = index + "note".length();
        return (postCharacterIndex < str.length() && isNonSpace(str.charAt(postCharacterIndex))) ;
    }

    private boolean isNonSpace(char ch) {
        return (ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9');
    }

}
