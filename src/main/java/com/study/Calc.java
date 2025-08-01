package com.study;

public class Calc {
    public static int run(String expression) {
        char[] charArray = expression.replaceAll("\\s+", "").toCharArray();
        return Character.getNumericValue(charArray[0]) + Character.getNumericValue(charArray[2]);
    }
}
