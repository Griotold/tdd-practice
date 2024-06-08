package org.study.tddpasswordchecker.kim.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ReverseStringTest {

    private ReverseString reverseString;

    @BeforeEach
    void setUp() {
        reverseString = new ReverseString();
    }

    @DisplayName("null 이 입력되면 예외")
    @Test
    void testOne() {
        assertThatThrownBy(() -> reverseString.reverse(null))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("공백문자는 그대로 공백이 리턴")
    @Test
    void testTwo() {
        String result = reverseString.reverse("");
        assertThat(result).isEqualTo("");
    }

}
