package com.startjava.leasson_2_3.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player human;
    private Player computer;

    public GuessNumber(Player human, Player computer) {
        this.human = human;
        this.computer = computer;
    }

    public void launcher() {
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
                System.out.printf("Поздравляем, %s угадал число за %d попыток!\n", human.getName(), attempts);
                return;
            } else if (playerNum < secretNumber) {
                System.out.printf("Число %d больше того, что загадал %s\n", playerNum, computer.getName());
            } else {
                System.out.printf("Число %d больше того, что загадал %s\n", playerNum, computer.getName());
            }
        } while (true);
    }
}
