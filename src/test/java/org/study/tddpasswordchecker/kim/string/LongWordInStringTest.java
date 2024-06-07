package org.study.tddpasswordchecker.kim.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LongWordInStringTest {

    private LongWordInString longWordInString;

    @BeforeEach
    void setUp() {
        this.longWordInString = new LongWordInString();
    }

    @DisplayName("공백 문자열을 넣으면 IllegalArgumentException")
    @Test
    void testEmptyString() {
        assertThatThrownBy(() -> longWordInString.getLongWord(""))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("null 을 넣으면 IllegalArgumentException")
    @Test
    void testNull() {
        assertThatThrownBy(() -> longWordInString.getLongWord(null))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Disabled
    @DisplayName("it is time to study -> study")
    @Test
    void testOne() {
        String input = "it is time to study";
        String reuslt = longWordInString.getLongWord(input);
        assertThat(reuslt).isEqualTo("study");
    }
}
