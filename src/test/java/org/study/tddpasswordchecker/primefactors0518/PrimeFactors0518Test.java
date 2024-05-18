package org.study.tddpasswordchecker.primefactors0518;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimeFactors0518Test {

    private List<Integer> list(Integer... input) {
        return new ArrayList<>(List.of(input));
    }

    @Test
    void testOne() throws Exception {
        assertThat(PrimeFactors0518.generate(1)).isEqualTo(list());
    }

    @Test
    public void testTwo() throws Exception {
        assertThat(PrimeFactors0518.generate(2)).isEqualTo(list(2));
    }
}
