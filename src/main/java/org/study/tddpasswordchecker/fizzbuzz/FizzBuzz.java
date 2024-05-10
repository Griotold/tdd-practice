package org.study.tddpasswordchecker.fizzbuzz;

public class FizzBuzz {

    public String call(int number) {
        if (number % 3 == 0) {
            if (number % 5 == 0) return "FizzBuzz";
            else return "Fizz";
        }

        if (number % 5 == 0) return "Buzz";

        return String.valueOf(number);
    }
}
