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
        int attempts = 0;

        System.out.println("Угадайте число от 1 до 100");
        int playerNum1;
        int playerNum2;

        do {
            System.out.print(player1.getName() + " вводит число: ");
            playerNum1 = scanner.nextInt();

            if (playerNum1 == secretNum) {
                System.out.printf("Поздравляем, %s угадал число за %d попыток!\n", player1.getName(), attempts);
                return;
            } else if (playerNum1 < secretNum) {
                System.out.printf("Число %d больше того, что загадал компьютер\n", playerNum1);
            } else {
                System.out.printf("Число %d больше того, что загадал компьютер\n", playerNum1);
            }

            System.out.print(player2.getName() + " вводит число: ");
            playerNum2 = scanner.nextInt();
            attempts++;
            if (playerNum2 == secretNum) {
                System.out.printf("Поздравляем, %s угадал число за %d попыток!\n", player2.getName(), attempts);
                return;
            } else if (playerNum2 < secretNum) {
                System.out.printf("Число %d больше того, что загадал компьютер\n", playerNum2);
            } else {
                System.out.printf("Число %d больше того, что загадал компьютер\n", playerNum2);
            }

        } while (true);
    }
}
