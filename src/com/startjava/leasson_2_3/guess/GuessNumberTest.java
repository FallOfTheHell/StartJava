package com.startjava.leasson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ник первого игрока: ");
        String name1 = scanner.nextLine();

        System.out.print("Введите ник второго игрока: ");
        String name2 = scanner.nextLine();

        Player player1 = new Player(name1);
        Player player2 = new Player(name2);

        GuessNumber game = new GuessNumber(player1, player2);

        String player = " ";
        do {
            game.launch();
            System.out.print("Хотите продолжить игру? [yes/no] ");
            player = scanner.next().toLowerCase();
            while (!player.equals("yes") && !player.equals("no")) {
                System.out.print("\"Пожалуйста, введите 'yes' или 'no': ");
                player = scanner.next().toLowerCase();
            }
        } while (!player.equals("no"));
    }
}
