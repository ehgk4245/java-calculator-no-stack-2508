package com.study;

import java.util.Arrays;

public class Calc {
    public static int run(String expression) {
        String[] numbers = expression.split("\\+", 2);
        return Arrays.stream(numbers)
                .map(String::strip)
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
