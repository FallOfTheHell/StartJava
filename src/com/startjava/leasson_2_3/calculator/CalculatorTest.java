package com.startjava.leasson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Введите первое число: ");
            calculator.setNum1(scanner.nextInt());

            System.out.print("Введите знак математической операции: ");
            calculator.setMark(scanner.next().charAt(0));

            System.out.print("Введите второе число: ");
            calculator.setNum2(scanner.nextInt());

            calculator.calculate();

            System.out.print("Хотите продолжить вычисления? [yes/no] ");

            while (true) {
                String answer = scanner.next().toLowerCase();
                if (answer.equals("yes")) {
                    System.out.println("Продолжаем вычисления");
                    break;
                } else if (answer.equals("no")) {
                    System.out.println("Досвидания!");
                    return;
                } else {
                    System.out.print("Пожалуйста, введите yes или no: ");
                }
            }
        } while (true);
    }
}
