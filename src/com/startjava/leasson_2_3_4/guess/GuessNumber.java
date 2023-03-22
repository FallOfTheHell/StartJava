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
            int numGuesses = 0;
            boolean continuePlaying = true;
            while (numGuesses < 10 && continuePlaying) {
                System.out.print(player.getName() + ", введите число: ");
                int guess = inputNumber();
                numGuesses++;
                player.addAttempt(guess);
                continuePlaying = checkingNumber(guess, secretNum, player, numGuesses);
            }
        }
        finalNumbers();
    }

    private int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.print("Некорректный ввод. Попробуйте еще раз: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private boolean checkingNumber(int guess, int secretNum, Player player, int numGuesses) {
        if (guess > secretNum) {
            System.out.printf("Число %d больше того что загадал компьютер%n", guess);
        } else {
            System.out.printf("Число %d больше того что загадал компьютер%n", guess);
        }

        if (guess == secretNum) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNum
                    + " с " + numGuesses + " попытки");
            return false;
        } else if (numGuesses == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
        return true;
    }

    private void finalNumbers() {
        System.out.println("\nВсе названные игроками числа");
        for (Player player : players) {
            int[] attempts = player.getAttempts();
            System.out.print("Игрок " + player.getName() + ": ");
            for (int attempt : attempts) {
                if (attempt != 0) {
                    System.out.print(attempt + " ");
                }
            }
            System.out.println();
        }
    }
}
