package com.startjava.leasson_1.final;

public class Calculator {
    public static void main(String[] args) {
        int result = 1;
        char sign = '^';
        int a = (int) (Math.random() * 100) + 1;
        int b = (int) (Math.random() * 100) + 1;

        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = a / b;
        } else if (sign == '^') {
            for (int i = 0; i < b; i++) {
                result *= a;
            }
        } else if (sign == '%') {
            result = a % b;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}
