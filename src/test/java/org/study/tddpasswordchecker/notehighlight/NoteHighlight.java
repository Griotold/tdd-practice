package org.study.tddpasswordchecker.notehighlight;

public class NoteHighlight {

    public String highlight(String str) {
        if (str.contains("note")) {
            return str.replace("note", "{note}");
        }
        return str;
    }
}
