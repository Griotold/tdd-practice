package org.study.tddpasswordchecker.fizzbuzz0513;

public class FizzBuzzBot {
    public String fizzBuzz(int i) {
        StringBuilder sb = new StringBuilder();

        if (i % 3 == 0) {
            sb.append("Fizz");
        }
        if (i % 5 == 0) {
            sb.append("Buzz");
        }

        return sb.isEmpty() ? String.valueOf(i) : sb.toString();
    }
}
