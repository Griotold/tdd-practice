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
    void assertFizzBuzz(int number, String expected) {
        String result = fizzBuzz.call(number);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void input_1_then_1_return() throws Exception {
        assertFizzBuzz(1, "1");
    }

    @Test
    void input_3_then_Fizz_return() {
        assertFizzBuzz(3, "Fizz");
    }


}
