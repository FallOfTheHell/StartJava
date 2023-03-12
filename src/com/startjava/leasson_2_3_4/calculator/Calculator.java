package com.startjava.leasson_2_3_4.calculator;

public class Calculator {
    private int num1;
    private int num2;
    private char mathOperation;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public void calculate() {
        double result = switch (mathOperation) {
            case '+' -> Math.addExact(num1, num2);
            case '-' -> Math.subtractExact(num1, num2);
            case '*' -> Math.multiplyExact(num1, num2);
            case '/' -> Math.floorDiv(num1, num2);
            case '%' -> Math.floorMod(num1, num2);
            case '^' -> (int) Math.pow(num1, num2);
            default -> 0;
        };
        System.out.printf("Результат: %d %c %d = %.0f%n", num1, mathOperation, num2, result);

        //System.out.println("Результат: " + num1 + " " + mathOperation + " " + num2 + " = " + (double) result);
    }
}
