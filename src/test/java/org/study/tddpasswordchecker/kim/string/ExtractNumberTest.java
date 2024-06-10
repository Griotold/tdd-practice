package org.study.tddpasswordchecker.kim.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ExtractNumberTest {

    private ExtractNumber extractNumber;

    @BeforeEach
    void setUp() {
        this.extractNumber = new ExtractNumber();
    }

    private void assertExtractNumber(String input, int expected) {
        int result = extractNumber.extract(input);
        assertThat(result).isEqualTo(expected);
    }

    @DisplayName("a1b2 -> 12")
    @Test
    void testOne() {
        assertExtractNumber("a1b2", 12);
    }

    @DisplayName("tge0a1h205er -> 1205")
    @Test
    void testTwo() {
        assertExtractNumber("tge0a1h205er", 1205);
    }

    @DisplayName("g0en2T0s8eSoft -> 208")
    @Test
    void testThree() {
        assertExtractNumber("g0en2T0s8eSoft", 208);
    }
}
