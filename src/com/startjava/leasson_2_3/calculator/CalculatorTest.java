package com.startjava.leasson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        String word = "";
        while (!word.equals("no")) {
            System.out.print("Введите первое число: ");
            calculator.setNum1(scanner.nextInt());

            System.out.print("Введите знак математической операции: ");
            calculator.setMathOperation(scanner.next().charAt(0));

            System.out.print("Введите второе число: ");
            calculator.setNum2(scanner.nextInt());

            calculator.calculate();

            System.out.print("Хотите продолжить вычисления? [yes/no] ");

            word = scanner.next().toLowerCase();

            while (!word.equals("yes") || !word.equals("no")) {
                // TODO: Можно пожалуйста объяснить почему не работает запись
                //  "!word.equals("yes") || !word.equals("no")" я же указываю что
                //  если не верно введено да или нет, то выполняем цикл пока не будет введено верно.
                //  а вот эта запись почему-то работает "!word.equals("yes") && !word.equals("no")"
                //  можно пожалуйста объяснить))
                System.out.print("Пожалуйста, введите 'yes' или 'no': ");
                word = scanner.next().toLowerCase();
            }
        }
    }
}
