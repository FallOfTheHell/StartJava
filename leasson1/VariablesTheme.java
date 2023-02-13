
public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль (это название задачи)");

        byte ram = 16;
        short core = 2;
        int storage = 1000;
        long videoCard = 1660L;
        float cpu = 3.60f;
        double hertz = 2.4;
        char coreName = 'I';
        boolean personal = true;
        System.out.println("ram " + ram);
        System.out.println("core " + core);
        System.out.println("storage " + storage);
        System.out.println("videoCard " + videoCard);
        System.out.println("cpu " + cpu);
        System.out.println("hertz " + hertz);
        System.out.println("coreName " + coreName);
        System.out.println("monitor " + personal + "\n");

        //2 task
        System.out.println("2. Расчет стоимости товара со скидкой");
        int pricePen = 100;
        int priceBook = 200;
        double discountSum = (pricePen + priceBook) * 0.89;
        double discountPrice = (pricePen + priceBook) - discountSum;
        System.out.println("сумма скидки: " + discountPrice);
        System.out.println("общая стоимость товаров со скидкой: " + discountSum + "\n");

        //3 task
        System.out.println("3. Вывод слова JAVA");

        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  v v  aaaaa");
        System.out.println(" JJ  a     a  v  a     a\n");

        //4 task
        System.out.println("4. Вывод min и max значений целых числовых типов");

        byte numByte = Byte.MAX_VALUE;
        short numShort = Short.MAX_VALUE;
        int numInteger = Integer.MAX_VALUE;
        long numLong = Long.MAX_VALUE;
        System.out.println(numByte + " " + ++numByte + " " + --numByte + "\n" +
                numShort + " " + ++numShort + " " + --numShort + "\n" +
                numInteger + " " + ++numInteger + " " + --numInteger + "\n" +
                numLong + " " + ++numLong + " " + --numLong + "\n");

        //5 task
        System.out.println("5. Перестановка значений переменных");

        int num1 = 2;
        int num2 = 5;

        System.out.println("C помощью третьей переменной: \n" +
                "num1 = " + num1 + ", num2 = " + num2);
        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("Новые значения переменных: " + "num1 = " + num1 + ", num2 = " + num2 + "\n");

        System.out.println("C помощью арифметических операций: \n" +
                "num1 = " + num1 + ", num2 = " + num2);

        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;

        System.out.println("Новые значения переменных: " + "num1 = " + num1 + ", num2 = " + num2 + "\n");

        System.out.println("C помощью побитовой операции ^");
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Новые значения переменных: " + "num1 = " + num1 + ", num2 = " + num2 + "\n");

        //6 task
        System.out.println("6. Вывод символов и их кодов");

        char numberSign = '#';
        char ampersand = '&';
        char commercialAt = '@';
        char circumflexAccent = '^';
        char lowLine = '_';

        System.out.println(numberSign + " - " + (int) numberSign);
        System.out.println(ampersand + " - " + (int) ampersand);
        System.out.println(commercialAt + " - " + (int) commercialAt);
        System.out.println(circumflexAccent + " - " + (int) circumflexAccent);
        System.out.println(lowLine + " - " + (int) lowLine + "\n");

        //7 task
        System.out.println("7. Вывод в консоль ASCII-арт Дюка\n");
        char solidus = '/';
        char reverseSolidus = '\\';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("    " + solidus + "" + reverseSolidus);
        System.out.println("   " + solidus + "  " + reverseSolidus);
        System.out.println("  " + solidus + lowLine + leftParenthesis + " " + rightParenthesis + reverseSolidus);
        System.out.println(" " + solidus + "      " + reverseSolidus);
        System.out.println("" + solidus + lowLine + lowLine + lowLine + lowLine + solidus + reverseSolidus + lowLine + lowLine + reverseSolidus + "\n");

        //8 task
        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        int num123 = 123;
        int hundreds = num123 / 100;
        int tens = (num123 - (hundreds * 100)) / 10;
        int ones = num123 % 10;
        System.out.println(hundreds + " " + tens + " " + ones + "\n");

        //9 task
        System.out.println("9. Вывод времени");
        int numSec = 86399;
        int hours = numSec / 3600;
        int mins = numSec / 60 % 60;
        int secs = numSec % 60;
        System.out.println(hours + ":" + mins + ":" + secs);
    }
}
