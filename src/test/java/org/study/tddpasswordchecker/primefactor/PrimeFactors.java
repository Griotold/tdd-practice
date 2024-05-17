package org.study.tddpasswordchecker.primefactor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeFactors {
    public List<Integer> generate(int input) {
        if (input < 2) return Collections.emptyList();
        int num = input;
        List<Integer> list = new ArrayList<>();
        while(num >= 2) {
            if (num % 2 == 0) {
                list.add(2);
            }
            num /= 2;
        }
        return list.isEmpty() ? List.of(input) : list;
    }
}
