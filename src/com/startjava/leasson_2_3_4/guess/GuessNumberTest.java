package com.startjava.leasson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ник первого игрока: ");
        String name1 = scanner.nextLine();

        System.out.print("Введите ник второго игрока: ");
        String name2 = scanner.nextLine();

        GuessNumber game = new GuessNumber(new Player(name1), new Player(name2));

        String playerAnswer = "yes";
        do {
            if (playerAnswer.equals("yes")) {
                game.launch();
                System.out.print("Хотите продолжить игру? [yes/no] ");
            } else {
                System.out.print("\"Пожалуйста, введите 'yes' или 'no': ");
            }
            playerAnswer = scanner.next().toLowerCase();
        } while (!playerAnswer.equals("no"));
    }
}
