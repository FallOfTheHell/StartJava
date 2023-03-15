package com.startjava.leasson_2_3_4.calculator;

public class Calculator {
    //TODO: Нужно ли тут переменные(num1, num2, mathOperation) если они используются только в данном классе?
    private int num1;
    private int num2;
    private char mathOperation;

    private String expression;

    public Calculator(String expression) {
        this.expression = expression;
    }

    //TODO: Нужно ли оставлять сеттеры если они пока что не используются?
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public double calculate() {
        String[] parts = expression.split(" ");

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

        //TODO: Что-то я не совсем понимаю, почему "result" не преобразуется в int...
        // Можно пожалуйста объяснить)
        if (result % 1 == 0) {
            return (int) result;
        } else {
            return result;
        }
    }
}
