package org.study.tddpasswordchecker.primefactor;

import java.util.Collections;
import java.util.List;

public class PrimeFactors {
    public List<Integer> generate(int input) {
        if (input == 2) return List.of(2);
        return Collections.emptyList();
    }
}
