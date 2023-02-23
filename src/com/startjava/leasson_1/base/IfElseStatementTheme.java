package leasson1;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        //1 task
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 50;
        boolean maleGender = false;
        int height = 0;
        char firstLetterName = "Mark".charAt(0);

        if (age > 20) {
            System.out.println("Мужчина");
        } else {
            System.out.println("Парень");
        }

        if (!maleGender) {
            System.out.println("Женщина");
        } else {
            System.out.println("Мужчина");
        }

        if (height < 1.80) {
            System.out.println("Низкий");
        } else {
            System.out.println("Высокий");
        }

        if (firstLetterName == 'M') {
            System.out.println("Men");
        } else if (firstLetterName == 'W') {
            System.out.println("Women");
        } else {
            System.out.println("Ничего \n");
        }

        //2 task
        System.out.println("\n2. Поиск max и min числа");
        int num1 = 10;
        int num2 = 11;
        if (num1 > num2) {
            System.out.println("Число: " + num1 + " > " + num2);
        } else if (num1 == num2) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Число: " + num1 + " < " + num2);
        }

        //3 task
        System.out.println("\n3. Проверка числа");
        int anyNumber = 0;

        if (anyNumber != 0) {
            if (anyNumber % 2 == 0) {
                System.out.println("Четное число: " + anyNumber);
            } else {
                System.out.println("Нечетное число: " + anyNumber + "\n");
            }
            if (anyNumber > 0) {
                System.out.println("Положительное число: " + anyNumber);
            } else {
                System.out.println("Отрицательное число: " + anyNumber);
            }
        } else {
            System.out.println("Число является: " + anyNumber);
        }

        //4 task
        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num3 = 551;
        int num4 = 225;
        System.out.println("Число 1: " + num3 + "\n" + "Число 2: " + num4);

        int hundreds1 = num3 / 100;
        int tens1 = num3 / 10 % 10;
        int ones1 = num3 % 10;

        int hundreds2 = num4 / 100;
        int tens2 = num4 / 10 % 10;
        int ones2 = num4 % 10;

        if (hundreds1 == hundreds2 || tens1 == tens2 || ones1 == ones2) {
            if (hundreds1 == hundreds2) {
                System.out.println("Сотни Числа: " + hundreds1 + " и " + hundreds2 + " одинаковые" + " 1 разряд");
            }
            if (tens1 == tens2) {
                System.out.println("Числа: " + tens1 + " и " + tens2 + " одинаковые" + " 2 разряд");
            }
            if (ones1 == ones2) {
                System.out.println("Числа: " + ones1 + " и " + ones2 + " одинаковые" + " 3 разряд");
            }
        } else {
            System.out.println("Нет равных чисел");
        }

        //5 task
        System.out.println("\n5. Определение символа по его коду");
        char char1 = '\u0057';
        System.out.println("символ: " + char1);

        if (char1 >= 'A' && char1 <= 'Z') {
            System.out.println("большая буква");
        } else if (char1 >= 'a' && char1 <= 'z') {
            System.out.println("маленькая буква");
        } else if (char1 >= '0' && char1 <= '9') {
            System.out.println("число");
        } else {
            System.out.println("не буква и не число");
        }

        //6 task
        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int sumDeposit = 100_001;
        double interestRate = 0.05;

        if (sumDeposit >= 100_000 || sumDeposit <= 300_000) {
            interestRate = 0.07;
        } else if (sumDeposit > 300_000) {
            interestRate = 0.10;
        }

        interestRate = sumDeposit * interestRate;
        double totalAmount = sumDeposit + interestRate;

        System.out.println("Сумма вклада: " + sumDeposit);
        System.out.println("Hачисленный %: " + interestRate);
        System.out.println("Итоговая сумма с %: " + totalAmount);

        //7 task
        System.out.println("\n7. Определение оценки по предметам");

        double scoreHistory = 0.59;
        int rateHistory = 0;

        if (scoreHistory <= 0.60) {
            rateHistory = 2;
        } else if (scoreHistory == 0.60 || scoreHistory < 0.73) {
            rateHistory = 3;
        } else if (scoreHistory == 0.73 || scoreHistory < 0.91) {
            rateHistory = 4;
        } else if (scoreHistory >= 0.91) {
            rateHistory = 5;
        }
        System.out.println(rateHistory + " История");

        double scoreProgramming = 0.91;
        int rateProgramming = 0;

        if (scoreProgramming <= 0.60) {
            rateProgramming = 2;
        } else if (scoreProgramming == 0.60 || scoreProgramming < 0.73) {
            rateProgramming = 3;
        } else if (scoreProgramming == 0.73 || scoreProgramming < 0.91) {
            rateProgramming = 4;
        } else if (scoreProgramming >= 0.91) {
            rateProgramming = 5;
        }
        System.out.println(rateProgramming + " Программирование");

        double averageScore = (rateHistory + rateProgramming) / 2.0;

        System.out.println("Средний балл оценок по предметам: " + averageScore);
        System.out.println("Cредний % по предметам: " + (scoreProgramming + scoreHistory) / 2 + "%");

        //8 task
        System.out.println("\n8. Расчет прибыли за год");
        int room = 5000;
        int product = 13000;
        int primeCost = 9000;
        int profit = (product - (primeCost + room)) * 12;

        String numStr = profit >= 0 ? "+" + profit : String.valueOf(profit);
        System.out.println("Прибыль за год: " + (profit > 0 ? "+" : "") + profit);

        //9 task
        System.out.println("\n9. Подсчет количества банкнот");
        int amountOfMoney = 1100;

        int count1 = 50;
        int count10 = 5;
        int count100 = 10;

        int hundreds = amountOfMoney / 100;
        int tens = amountOfMoney / 10 % 10;
        int ones = amountOfMoney % 10;

        int need1 = ones;
        int need10 = tens;
        int need100 = hundreds;

        int denominationAmount100 = count100 * 100;
        int denominationAmount10 = count10 * 10;
        int denominationAmount1 = count1;

        denominationAmount1 += denominationAmount10 + denominationAmount100;

        if (amountOfMoney <= denominationAmount1){
            if (hundreds > count100) {
                need100 = count100;
                tens += (hundreds - count100) * 10;
            }
            if (tens > count10) {
                need10 = count10;
                need1 += (tens - count10) * 10;
            }
            if (need1 <= count1) {
                System.out.println("Номиналы банкнот\n" + "100 в количестве - " + need100
                        + ",\n" + "10 в количестве - " + need10 + ",\n"
                        + "1 в количестве - " + need1 + "\nвыдаваемая сумма: " + amountOfMoney);
            }
        } else {
            System.out.println("В банкомате недостаточно средств");
        }
    }
}
