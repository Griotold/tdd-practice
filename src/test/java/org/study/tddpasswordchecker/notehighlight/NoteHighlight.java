package org.study.tddpasswordchecker.notehighlight;

public class NoteHighlight {

    public String highlight(String str) {
        int index = str.indexOf("note");
        if (index == -1) {
            return str;
        }
        if (index > 0 && str.toCharArray()[index - 1] == 'y') {
            return str;
        }
        return str.replace("note", "{note}");
    }
}
