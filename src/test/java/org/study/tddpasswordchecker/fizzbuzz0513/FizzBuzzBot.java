package org.study.tddpasswordchecker.fizzbuzz0513;

public class FizzBuzzBot {
    public String fizzBuzz(int i) {
        if (i % 3 == 0) return "Fizz";
        if (i % 5 == 0) return "Buzz";
        return String.valueOf(i);
    }
}
