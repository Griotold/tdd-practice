package org.study.tddpasswordchecker.kim.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PalindromeCheckerTest {

    private PalindromeChecker palindromeChecker;

    @BeforeEach
    void setUp() {
        this.palindromeChecker = new PalindromeChecker();
    }

    @Test
    void testOne() {
        String result = palindromeChecker.check("aba");
        Assertions.assertThat(result).isEqualTo("YES");
    }
}
