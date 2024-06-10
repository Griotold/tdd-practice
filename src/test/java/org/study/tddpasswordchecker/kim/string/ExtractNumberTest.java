package org.study.tddpasswordchecker.kim.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ExtractNumberTest {

    private ExtractNumber extractNumber;

    @BeforeEach
    void setUp() {
        this.extractNumber = new ExtractNumber();
    }

    @Test
    void testOne() {
        int result = extractNumber.extract("a1b2");
        assertThat(result).isEqualTo(12);
    }
}
