package org.study.tddpasswordchecker.notehighlight;

public class NoteHighlight {

    public String highlight(String str) {
        if (str.equals("note")) {
            return "{note}";
        }
        return str;
    }
}
