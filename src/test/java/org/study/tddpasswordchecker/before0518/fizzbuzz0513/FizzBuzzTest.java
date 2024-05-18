package org.study.tddpasswordchecker.before0518.fizzbuzz0513;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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

    @Test
    void input_multiples_of_5_return_Buzz() {
        assertFizzBuzz(10, "Buzz");
    }

    @Test
    void input_multiples_of_3_and_5_return_FizzBuzz() {
        assertFizzBuzz(15, "FizzBuzz");
        assertFizzBuzz(30, "FizzBuzz");
    }

    @Test
    void print_from_1_to_100() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzzBot.fizzBuzz(i));
        }
    }

}
