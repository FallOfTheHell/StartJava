package leasson1;

public class CyclesTheme {
    public static void main(String[] args) {
        //1 task
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int startRange = -10;
        int endRange = 21;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (startRange % 2 == 0) {
                sumEven += startRange;
            } else {
                sumOdd += startRange;
            }
            startRange++;
        } while (startRange <= endRange);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

        //2 task
        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;

        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }

        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        //3 task
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");

        int num4 = 1234;
        int sum = 0;

        while (num4 > 0) {
            int digit = num4 % 10;
            sum += digit;
            num4 /= 10;
            System.out.print(digit);
        }

        System.out.println("\nСумма цифр: " + sum);

        //4 task
        System.out.println("\n4. Вывод чисел на консоль в несколько строк");

        int num5 = 29;
        int count = 1;

        for (int i = 1; i <= num5; i += 2) {
            System.out.printf("%3d ", i);
            count++;
            if (count == 6) {
                System.out.println();
                count = 1;
            }
        }

        int countZeros = 6 - count;
        if (countZeros > 0 && countZeros != 6){
            for (int i = 0; i < countZeros; i++) {
                if (count == 1 && i == 0){
                    break;
                }
                if(i == countZeros - 1){
                    System.out.printf("%3d\n", 0);
                }else {
                    System.out.printf("%3d ", 0);
                }
            }
        }

        //5 task
        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");

        int num6 = 3242592;
        int copyNum6 = num6;
        int countTwos = 0;

        while (num6 != 0) {
            if (num6 % 10 == 2) {
                countTwos++;
            }
            num6 /= 10;
        }
        System.out.print("Число " + copyNum6 + " содержит ");
        if (countTwos % 2 == 0) {
            System.out.println(countTwos + " четных количество двоек");
        } else {
            System.out.println(countTwos + " нечетных количество двоек");
        }

        //6 task
        System.out.println("\n6. Отображение фигур в консоли");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int num14 = 5;
        do {
            for (int i = num14; i >= 1; i--) {
                System.out.print("#");
            }
            System.out.println();
            num14--;
        }while (num14 != 0);


        int num8 = 0;
        do {
            for (int i = 0; i < num8; i++) {
                System.out.print("$");
            }
            System.out.println();
            num8++;
        } while (num8 < 4);

        int num15 = 2;
        do {
            for (int i = num15; i >= 1; i--) {
                System.out.print("$");
            }
            System.out.println();
            num15--;
        }while (num15 != 0);


        //7 task
        System.out.println("\n7. Отображение ASCII-символов");

        System.out.println("Dec Char");
        for (int i = 0; i < 256; i++) {
            if (i % 2 != 0 && i < 48) {
                System.out.printf("%03d %c\n", i, (char) i);
            } else if (i % 2 == 0 && i > 96 && i <= 122) {
                System.out.printf("%03d %c\n", i, (char) i);
            }
        }

        //8 task
        System.out.println("\n8. Проверка, является ли число палиндромом");

        int num10 = 123321;
        int reverseNum10 = 0;
        int copyNum10 = num10;

        while (copyNum10 > 0) {
            int lastDigit = copyNum10 % 10;
            reverseNum10 = reverseNum10 * 10 + lastDigit;
            copyNum10 /= 10;
        }

        if (reverseNum10 == num10) {
            System.out.println("Число: " + num10 + " является палиндромом");
        } else {
            System.out.println("Число: " + num10 + " не является палиндромом");
        }

        //9 task
        System.out.println("\n9. Определение, является ли число счастливым");

        int luckyNum = 123423;
        int sum1 = 0;
        int sum2 = 0;
        int halfNum = 1;
        while (luckyNum > 0) {
            int digit = luckyNum % 10;
            if (halfNum <= 3) {
                sum1 += digit;
            } else {
                sum2 += digit;
            }
            luckyNum /= 10;
            halfNum++;
        }

        System.out.printf("Сумма цифр первой половины = %d" +
                "\nСумма цифр второй половины = %d\n", sum2, sum1);

        if (sum1 == sum2) {
            System.out.println("Число является счастливым!");
        } else {
            System.out.println("Число не является счастливым(");
        }

        //10 task
        System.out.println("\n10. Вывод таблицы умножения Пифагора");

        System.out.print("  | ");
        for (int i = 2; i <= 9; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();

        System.out.print("--|");
        for (int i = 2; i <= 9; i++) {
            System.out.print("----");
        }
        System.out.println();

        for (int i = 2; i <= 9; i++) {
            System.out.print(i + " | ");
            for (int j = 2; j <= 9; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
