package org.study.tddpasswordchecker.notehighlight;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class NoteHighlightTest {
    NoteHighlight noteHighlight = new NoteHighlight();

    @Test
    void abc() throws Exception {
        String highlightedAbc = noteHighlight.highlight("abc");
        Assertions.assertThat(highlightedAbc).isEqualTo("abc");
    }
}
