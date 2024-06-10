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

    private void assertResult(String input, String expected) {
        String result = removeDuplicateString.removeDuplicated(input);
        assertThat(result).isEqualTo(expected);
    }

    @DisplayName("중복이 없는 문자열은 그대로 리턴")
    @Test
    void testOne() {
        assertResult("grio", "grio");
    }

    @DisplayName("중복이 하나 있는 문자열")
    @Test
    void testTwo() {
        assertResult("griotold", "griotld");
    }

    @DisplayName("중복이 두 개 있는 문자열")
    @Test
    void testThree() {
        assertResult("griotolod", "griotld");
    }

    @DisplayName("문제에서 제시한 테스트 케이스")
    @Test
    void testFour() {
        assertResult("ksekkset", "kset");
    }
}
