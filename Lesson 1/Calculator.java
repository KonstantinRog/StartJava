public class Calculator {
    public static void main(String[] args) {
        int a = 200;
        int b = 10;
        int result = 0;
        char sign = '/';
        boolean noOut = false;

        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            if (b == 0) {
                noOut = true;
            } else {
                result = a / b;
            }
        } else if (sign == '^') {
            for (int i = 0; i < b - 1; i++) {
                System.out.println(i);
                if (result == 0) {
                    result = a * a;
                } else {
                    result = result * a;
                }
            }
        } else if (sign == '%') {
            result = (a / 100) * b;
        } else {
            noOut = true;
        }
        
        if (noOut == true) {
            System.out.println("Ошибка вычислений");
        } else {
            System.out.println(a + " " + sign + " " + b + " = " + result);
        }
    }
}