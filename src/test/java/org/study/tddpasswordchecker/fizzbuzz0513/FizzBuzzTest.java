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

    @Test
    void input_1_then_return_1() throws Exception {
        String result = fizzBuzzBot.fizzBuzz(1);
        assertThat(result).isEqualTo("1");
    }

    @Test
    void input_3_then_return_Fizz() throws Exception {
        String result = fizzBuzzBot.fizzBuzz(3);
        assertThat(result).isEqualTo("Fizz");
    }
}
