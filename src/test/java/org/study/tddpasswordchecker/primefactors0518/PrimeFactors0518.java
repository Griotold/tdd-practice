package org.study.tddpasswordchecker.primefactors0518;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors0518 {
    public static List<Integer> generate(int num) {
        List<Integer> list = new ArrayList<>();
        if(num > 1) {
            list.add(2);
        }
        return list;
    }
}
