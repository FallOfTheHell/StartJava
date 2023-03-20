package com.startjava.leasson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String userAnswer = "yes";

        while (!userAnswer.equals("no")) {
            if (userAnswer.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                double result = calculator.calculate(scanner.nextLine());
                printResult(result);
                System.out.print("Хотите продолжить вычисления? [yes/no] ");
            } else {
                System.out.print("Пожалуйста, введите 'yes' или 'no': ");
            }
            userAnswer = scanner.nextLine().toLowerCase();
        }
    }

    private static void printResult(double result) {
        if (result == 0) {
            System.out.println("Результат: " + 0);
        } else if (result % 1 == 0) {
            System.out.printf("Результат: %d%n", (int) result);
        } else {
            System.out.printf("Результат: %.3f%n", result);
        }
    }
}
