package org.study.tddpasswordchecker.notehighlight;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NoteHighlightTest {
    NoteHighlight noteHighlight = new NoteHighlight();

    @Test
    void abc() throws Exception {
        assertThat(noteHighlight.highlight("abc")).isEqualTo("abc");
        assertThat(noteHighlight.highlight("efg")).isEqualTo("efg");
    }

    @Test
    void note() throws Exception {
        assertThat(noteHighlight.highlight("note")).isEqualTo("{note}");

    }
}
