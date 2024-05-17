package org.study.tddpasswordchecker.primefactor;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class PrimeFactorsTest {
    @Test
    void one_then_return_empty_list() {
        PrimeFactors primeFactors = new PrimeFactors();
        List<Integer> result = primeFactors.generate(1);
        Assertions.assertThat(result).isEqualTo(Collections.emptyList());
    }
}