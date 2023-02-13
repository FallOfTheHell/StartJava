public class IfElseStatementTheme {
    public static void main(String[] args) {
        //1 task
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 50;
        boolean genderMen = false;
        int height = 0;
        char firstLetterName = 'M';

        if (age > 20) {
            System.out.println("Мужчина");
        } else {
            System.out.println("Парень");
        }

        if (!genderMen) {
            System.out.println("Женщина");
        } else {
            System.out.println("Мужчина");
        }

        if (height < 1.80) {
            System.out.println("Короткий");
        } else {
            System.out.println("Длинный");
        }

        firstLetterName = "M".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Men");
        } else if (firstLetterName == 'I') {
            System.out.println("Iron");
        } else {
            System.out.println("Ничего \n");
        }

        //2 task
        System.out.println("2. Поиск max и min числа");
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
        System.out.println("3. Проверка числа");
        int anyNumber = 1;
        if (anyNumber % 2 == 0 && anyNumber > 0) {
            System.out.println("Четное число: " + anyNumber);
            System.out.println("Положительное число: " + anyNumber);
        } else if (anyNumber == 0) {

        } else {
            System.out.println("Отрицательное число: " + anyNumber);
            System.out.println("Нечетное число: " + anyNumber);
        }

        //4 task
        int number1 = 123;
        int number2 = 234;

        //5 task
        System.out.println("5. Определение символа по его коду");
        char char1 = '\u0057';
        if (char1 == 'W') {
            System.out.println("большая буква");
        } else if (char1 == 'w') {
            System.out.println("маленькая буква");
        } else if (char1 == '2') {
            System.out.println("число");
        } else if (char1 == '}') {
            System.out.println("не буква и не число");
        }

        //6 task
        System.out.println("6. Подсчет суммы вклада и начисленных банком %");
        int depositAmount = 110_000;
        double percent;
        double summaPercent;
        if (depositAmount < 100_000) {
            percent = (depositAmount * 0.05 / 365 * 365);
            summaPercent = depositAmount + percent;
            System.out.println("Сумма вклада: " + depositAmount);
            System.out.println("Hачисленный %: " + percent);
            System.out.println("Итоговая сумма с %: " + summaPercent);
        } else if (depositAmount == 100_000 || depositAmount < 300_000) {
            percent = (depositAmount * 0.07 / 365 * 365);
            summaPercent = depositAmount + percent;
            System.out.println("Сумма вклада: " + depositAmount);
            System.out.println("Hачисленный %: " + percent);
            System.out.println("Итоговая сумма с %: " + summaPercent);
        } else if (depositAmount > 300_000) {
            percent = (depositAmount * 0.10 / 365 * 365);
            summaPercent = depositAmount + percent;
            System.out.println("Сумма вклада: " + depositAmount);
            System.out.println("Hачисленный %: " + percent);
            System.out.println("Итоговая сумма с %: " + summaPercent);
        }

        //7 task
        System.out.println("7. Определение оценки по предметам");
        double amount = 0;
        double story = 0.59;
        if (story <= 0.60) {
            amount = 2;
            System.out.println("2 История");
        } else if (story == 0.60 | story < 0.73) {
            amount = 3;
            System.out.println("3 История");
        } else if (story == 0.73 | story < 0.91) {
            amount = 4;
            System.out.println("4 История");
        } else if (story >= 0.91) {
            amount = 5;
            System.out.println("5 История");
        }

        double programming = 0.91;
        if (programming <= 0.60) {
            amount = 2;
            System.out.println("Програмирование");
        } else if (programming == 0.60 | programming < 0.73) {
            amount = 3;
            System.out.println("3 Програмирование");
        } else if (programming == 0.73 | programming < 0.91) {
            amount = 4;
            System.out.println("4 Програмирование");
        } else if (programming >= 0.91) {
            amount = 5;
            System.out.println("5 Програмирование");
        }
        System.out.println("Средний балл оценок по предметам: " + amount / 2);
        System.out.println("Cредний % по предметам: " + (programming + story) / 2 + "%");


        //8 task
        System.out.println("8. Расчет прибыли за год");
        int room = 5000;
        int product = 13000;
        int primeCost = 9000;
        int profit = 0;

        profit = (product - (primeCost + room)) * 12;
        if (profit >= 0) {
            System.out.println("прибыль за год: " + profit);
        } else if (profit < 0) {
            System.out.println("прибыль за год: " + profit);

        }

        //9 task
        System.out.println("9. Подсчет количества банкнот");
        int amountOfMoney = 567;

        int banknotes100 = 10;
        int banknotes10 = 5;
        int banknotes1 = 50;
        int count;
        int denomination100 = 100;
        int denomination10 = 10;
        int denomination1 = 1;

        System.out.println("Номиналы банкнот: " + denomination100 + " купюр по " + "100 USD");
        System.out.println("Номиналы банкнот: " + denomination10 + " купюр по " + "10 USD");
        System.out.println("Номиналы банкнот: " + denomination1 + " купюр по " + "1 USD");
        System.out.println("Нужно снять сумму: " + amountOfMoney);

        int hundred = amountOfMoney / 100;
        int ten = amountOfMoney / 10;
       
        System.out.println(hundred);
        System.out.println(ten);

    }
}
