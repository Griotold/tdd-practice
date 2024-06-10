package org.study.tddpasswordchecker.kim.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BiggerThanPrevTest {
    private BiggerThanPrev biggerThanPrev;

    @BeforeEach
    void setUp() {
        this.biggerThanPrev = new BiggerThanPrev();
    }

    @Test
    void testOne() {
        int ea = 3;
        String input = "1 23 45";
        String result = biggerThanPrev.filter(ea, input);
        Assertions.assertThat(result).isEqualTo("1 23 45");
    }
}
