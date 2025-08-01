package com.study;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Calc {
    public static int run(String expression) {
        char operator = findOperator(expression);
        String[] strNumbers = expression.split(Pattern.quote(String.valueOf(operator)), 2);
        int[] numbers = Arrays.stream(strNumbers)
                .map(String::strip)
                .mapToInt(Integer::parseInt)
                .toArray();
        return calculate(operator, numbers);
    }

    private static int calculate(char operator, int[] numbers) {
        switch(operator) {
            case '+' -> {
                return plus(numbers[0], numbers[1]);
            }
            case '-' -> {
                return minus(numbers[0], numbers[1]);
            }
            default -> {
                return 0;
            }
        }
    }

    private static char findOperator(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '+' || c == '-') return c;
        }
        return 'x';
    }

    private static int plus(int a, int b) {
        return a + b;
    }

    private static int minus(int a, int b) {
        return a - b;
    }
}
