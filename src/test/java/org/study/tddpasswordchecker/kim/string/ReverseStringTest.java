package org.study.tddpasswordchecker.kim.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {

    private ReverseString reverseString;

    @BeforeEach
    void setUp() {
        reverseString = new ReverseString();
    }

    @DisplayName("null 이 입력되면 예외")
    @Test
    void testOne() {
        Assertions.assertThatThrownBy(() -> reverseString.reverse(null))
                .isInstanceOf(IllegalArgumentException.class);
    }

}
