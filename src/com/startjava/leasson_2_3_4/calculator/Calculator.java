package com.startjava.leasson_2_3_4.calculator;

public class Calculator {

    public double calculate(String matExpression) {
        String[] parts = matExpression.split(" ");

        for (int i = 0; i < parts.length; i++) {
            parts[i] = parts[i].trim();
        }

        int num1 = Integer.parseInt(parts[0]);
        char mathOperation = parts[1].charAt(0);
        int num2 = Integer.parseInt(parts[2]);

        return switch (mathOperation) {
            case '+' -> Math.addExact(num1, num2);
            case '-' -> Math.subtractExact(num1, num2);
            case '*' -> Math.multiplyExact(num1, num2);
            case '/' -> Math.floorDiv(num1, num2);
            case '%' -> Math.floorMod(num1, num2);
            case '^' -> (int) Math.pow(num1, num2);
            default -> 0;
        };
    }
}
