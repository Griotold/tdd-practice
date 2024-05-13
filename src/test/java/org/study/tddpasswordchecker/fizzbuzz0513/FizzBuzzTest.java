package org.study.tddpasswordchecker.fizzbuzz0513;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    void input_1_then_return_1() throws Exception {
        FizzBuzzBot fizzBuzzBot = new FizzBuzzBot();
        String result = fizzBuzzBot.fizzBuzz(1);
        Assertions.assertThat(result).isEqualTo("1");
    }
}
