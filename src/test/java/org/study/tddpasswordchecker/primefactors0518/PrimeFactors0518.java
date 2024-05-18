package org.study.tddpasswordchecker.primefactors0518;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors0518 {
    public static List<Integer> generate(int num) {
        List<Integer> primes = new ArrayList<>();
        int candidate = 2;
        while (num > 1) {
            while (num % candidate == 0) {
                primes.add(candidate);
                num /= candidate;
            }
            candidate++;
        }
        return primes;
    }
}
