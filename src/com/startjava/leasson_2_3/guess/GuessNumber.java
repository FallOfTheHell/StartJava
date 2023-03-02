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
        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;

        System.out.println("Угадайте число от 1 до 100");
        int playerNum;

        do {
            System.out.print("Введите число: ");
            playerNum = scanner.nextInt();
            attempts++;

            if (playerNum == secretNumber) {
                System.out.printf("Поздравляем, %s угадал число за %d попыток!\n", player1.getName(), attempts);
                return;
            } else if (playerNum < secretNumber) {
                System.out.printf("Число %d больше того, что загадал %s\n", playerNum, player2.getName());
            } else {
                System.out.printf("Число %d больше того, что загадал %s\n", playerNum, player2.getName());
            }
        } while (true);
    }
}
