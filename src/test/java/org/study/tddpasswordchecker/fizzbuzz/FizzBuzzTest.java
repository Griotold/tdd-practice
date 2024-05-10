package org.study.tddpasswordchecker.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    void input_1_then_1_return() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.call(1);
        Assertions.assertThat(result).isEqualTo("1");
    }
}
