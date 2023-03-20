package com.startjava.leasson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String userAnswer = "yes";

        while (!userAnswer.equals("no")) {
            //TODO: Если это то что от меня требуют в задаче,
            // то я исправлю так же в GuessNumberTest
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

    //TODO: Если было дело не в рекурсии, то тогда я не знаю как решить без вложенного while
    private static String getUserAnswer(Scanner scanner) {
        String userAnswer = scanner.nextLine().toLowerCase();
        if (userAnswer.equals("yes") || userAnswer.equals("no")) {
            return userAnswer;
        } else {
            System.out.print("Пожалуйста, введите 'yes' или 'no': ");
            return getUserAnswer(scanner);
        }
    }
}
