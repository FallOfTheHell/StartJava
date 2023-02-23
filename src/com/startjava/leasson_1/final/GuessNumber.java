package com.startjava.leasson_1.final;

public class GuessNumber {
    public static void main(String[] args) {
        int playerNum;
        int hiddenNum = (int) (Math.random() * 100) + 1;
        int countAttempts = 0;

        System.out.println("компьютер: " + hiddenNum);

        do {
            countAttempts++;
            playerNum = (int) (Math.random() * 100) + 1;
            System.out.println("Игрок: " + playerNum);
            if (playerNum > hiddenNum) {
                System.out.println("Число: " + playerNum + " больше того, что загадал компьютер");
            } else {
                System.out.println("Число: " + playerNum + " меньше того, что загадал компьютер");
            }
        } while (playerNum != hiddenNum);
        System.out.println("Вы победили!\nКоличество попыток: " + countAttempts);
    }
}
