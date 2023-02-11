public class Calculator {
    public static void main(String[] args) {
        int result;
        char sign = '/';
        int a = (int) (Math.random()*10);
        int b = (int) (Math.random()*10);


        if(sign == '+'){
            result = a + b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (sign == '-'){
            result = a - b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (sign == '*'){
            result = a * b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (sign == '/'){
            result = a / b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (sign == '^'){
            result = (int) Math.pow(a, b);
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (sign == '%'){
            result = a % b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        }
    }
}
