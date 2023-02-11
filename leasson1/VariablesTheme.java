public class VariablesTheme {
    public static void main(String[] args) {
        //1 task
        byte b = 127;
        short s = 1123;
        int i = 64536;
        long l = 2147483648L;
        float f = 3.141f;
        double d = 5.123;
        char c = 'z';
        boolean bol = true;
        System.out.println("Integer " + i);
        System.out.println("Byte " + i);
        System.out.println("Short " + s);
        System.out.println("Long " + l);
        System.out.println("Float " + f);
        System.out.println("Double " + d);
        System.out.println("Character " + c);
        System.out.println("Boolean " + bol + "\n");

        //2 task
        int pricePen = 100;
        int priceBook = 200;
        double discount = (pricePen + priceBook) * 0.89;
        double amountDiscount = (pricePen + priceBook) - discount;
        System.out.println("сумма скидки: " + amountDiscount);
        System.out.println("общая стоимость товаров со скидкой: " + discount + "\n");

        //3 task
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  v v  aaaaa");
        System.out.println(" JJ  a     a  v  a     a\n");

        //4 task
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

        float numFloat = Float.MAX_VALUE;
        System.out.println(numFloat);
        numFloat++;
        System.out.println(numFloat);
        numFloat--;
        System.out.println(numFloat + "\n");

        double numDouble = Double.MAX_VALUE;
        System.out.println(numDouble);
        numDouble++;
        System.out.println(numDouble);
        numDouble--;
        System.out.println(numDouble + "\n");

        char numCharacter = Character.MAX_VALUE;
        System.out.println(numCharacter);
        numCharacter++;
        System.out.println(numCharacter);
        numCharacter--;
        System.out.println(numCharacter + "\n");

        boolean numBoolean = Boolean.TRUE;
        System.out.println(numBoolean + "\n");

        //5 task
        int num1 = 2;
        int num2 = 5;
        System.out.println("C помощью третьей переменной: \n" +
                "num1 = " + num1 + ", num2 = " + num2);
        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("Новые значения переменных: " + "num1 = " + num1 + ", num2 = " + num2 + "\n");

        //6 task
        char c1 = 35;
        char c2 = 38;
        char c3 = 64;
        char c4 = 94;
        char c5 = 95;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5 + "\n");

        //7 task

        //8 task
        int number1 = 123 / 100;
        int number2 = 123 % 100;
        int number3 = 123 / 10 % 10;
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3 + "\n");

        //9 task
        int hour = 86399/3600;
        int min = 86399/60 % 60;
        int sec = 86399 % 60;
        System.out.println(hour + ":" + min + ":" + sec);
    }
}
