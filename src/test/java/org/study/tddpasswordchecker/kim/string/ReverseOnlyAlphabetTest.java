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

    private void assertReverse(String input, String expected) {
        String result = reverseOnlyAlphabet.reverse(input);
        assertThat(result).isEqualTo(expected);
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
        assertReverse("", "");
    }

    @DisplayName("알파벳만 있는 경우는 그냥 뒤집으면 됨")
    @Test
    void testThree() {
        assertReverse("abc", "cba");
    }

    @DisplayName("특수문자는 그대로 둬야함")
    @Test
    void testFour() {
        assertReverse("ab!d", "db!a");
    }

    @DisplayName("문제에서 제시한 테스트 케이스")
    @Test
    void testFive() {
        assertReverse("a#b!GE*T@S", "S#T!EG*b@a");
    }
}

