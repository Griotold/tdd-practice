package org.study.tddpasswordchecker.fizzbuzz0513;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class FizzBuzzTest {

    FizzBuzzBot fizzBuzzBot;

    @BeforeEach
    public void setUp() {
        fizzBuzzBot = new FizzBuzzBot();
    }

    private void assertFizzBuzz(int input, String expected) {
        String result = fizzBuzzBot.fizzBuzz(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void input_1_then_return_1() throws Exception {
        assertFizzBuzz(1, "1");
    }

    @Test
    void input_3_then_return_Fizz() throws Exception {
        assertFizzBuzz(3, "Fizz");
    }

    @Test
    void input_5_then_return_Buzz() {
        assertFizzBuzz(5, "Buzz");
    }

    @Test
    void input_multiples_of_3_return_Fizz() {
        assertFizzBuzz(6, "Fizz");
    }

}
