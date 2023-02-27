package com.startjava.leasson_2_3.calculator;

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
        int result = 0;
        switch (mathOperation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            case '^':
                result = (int) Math.pow(num1, num2);
                break;
        }
        System.out.println("Результат: " + num1 + " " + mathOperation + " " + num2 + " = " + result);
    }
}
