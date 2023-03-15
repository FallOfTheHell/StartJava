package com.startjava.leasson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userAnswer = "";

        while (true) {
            System.out.print("Введите математическое выражение: ");
            Calculator calculator = new Calculator(scanner.nextLine());
            double result = calculator.calculate();
            System.out.printf("Результат: %.3f%n", result);
            System.out.print("Хотите продолжить вычисления? [yes/no] ");
            userAnswer = scanner.nextLine().toLowerCase();
            if (userAnswer.equals("no")) {
                return;
            } else if (!userAnswer.equals("yes")) {
                System.out.print("Пожалуйста, введите 'yes' или 'no': ");
                userAnswer = scanner.nextLine().toLowerCase();
                if (userAnswer.equals("no")) {
                    return;
                }
            }
        }
    }
}
