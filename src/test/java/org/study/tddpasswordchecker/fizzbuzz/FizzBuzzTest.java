package org.study.tddpasswordchecker.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    void input_1_then_1_return() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.call(1);
        assertThat(result).isEqualTo("1");
    }

    @Test
    void input_3_then_Fizz_return() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.call(3);
        assertThat(result).isEqualTo("Fizz");
    }
}
