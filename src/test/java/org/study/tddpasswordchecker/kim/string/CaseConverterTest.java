package org.study.tddpasswordchecker.kim.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CaseConverterTest {

    private CaseConverter caseConverter;

    @BeforeEach
    void setUp() {
        caseConverter = new CaseConverter();
    }

    private void assertConvert(String input, String expected) {
        String result = caseConverter.convert(input);
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @DisplayName("대문자를 소문자로, 소문자를 대문자로")
    @Test
    void testOne() {
        assertConvert("stuDY", "STUdy");
        assertConvert("pEnCil", "PeNcIL");
    }
}
