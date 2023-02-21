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

        int num5 = 30;
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
        for (int i = 0; i < countZeros; i++) {
            System.out.printf("%3d ", 0);
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

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int zero = 0;
        while (zero < 4) {
            for (int i = 4; i > zero; i--) {
                System.out.print("#");
            }
            System.out.println();
            zero++;
        }

        int num8 = 0;
        do {
            for (int i = 0; i < num8; i++) {
                System.out.print("$");
            }
            System.out.println();
            num8++;
        } while (num8 < 4);
        for (int i = 2; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("$");
            }
            System.out.println();
        }

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

        int num10 = 1234321;
        int revert = 0;
        int copyNum = num10;

        while (copyNum != 0) {
            int lastDigit = copyNum % 10;
            revert *= 10;
            revert += lastDigit;
            copyNum /= 10;
        }
        if (revert == num10) {
            System.out.println("Число: " + num10 + " является палиндромом");
        } else {
            System.out.println("Число: " + num10 + " не является палиндромом");
        }

        //9 task
        System.out.println("\n9. Определение, является ли число счастливым");

        int number = 123123;
        int sum1 = 0, sum2 = 0, i = 1;
        while (number > 0) {
            int digit = number % 10;
            if (i <= 3) {
                sum1 += digit;
            } else {
                sum2 += digit;
            }
            number /= 10;
            if (i % 3 == 0) {
                System.out.println("Сумма цифр " + (i <= 3 ? "первой" : "второй") + " половины = " + (i <= 3 ? sum1 : sum2));
            }
            i++;
        }

        if (sum1 == sum2) {
            System.out.println("Число является счастливым");
        } else {
            System.out.println("Число не является счастливым");
        }

        //10 task
        System.out.println("\n10. Вывод таблицы умножения Пифагора");

        System.out.print("  | ");
        for (int k = 2; k <= 9; k++) {
            System.out.print(k + "\t");
        }
        System.out.println();

        System.out.print("--|");
        for (int j = 2; j <= 9; j++) {
            System.out.print("----");
        }
        System.out.println();

        for (int h = 2; h <= 9; h++) {
            System.out.print(h + " | ");
            for (int j = 2; j <= 9; j++) {
                System.out.print(h * j + "\t");
            }
            System.out.println();
        }
    }
}
