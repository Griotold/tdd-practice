package org.study.tddpasswordchecker.primefactors0518;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimeFactors0518Test {

    @Test
    void testOne() throws Exception {
        assertThat(PrimeFactors0518.generate(1)).isEqualTo(list());
    }

    private List<Integer> list() {
        return new ArrayList<Integer>();
    }
}
