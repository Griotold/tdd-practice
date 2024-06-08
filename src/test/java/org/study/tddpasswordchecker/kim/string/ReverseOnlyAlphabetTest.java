package org.study.tddpasswordchecker.kim.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ReverseOnlyAlphabetTest {

    private ReverseOnlyAlphabet reverseOnlyAlphabet;

    @BeforeEach
    void setUp() {
        reverseOnlyAlphabet = new ReverseOnlyAlphabet();
    }

    @DisplayName("null 을 입력하면 예외")
    @Test
    void testOne() {
        assertThatThrownBy(() -> reverseOnlyAlphabet.reverse(null))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("공백 문자를 입력하면 그대로 공백 문자 리턴")
    @Test
    void testTwo() {
        String result = reverseOnlyAlphabet.reverse("");
        assertThat(result).isEqualTo("");
    }

}
