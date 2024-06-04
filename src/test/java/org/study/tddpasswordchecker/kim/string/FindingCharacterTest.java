package org.study.tddpasswordchecker.kim.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class FindingCharacterTest {
    private FindingCharacter findingCharacter;

    @BeforeEach
    void setUp() throws Exception {
        findingCharacter = new FindingCharacter();
    }

    void assertFindingCharacter(String str, char c, int expected) {
        int result = findingCharacter.find(str, c);
        assertThat(result).isEqualTo(expected);
    }

    @DisplayName("문자열이 100자를 넘기면 예외발생")
    @Test
    void testException() {
        String str = "loerwerknlnknlnnlnknnwerewrwrerrerwerew";
        str += "werkewlkrnwlekrnklwenrwnelrnkenrkwnlre";
        str += "wentlwnetnlntwkalntklnwktnwltnwlkentkewntle";
        str += "welrknwelkrnklwenrklwnekrnwkerkwelnrkewnkrnkwlnr";
        String finalStr = str;
        char c = 'c';
        assertThatThrownBy(() ->findingCharacter.find(finalStr, c))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("소문자만 문자열로 주어졌을 때 문자는 몇 개일까?")
    @Test
    void testOnlyLowerCaseString() {
        String str = "computercooler";
        char c = 'c';
        assertFindingCharacter(str, c, 2);
    }

    @DisplayName("대문자 포함 문자열 안에 문자는 몇 개일까?")
    @Test
    void testContainsUpper() {
        String str = "Computercooler";
        char c = 'c';
        int result = findingCharacter.find(str, c);
        assertThat(result).isEqualTo(2);
    }


}
