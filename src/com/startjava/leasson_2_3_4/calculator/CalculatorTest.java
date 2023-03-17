package com.startjava.leasson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String userAnswer = "";

        while (!userAnswer.equals("no")) {
            System.out.print("Введите математическое выражение: ");
            double result = calculator.calculate(scanner.nextLine());
            if (result == 0) {
                System.out.printf("Результат: %d%n", 0);
            } else if (Math.floor(result) == result) {
                System.out.printf("Результат: %d%n", (int) result);
            } else {
                System.out.printf("Результат: %.3f%n", result);
            }
            System.out.print("Хотите продолжить вычисления? [yes/no] ");
            userAnswer = scanner.nextLine().toLowerCase();
            if (!userAnswer.equals("yes")) {
                System.out.print("Пожалуйста, введите 'yes' или 'no': ");
                userAnswer = scanner.nextLine().toLowerCase();
            }
        }
    }
}
