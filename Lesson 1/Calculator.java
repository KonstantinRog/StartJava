public class Calculator {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int result = 0;
        char sign = '*';
        boolean isNoOut = false;

        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            if (b == 0) {
                isNoOut = true;
            } else {
                result = a / b;
            }
        } else if (sign == '^') {
            result = 1;
            for (int i = b; i != 0; i--) {
                result *= a;
                System.out.println(result);
            }
        } else if (sign == '%') {
            if (b == 0) {
                isNoOut = true;
            } else {
                result = a % b;
            }
        } else {
            isNoOut = true;
        }

        if (isNoOut == true) {
            System.out.println("Ошибка вычислений");
        } else {
            System.out.println(a + " " + sign + " " + b + " = " + result);
        }
    }
}