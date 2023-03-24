package com.startjava.leasson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player[] players;

    public GuessNumber(Player... player) {
        this.players = player;
    }

    public void launch() {
        System.out.println("Добро пожаловать в игру!");

        Random random = new Random();
        int secretNum = random.nextInt(100) + 1;

        System.out.println("Угадайте число от 1 до 100");
        System.out.println("У каждого игрока по 10 попыток");
        System.out.println(secretNum);

        for (Player player : players) {
            player.clearAttempts();
            int countAttempts = 0;
            boolean validationNum = true;
            while (countAttempts < 10 && validationNum) {
                System.out.print(player.getName() + ", введите число: ");
                int guess = inputNumber();
                countAttempts++;
                player.addAttempt(guess);
                validationNum = checkNumber(guess, secretNum, player);
            }
        }
        printAllPlayerAttempts();
    }

    private int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.print("Некорректный ввод. Попробуйте еще раз: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private boolean checkNumber(int guess, int secretNum, Player player) {
        int numGuesses = player.getCount();

        if (guess == secretNum) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNum
                    + " с " + numGuesses + " попытки");
            return false;
        }
        if (numGuesses == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }

        if (guess > secretNum) {
            System.out.printf("Число %d больше того что загадал компьютер%n", guess);
        } else {
            System.out.printf("Число %d больше того что загадал компьютер%n", guess);
        }
        return true;
    }

    private void printAllPlayerAttempts() {
        System.out.println("\nВсе названные игроками числа");
        for (Player player : players) {
            int[] attempts = player.getAttempts();
            System.out.print("Игрок " + player.getName() + ": ");
            for (int attempt : attempts) {
                System.out.print(attempt + " ");
            }
            System.out.println();
        }
    }
}
