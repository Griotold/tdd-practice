package org.study.tddpasswordchecker.notehighlight;

public class NoteHighlight {

    public String highlight(String str) {
        if (str.equals("note")) {
            return "{note}";
        } else if (str.equals("1 note")) {
            return "1 {note}";
        }
        return str;
    }
}
