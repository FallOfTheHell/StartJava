package com.startjava.leasson_2_3_4.calculator;

public class Calculator {
    private int num1;
    private int num2;
    private char mathOperation;

    public double calculate(String matExpression) {
        String[] parts = matExpression.split(" ");

        for (int i = 0; i < parts.length; i++) {
            parts[i] = parts[i].trim();
        }

        num1 = Integer.parseInt(parts[0]);
        mathOperation = parts[1].charAt(0);
        num2 = Integer.parseInt(parts[2]);

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
