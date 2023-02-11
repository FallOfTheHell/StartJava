public class GuessTheNumber {
    public static void main(String[] args) {
        int user;
        int pc;
        int tryCount = 0;

        do {
            tryCount++;
            user = (int) (Math.random()*10);
            System.out.println("Игрок: " + user);
            pc = (int) (Math.random()*10);
            System.out.println("компьютер: " + pc);
            if (user > pc){
                System.out.println("Число: " +  user +  " больше того, что загадал компьютер");
            } else if (user < pc){
                System.out.println("Число: " +  user +  " меньше того, что загадал компьютер");
            } else {
                System.out.println("Вы победили!");
            }
        } while (user != pc);
        System.out.println("Количество попыток: " + tryCount);
    }
}
