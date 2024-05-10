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

    // chatGPT 개선안
    public String fizzBuzz(int number) {
        StringBuilder sb = new StringBuilder();

        if (number % 3 == 0) {
            sb.append("Fizz");
        }
        if (number % 5 == 0) {
            sb.append("Buzz");
        }

        return sb.isEmpty() ? String.valueOf(number) : sb.toString();
    }
}
