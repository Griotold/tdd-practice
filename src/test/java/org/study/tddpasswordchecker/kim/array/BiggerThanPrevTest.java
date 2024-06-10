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

    @Test
    void testTwo() {
        int ea = 4;
        String input = "1 78 32 54";
        String result = biggerThanPrev.filter(ea, input);
        Assertions.assertThat(result).isEqualTo("1 78 54");
    }

    @Test
    void testThree() {
        int ea = 6;
        String input = "7 3 9 5 6 12";
        String result = biggerThanPrev.filter(ea, input);
        Assertions.assertThat(result).isEqualTo("7 9 6 12");
    }

    @Test
    void testFour() {
        int ea = 5;
        String input = "7 3 2 1 6";
        String result = biggerThanPrev.filter(ea, input);
        Assertions.assertThat(result).isEqualTo("7 6");
    }
}
