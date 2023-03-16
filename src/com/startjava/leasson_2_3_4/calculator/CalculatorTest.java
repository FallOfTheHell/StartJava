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
            calculator.printResult(result);
            System.out.print("Хотите продолжить вычисления? [yes/no] ");
            userAnswer = scanner.nextLine().toLowerCase();
            //TODO: Если использовать оператор "if",
            // то получается мы сможем попросить пользователя один раз.
            // Или так и было задумано?
            if (!userAnswer.equals("yes") && !userAnswer.equals("no")) {
                System.out.print("Пожалуйста, введите 'yes' или 'no': ");
                userAnswer = scanner.nextLine().toLowerCase();
            }
        }
    }
}
