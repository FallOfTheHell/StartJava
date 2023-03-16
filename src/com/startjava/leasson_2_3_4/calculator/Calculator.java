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

        double result = switch (mathOperation) {
            case '+' -> Math.addExact(num1, num2);
            case '-' -> Math.subtractExact(num1, num2);
            case '*' -> Math.multiplyExact(num1, num2);
            case '/' -> Math.floorDiv(num1, num2);
            case '%' -> Math.floorMod(num1, num2);
            case '^' -> (int) Math.pow(num1, num2);
            default -> 0;
        };
        return result;
    }

    public void printResult(double result) {
        // Сделал отдельный метод чтобы не засорять код
        if (result == 0.0) {
            //TODO: Правильно ли я указал "(int) result"?,
            // потому что idea подсказывает что лучше написать "0".
            System.out.printf("Результат: %d%n", (int) result);
        } else {
            System.out.printf("Результат: %.3f%n", result);
        }
    }
}
