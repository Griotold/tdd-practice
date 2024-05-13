package org.study.tddpasswordchecker.fizzbuzz0513;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    void input_1_then_return_1() throws Exception {
        FizzBuzzBot fizzBuzzBot = new FizzBuzzBot();
        String result = fizzBuzzBot.fizzBuzz(1);
        assertThat(result).isEqualTo("1");
    }

    @Test
    void input_3_then_return_Fizz() throws Exception {
        FizzBuzzBot fizzBuzzBot = new FizzBuzzBot();
        String result = fizzBuzzBot.fizzBuzz(3);
        assertThat(result).isEqualTo("Fizz");
    }
}
