package org.study.tddpasswordchecker.kim.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PalindromeCheckerTest {

    private PalindromeChecker palindromeChecker;

    @BeforeEach
    void setUp() {
        this.palindromeChecker = new PalindromeChecker();
    }

    private void assertPalindrome(String input, String expected) {
        String result = palindromeChecker.check(input);
        assertThat(result).isEqualTo(expected);
    }

    @DisplayName("aba -> YES")
    @Test
    void testOne() {
        assertPalindrome("aba", "YES");
    }

    @DisplayName("Aba -> YES")
    @Test
    void testTwo() {
        assertPalindrome("Aba", "YES");
    }

    @DisplayName("abc -> NO")
    @Test
    void testThree() {
        assertPalindrome("abc", "NO");
    }
}
