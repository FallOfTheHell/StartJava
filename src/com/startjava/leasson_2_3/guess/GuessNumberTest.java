package com.startjava.leasson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ник первый ник человека: ");
        String nameHuman = scanner.nextLine();

        System.out.print("Введите ник второй ник человека: ");
        String nameComputer = scanner.nextLine();

        Player player = new Player(nameHuman);
        Player player2 = new Player(nameComputer);

        System.out.println("Создан игрок: " + player.getName());
        System.out.println("Создан игрок: " + player2.getName());
        System.out.println("Добро пожаловать в игру!");

        GuessNumber game = new GuessNumber(player, player2);

        String userAnswer = " ";
        do {
            game.launcher();
            System.out.print("Хотите продолжить игру? [yes/no] ");
            userAnswer = scanner.next().toLowerCase();
            while (!userAnswer.equals("yes") && !userAnswer.equals("no")){
                System.out.print("\"Пожалуйста, введите 'yes' или 'no': ");
                userAnswer = scanner.next().toLowerCase();
            }
        }while (!userAnswer.equals("no"));
    }
}
