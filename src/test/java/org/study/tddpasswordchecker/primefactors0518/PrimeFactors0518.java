package org.study.tddpasswordchecker.primefactors0518;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors0518 {
    public static List<Integer> generate(int num) {
        List<Integer> primes = new ArrayList<>();
        if(num > 1) {
            if (num % 2 == 0) {
                primes.add(2);
                num /= 2;
            }
            if (num > 1) {
                primes.add(num);
            }
        }
        return primes;
    }
}
