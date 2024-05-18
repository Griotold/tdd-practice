package org.study.tddpasswordchecker.before0518.primefactors0518;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.study.tddpasswordchecker.before0518.primefactors0518.PrimeFactors0518.*;

public class PrimeFactors0518Test {

    private List<Integer> list(Integer... input) {
        return new ArrayList<>(List.of(input));
    }

    @Test
    void testOne() throws Exception {
        assertThat(generate(1)).isEqualTo(list());
    }

    @Test
    public void testTwo() throws Exception {
        assertThat(generate(2)).isEqualTo(list(2));
    }

    @Test
    public void testThree() throws Exception {
        assertThat(generate(3)).isEqualTo(list(3));
    }

    @Test
    public void testFour() throws Exception {
        assertThat(generate(4)).isEqualTo(list(2, 2));
    }

    @Test
    public void testSix() throws Exception {
        assertThat(generate(6)).isEqualTo(list(2, 3));
    }

    @Test
    public void testEight() throws Exception {
        assertThat(generate(8)).isEqualTo(list(2, 2, 2));
    }

    @Test
    public void testNine() throws Exception {
        assertThat(generate(9)).isEqualTo(list(3, 3));
    }
}
