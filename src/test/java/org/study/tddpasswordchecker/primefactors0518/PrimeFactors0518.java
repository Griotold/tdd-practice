package org.study.tddpasswordchecker.primefactors0518;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors0518 {
    public static List<Integer> generate(int num) {
        List<Integer> primes = new ArrayList<>();
        for (int candidate = 2; num > 1; candidate++) {
            for (; num % candidate == 0; num /= candidate) {
                primes.add(candidate);
            }
        }
        return primes;
    }
}
