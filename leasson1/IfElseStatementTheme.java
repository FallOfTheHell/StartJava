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
        int num2 = 10;
        if (num1 > num2) {
            System.out.println("Число num1 > num2");
        } else if (num1 == num2) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Число num1 < num2");
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
            System.out.println("Число является 0");
        }

        //4 task
        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int numOne = 551;
        int numTwo = 225;
        System.out.println("Число 1: " + numOne + "\n" + "Число 2: " + numTwo);

        int hundreds1 = numOne / 100;
        int tens1 = numOne / 10 % 10;
        int ones1 = numOne % 10;

        int hundreds2 = numTwo / 100;
        int tens2 = numTwo / 10 % 10;
        int ones2 = numTwo % 10;

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
        double sumDeposit = 90_000.0;
        double interestRate = 0.05;
        int daysInYear = 365;
        double dailyInterestRate = interestRate / daysInYear;
        double yearlyInterest = (sumDeposit * dailyInterestRate) * daysInYear;

        if (sumDeposit == 100_000 || sumDeposit < 300_000) {
            interestRate = 0.07;
            dailyInterestRate = interestRate / daysInYear;
            yearlyInterest = (sumDeposit * dailyInterestRate) * daysInYear;
        } else if (sumDeposit > 300_000) {
            interestRate = 0.10;
            dailyInterestRate = interestRate / daysInYear;
            yearlyInterest = (sumDeposit * dailyInterestRate) * daysInYear;
        }
        double depositAmount = sumDeposit + yearlyInterest;
        System.out.println("Сумма вклада: " + sumDeposit);
        System.out.println("Hачисленный %: " + yearlyInterest);
        System.out.println("Итоговая сумма с %: " + depositAmount);

        //7 task
        System.out.println("\n7. Определение оценки по предметам");
        double scoreHistory = 0.59;
        int assessmentByHistory = 0;

        if (scoreHistory <= 0.60) {
            assessmentByHistory = 2;
            System.out.println("2 История");
        } else if (scoreHistory == 0.60 || scoreHistory < 0.73) {
            assessmentByHistory = 3;
            System.out.println("3 История");
        } else if (scoreHistory == 0.73 || scoreHistory < 0.91) {
            assessmentByHistory = 4;
            System.out.println("4 История");
        } else if (scoreHistory >= 0.91) {
            assessmentByHistory = 5;
            System.out.println("5 История");
        }

        double scoreProgramming = 0.91;
        int assessmentByProgramming = 0;

        if (scoreProgramming <= 0.60) {
            assessmentByProgramming = 2;
            System.out.println("Програмирование");
        } else if (scoreProgramming == 0.60 || scoreProgramming < 0.73) {
            assessmentByProgramming = 3;
            System.out.println("3 Програмирование");
        } else if (scoreProgramming == 0.73 || scoreProgramming < 0.91) {
            assessmentByProgramming = 4;
            System.out.println("4 Програмирование");
        } else if (scoreProgramming >= 0.91) {
            assessmentByProgramming = 5;
            System.out.println("5 Програмирование");
        }
        double average = (assessmentByHistory + assessmentByProgramming) / 2.0;

        System.out.println("Средний балл оценок по предметам: " + average);
        System.out.println("Cредний % по предметам: " + (scoreProgramming + scoreHistory) / 2 + "%");

        //8 task
        System.out.println("\n8. Расчет прибыли за год");
        int room = 5000;
        int product = 13000;
        int primeCost = 9000;
        int profit = (product - (primeCost + room)) * 12;

        if (profit >= 0) {
            System.out.println("прибыль за год: " + "+" + profit);
        } else if (profit < 0) {
            System.out.println("прибыль за год: " + profit);
        }

        //9 task
        System.out.println("\n9. Подсчет количества банкнот");
        int amountOfMoney = 1101;

        int count1 = 50;
        int count10 = 5;
        int count100 = 10;

        int hundreds = amountOfMoney / 100;
        int tens = amountOfMoney / 10 % 10;
        int ones = amountOfMoney % 10;

        int need1 = ones;
        int need10 = tens;
        int need100 = hundreds;

        if (hundreds > count100) {
            need100 = count100;
            tens += (hundreds - count100) * 10;
        }

        if (tens > count10) {
            need10 = count10;
            need1 += (tens - count10) * 10;
        }

        if (need1 > count1) {
            System.out.println("В банкомате недостаточно средств");
        } else {
            System.out.println("Номиналы банкнот\n" + "100 в количестве - " + need100
                    + ",\n" + "10 в количестве - " + need10 + ",\n"
                    + "1 в количестве - " + need1 + "\nвыдаваемая сумма: " + amountOfMoney);
        }


    }
}
