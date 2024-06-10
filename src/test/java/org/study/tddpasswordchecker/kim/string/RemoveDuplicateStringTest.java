package org.study.tddpasswordchecker.kim.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoveDuplicateStringTest {

    private RemoveDuplicateString removeDuplicateString;

    @BeforeEach
    void setUp() {
        this.removeDuplicateString = new RemoveDuplicateString();
    }

    @DisplayName("중복이 없는 문자열은 그대로 리턴")
    @Test
    void testOne() {
        String input = "grio";
        String result = removeDuplicateString.removeDuplicated(input);
        assertThat(result).isEqualTo("grio");
    }
}
