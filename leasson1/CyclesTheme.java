public class CyclesTheme {
    public static void main(String[] args) {
        //1 task
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int even = -10;
        int odd = 21;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (even % 2 == 0){
                sumEven += even;
            }
            if (even % 1 == 0){
                sumOdd += even;
            }
            even++;
        } while (even <= odd);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);
        
        //2 task
        System.out.println("\n" + "2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        for (int i = 0; i < num1 + num2 + num3; i++) {
            while (i == num1 || i == num2 || i == num3) {
                System.out.println(i);
                break;
            }
        }
    }
}
