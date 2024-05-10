package org.study.tddpasswordchecker.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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

    @Test
    void input_5_then_Buzz_return() {
        assertFizzBuzz(5, "Buzz");
    }

    @Test
    void input_2_then_2_return() {
        assertFizzBuzz(2, "2");
    }

    @Test
    void input_multiples_of_3_then_Fizz_return() {
        assertFizzBuzz(6, "Fizz");
        assertFizzBuzz(9, "Fizz");
    }

    @Test
    void input_multiples_of_5_then_Buzz_return() {
        assertFizzBuzz(10, "Buzz");
        assertFizzBuzz(20, "Buzz");
    }

    @Test
    void input_multiples_of_both_3_and_5_then_FizzBuzz_return() {
        assertFizzBuzz(15, "FizzBuzz");
        assertFizzBuzz(30, "FizzBuzz");
    }

    @Test
    void print100() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz.call(i));
        }
    }

}
