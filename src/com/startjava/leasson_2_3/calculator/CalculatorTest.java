package com.startjava.leasson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        String userAnswer = "";
        while (!userAnswer.equals("no")) {
            System.out.print("Введите первое число: ");
            calculator.setNum1(scanner.nextInt());

            System.out.print("Введите знак математической операции: ");
            calculator.setMathOperation(scanner.next().charAt(0));

            System.out.print("Введите второе число: ");
            calculator.setNum2(scanner.nextInt());

            calculator.calculate();

            System.out.print("Хотите продолжить вычисления? [yes/no] ");

            userAnswer = scanner.next().toLowerCase();

            while (!userAnswer.equals("yes") && !userAnswer.equals("no")) {
                System.out.print("Пожалуйста, введите 'yes' или 'no': ");
                userAnswer = scanner.next().toLowerCase();
            }
        }
    }
}
