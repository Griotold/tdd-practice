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

    private void assertLong(String input, String expected) {
        String result = longWordInString.getLongWord(input);
        assertThat(result).isEqualTo(expected);
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

    @DisplayName("it is time to study -> study")
    @Test
    void testOne() {
        assertLong("it is time to study", "study");
    }

    @DisplayName("your finger is long -> finger")
    @Test
    void testTwo() {
        assertLong("your finger is long", "finger");
    }

    @DisplayName("만약 가장 긴 단어가 2개라면? 가장 앞에 나오는 단어")
    @Test
    void testThree() {
        assertLong("your pants is short", "pants");
    }

}
