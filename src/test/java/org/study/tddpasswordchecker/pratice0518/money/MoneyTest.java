package org.study.tddpasswordchecker.pratice0518.money;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyTest {

    @Test
    void testMultiplication() throws Exception {
        Dollor five = new Dollor(5);
        five.times(2);
        Assertions.assertThat(five.amount).isEqualTo(10);
    }
}
