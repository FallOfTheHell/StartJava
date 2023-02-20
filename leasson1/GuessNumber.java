package leasson1;

public class GuessNumber {
    public static void main(String[] args) {
        int player;
        int computer = (int) (Math.random() * 101);
        int tryCount = 0;

        do {
            tryCount++;
            player = (int) (Math.random() * 101);
            System.out.println("Игрок: " + player);
            System.out.println("компьютер: " + computer);
            if (player > computer) {
                System.out.println("Число: " + player + " больше того, что загадал компьютер");
            } else if (player < computer) {
                System.out.println("Число: " + player + " меньше того, что загадал компьютер");
            }
        } while (player != computer);
        System.out.println("Вы победили!");
        System.out.println("Количество попыток: " + tryCount);
    }
}
