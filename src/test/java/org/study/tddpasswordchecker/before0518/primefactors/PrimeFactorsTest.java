package org.study.tddpasswordchecker.before0518.primefactors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimeFactorsTest {

    PrimeFactors primeFactors;

    @BeforeEach
    void setUp() {
        primeFactors = new PrimeFactors();
    }

    void assertPrimeFactorsList(int input, List<Integer> expected) {
        List<Integer> result = primeFactors.generate(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void one_then_return_empty_list() {
        assertPrimeFactorsList(1, Collections.emptyList());
    }

    @Test
    void two_then_return_list_with_two() {
        assertPrimeFactorsList(2, List.of(2));
    }

    @Test
    void three_then_return_list_with_three() {
        assertPrimeFactorsList(3, List.of(3));
    }

    @Test
    void four_then_return_list() {
        assertPrimeFactorsList(4, List.of(2, 2));
    }

    @Test
    void five_then_return_list_with_five() {
        assertPrimeFactorsList(5, List.of(5));
    }

    @Test
    void six_then_return_list() {
        assertPrimeFactorsList(6, List.of(2, 3));
    }

    @Test
    void one_hundred_then_return_list() {
        assertPrimeFactorsList(100, List.of(2, 2, 5, 5));
    }
}
