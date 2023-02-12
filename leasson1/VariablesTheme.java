import static java.awt.AlphaComposite.XOR;

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
        boolean bol = true;
        System.out.println("Byte " + ram);
        System.out.println("Short " + core);
        System.out.println("Integer " + storage);
        System.out.println("Long " + videoCard);
        System.out.println("Float " + cpu);
        System.out.println("Double " + hertz);
        System.out.println("Character " + coreName);
        System.out.println("Boolean " + bol + "\n");

        //2 task
        System.out.println("2. Расчет стоимости товара со скидкой");
        int pricePen = 100;
        int priceBook = 200;
        double discount = (pricePen + priceBook) * 0.89;
        double discountPrice = (pricePen + priceBook) - discount;
        System.out.println("сумма скидки: " + discountPrice);
        System.out.println("общая стоимость товаров со скидкой: " + discount + "\n");

        //3 task
        System.out.println("3. Вывод слова JAVA");

        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  v v  aaaaa");
        System.out.println(" JJ  a     a  v  a     a\n");

        //4 task
        System.out.println("4. Вывод min и max значений целых числовых типов");

        byte numByte = Byte.MAX_VALUE;
        System.out.println(numByte);
        numByte++;
        System.out.println(numByte);
        numByte--;
        System.out.println(numByte + "\n");

        short numShort = Short.MAX_VALUE;
        System.out.println(numShort);
        numShort++;
        System.out.println(numShort);
        numShort--;
        System.out.println(numShort + "\n");

        int numInteger = Integer.MAX_VALUE;
        System.out.println(numInteger);
        numInteger++;
        System.out.println(numInteger);
        numInteger--;
        System.out.println(numInteger + "\n");

        long numLong = Long.MAX_VALUE;
        System.out.println(numLong);
        numLong++;
        System.out.println(numLong);
        numLong--;
        System.out.println(numLong + "\n");


        boolean numBoolean = Boolean.TRUE;
        System.out.println(numBoolean + "\n");

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

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("Новые значения переменных: " + "num1 = " + num1 + ", num2 = " + num2 + "\n");

        System.out.println("C помощью побитовой операции ^");
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Новые значения переменных: " + "num1 = " + num1 + ", num2 = " + num2 + "\n");

        //6 task
        System.out.println("6. Вывод символов и их кодов");

        char grid = '#';
        int c35 = 35;
        char and = '&';
        int c38 = 38;
        char mail = '@';
        int c64 = 64;
        char degree = '^';
        int c94 = 94;
        char underline = '_';
        int c95 = 95;
        System.out.println(grid + " - " + c35);
        System.out.println(and + " - " + c38);
        System.out.println(mail + " - " + c64);
        System.out.println(degree + " - " + c94);
        System.out.println(underline + " - " + c95 + "\n");

        //7 task

        //8 task
        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        int num123 = 123;
        int hundred = num123 / 100;
        int ten = num123 / 10;
        int units = num123 % 10;
        System.out.println(hundred);
        System.out.println(ten);
        System.out.println(units + "\n");

        //9 task
        int numSec = 86399;
        int hour = numSec/3600;
        int min = numSec/60 % 60;
        int sec = numSec % 60;
        System.out.println(hour + ":" + min + ":" + sec);
    }
}
