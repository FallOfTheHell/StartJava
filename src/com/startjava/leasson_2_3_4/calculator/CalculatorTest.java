package com.startjava.leasson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        String userAnswer = "";
        while (!userAnswer.equals("no")) {
            System.out.print("Введите математическое выражение: ");
            userAnswer = scanner.nextLine();
            String[] words = userAnswer.split(" ");

            for (int i = 0; i < words.length; i++) {
                words[i] = words[i].trim();
            }

            calculator.setNum1(Integer.parseInt(words[0]));
            calculator.setMathOperation(words[1].charAt(0));
            calculator.setNum2(Integer.parseInt(words[2]));

            calculator.calculate();

            System.out.print("Хотите продолжить вычисления? [yes/no] ");

            userAnswer = scanner.nextLine().toLowerCase();

            while (!userAnswer.equals("yes") && !userAnswer.equals("no")) {
                System.out.print("Пожалуйста, введите 'yes' или 'no': ");
                userAnswer = scanner.nextLine().toLowerCase();
            }
        }
    }
}
