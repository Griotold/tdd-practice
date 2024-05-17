package org.study.tddpasswordchecker.primefactor;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class PrimeFactorsTest {

    PrimeFactors primeFactors;

    @BeforeEach
    void setUp() {
        primeFactors = new PrimeFactors();
    }
    @Test
    void one_then_return_empty_list() {
        List<Integer> result = primeFactors.generate(1);
        Assertions.assertThat(result).isEqualTo(Collections.emptyList());
    }

    @Test
    void two_then_return_list_with_two() {
        List<Integer> result = primeFactors.generate(2);
        Assertions.assertThat(result).isEqualTo(List.of(2));
    }

}
