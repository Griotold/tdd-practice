package org.study.tddpasswordchecker.primefactors0518;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors0518 {
    public static List<Integer> generate(int num) {
        List<Integer> primes = new ArrayList<>();
        int candidate = 2;
        while (num > 1) {
            for (; num % candidate == 0; num /= candidate) {
                primes.add(candidate);
            }
            candidate++;
        }
        return primes;
    }
}
