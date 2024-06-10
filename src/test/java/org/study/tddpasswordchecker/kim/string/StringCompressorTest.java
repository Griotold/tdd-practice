package org.study.tddpasswordchecker.kim.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCompressorTest {
    private StringCompressor stringCompressor;

    @BeforeEach
    void setUp() {
        this.stringCompressor = new StringCompressor();
    }
    private void assertCompress(String input, String expected) {
        String result = stringCompressor.compress(input);
        assertThat(result).isEqualTo(expected);
    }

    @DisplayName("abccc -> abc3")
    @Test
    void testOne() {
        assertCompress("abccc", "abc3");
    }

    @DisplayName("abbbc -> ab3c")
    @Test
    void testTwo() {
        assertCompress("abbbc", "ab3c");
    }

    @DisplayName("KKHSSSSSSSE -> K2HS7E")
    @Test
    void testThree() {
        assertCompress("KKHSSSSSSSE", "K2HS7E");
    }
}
