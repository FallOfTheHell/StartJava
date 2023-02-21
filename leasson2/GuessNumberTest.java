package leasson2;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ник человека: ");
        String nameHuman = scanner.nextLine();

        System.out.print("Введите ник компьютера: ");
        String nameComputer = scanner.nextLine();

        Player player = new Player(nameHuman);
        Player player2 = new Player(nameComputer);

        System.out.println("Создан игрок: " + player.getName());
        System.out.println("Создан игрок: " + player2.getName());
        System.out.println("Добро пожаловать в игру!");

        GuessNumber guessNumber = new GuessNumber(player, player2);

        guessNumber.gameProcess();

    }
}
