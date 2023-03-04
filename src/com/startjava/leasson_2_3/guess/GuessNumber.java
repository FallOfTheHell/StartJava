package com.startjava.leasson_2_3.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launch() {
        System.out.println("Добро пожаловать в игру!");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNum = random.nextInt(100) + 1;
        int attemptsNum = 0;

        System.out.println("Угадайте число от 1 до 100");

        do {
            int playerNum;

            System.out.print(player1.getName() + " вводит число: ");
            playerNum = scanner.nextInt();

            if (playerNum == secretNum) {
                System.out.printf("Поздравляем, %s угадал число за %d попыток!\n", player1.getName(), attemptsNum);
                return;
            }
            if (playerNum < secretNum) {
                System.out.printf("Число %d больше того, что загадал компьютер\n", playerNum);
            } else {
                System.out.printf("Число %d больше того, что загадал компьютер\n", playerNum);
            }

            System.out.print(player2.getName() + " вводит число: ");
            playerNum = scanner.nextInt();

            attemptsNum++;

            if (playerNum == secretNum) {
                System.out.printf("Поздравляем, %s угадал число за %d попыток!\n", player2.getName(), attemptsNum);
                return;
            }
            if (playerNum < secretNum) {
                System.out.printf("Число %d больше того, что загадал компьютер\n", playerNum);
            } else {
                System.out.printf("Число %d больше того, что загадал компьютер\n", playerNum);
            }
        } while (true);
    }
}
