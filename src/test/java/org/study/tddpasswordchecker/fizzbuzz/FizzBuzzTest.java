package org.study.tddpasswordchecker.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void input_1_then_1_return() throws Exception {
        String result = fizzBuzz.call(1);
        assertThat(result).isEqualTo("1");
    }

    @Test
    void input_3_then_Fizz_return() {
        String result = fizzBuzz.call(3);
        assertThat(result).isEqualTo("Fizz");
    }
}
