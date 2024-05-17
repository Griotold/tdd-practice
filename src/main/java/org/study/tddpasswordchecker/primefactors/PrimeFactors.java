package org.study.tddpasswordchecker.primefactors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeFactors {
    public List<Integer> generate(int input) {
        if (input < 2) return Collections.emptyList();
        int num = input;
        List<Integer> list = new ArrayList<>();
        for (int i = 2; num > 1; i++) {
            while (num % i == 0) {
                list.add(i);
                num /= i;
            }
        }
        return list;
    }
}
