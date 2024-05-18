package org.study.tddpasswordchecker.primefactors0518;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors0518 {
    public static List<Integer> generate(int num) {
        List<Integer> primes = new ArrayList<>();
        if(num > 1) {
            while (num % 2 == 0) {
                primes.add(2);
                num /= 2;
            }
            while (num % 3 == 0) {
                primes.add(3);
                num /= 3;
            }
            if (num > 1) {
                primes.add(num);
            }
        }
        return primes;
    }
}
