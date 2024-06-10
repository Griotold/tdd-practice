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

    @DisplayName("a1b2 -> 12")
    @Test
    void testOne() {
        int result = extractNumber.extract("a1b2");
        assertThat(result).isEqualTo(12);
    }

    @DisplayName("tge0a1h205er -> 1205")
    @Test
    void testTwo() {
        int result = extractNumber.extract("tge0a1h205er");
        assertThat(result).isEqualTo(1205);
    }

    @DisplayName("g0en2T0s8eSoft -> 208")
    @Test
    void testThree() {
        int result = extractNumber.extract("g0en2T0s8eSoft");
        assertThat(result).isEqualTo(208);
    }
}
