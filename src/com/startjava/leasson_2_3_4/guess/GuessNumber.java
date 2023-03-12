package com.startjava.leasson_2_3_4.guess;

import java.util.Arrays;
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

        for (Player player : players) {
            int numGuesses = 0;
            while (numGuesses < 10) {
                System.out.print(player.getName() + ", введите число: ");
                int guess = readGuess();

                numGuesses++;
                player.addGuess(guess, numGuesses);

                if (guess > secretNum){
                    System.out.printf("Число %d больше того что загадал компьютер\n", guess);
                } else {
                    System.out.printf("Число %d больше того что загадал компьютер\n", guess);
                }
                if (guess == secretNum) {
                    System.out.println("Игрок " + player.getName() + " угадал число " + secretNum + " с " + numGuesses + " попытки");
                    break;
                } else if (numGuesses == 10) {
                    System.out.println("У " + player.getName() + " закончились попытки");
                }
            }
        }

        System.out.print("\nВсе названные игроками числа: ");
        for (Player player : players) {
            System.out.print(Arrays.toString(player.getAttempts()) + " ");
        }
        System.out.println();
    }

    private int readGuess() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.print("Некорректный ввод. Попробуйте еще раз: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
