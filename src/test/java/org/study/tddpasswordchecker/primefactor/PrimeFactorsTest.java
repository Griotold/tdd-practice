package org.study.tddpasswordchecker.primefactor;

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

}
