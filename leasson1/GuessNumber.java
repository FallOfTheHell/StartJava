package leasson1;

public class GuessNumber {
    public static void main(String[] args) {
        int player;
        int pc = (int) (Math.random() * 100) + 1;
        int tryCount = 0;

        do {
            tryCount++;
            player = (int) (Math.random() * 100) + 1;
            System.out.println("Игрок: " + player);
            System.out.println("компьютер: " + pc);
            if (player > pc) {
                System.out.println("Число: " + player + " больше того, что загадал компьютер");
            } else if (player < pc) {
                System.out.println("Число: " + player + " меньше того, что загадал компьютер");
            }
        } while (player != pc);
        System.out.println("Вы победили!");
        System.out.println("Количество попыток: " + tryCount);
    }
}
