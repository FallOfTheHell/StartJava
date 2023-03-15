package com.startjava.leasson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorMain {
    private String expression;

    public CalculatorMain(String expression) {
        this.expression = expression;
    }

    public double calculate() {
        String[] parts = expression.split(" "); // Разбиваем выражение на части
        int num1 = Integer.parseInt(parts[0]); // Первое число
        String operator = parts[1]; // Оператор
        int num2 = Integer.parseInt(parts[2]); // Второе число

        double result = 0;

        // Выбираем операцию и вычисляем результат
        if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else if (operator.equals("/")) {
            result = (double) num1 / num2;
        } else if (operator.equals("^")) {
            result = Math.pow(num1, num2);
        } else if (operator.equals("sqrt")) {
            result = Math.sqrt(num1);
        } else if (operator.equals("sin")) {
            result = Math.sin(num1);
        } else if (operator.equals("cos")) {
            result = Math.cos(num1);
        } else if (operator.equals("tan")) {
            result = Math.tan(num1);
        } else {
            System.out.println("Неверный оператор");
            return 0;
        }

        // Выводим результат
        if (result == 0) {
            return 0;
        } else {
            return Math.round(result * 1000.0) / 1000.0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите математическое выражение: ");
        String expression = scanner.nextLine();

        CalculatorMain calculator = new CalculatorMain(expression);
        double result = calculator.calculate();
        System.out.println("Результат: " + result);
    }
}
