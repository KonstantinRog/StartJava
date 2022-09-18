public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int sumEven = 0;
        int sumOdd = 0;
        int counter = -10;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while(counter <= 21);
        System.out.print("В промежутке [-10, 21] сумма четных чисел ");
        System.out.print("= " + sumEven + ", а нечетных: " + sumOdd);

        System.out.println("\n\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num2;
        if (num1 < num2) {
            max = num2;
            min = num1;
        }
        if (num3 > max) {
            max = num3;
        } else if (num3 < min) {
            min = num3;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + "; ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num4 = 1234;
        int sumDigits = 0;
        int copyNum4 = num4;
        System.out.print("\nЧисло в обратном порядке: ");
        while (copyNum4 != 0) {
            int digit = copyNum4 % 10;
            sumDigits += digit;
            System.out.print(digit);
            copyNum4 /= 10;
        }
        System.out.println("\nСумма цифр: " + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int count = 0;
        for (int i = 1; i < 24; i += 2) {
            if (count == 5) {
                count = 0;
                System.out.println();
            }
            count++;
            System.out.printf("%2d ", i);
        }
        for (int i = 5 - count; i > 0; i--) {
            System.out.printf("%2d ", 0);
        }

        System.out.println("\n\n5. Проверка количества единиц на четность");
        num4 = 3141591;
        int numOnes = 0;
        copyNum4 = num4;
        while (copyNum4 != 0) {
            int digit = copyNum4 % 10;
            copyNum4 /= 10;
            if (digit == 1) {
                numOnes++;
            }
        }
        if (numOnes % 2 == 0) {
            System.out.println("Число " + num4 + " содержит четное количество единиц");
        } else {
            System.out.println("Число " + num4 + " содержит нечетное количество единиц");
        }

        System.out.println("\n6. Отображение фигур в консоли");
        boolean reverse = false;
        for (int i = 1; i <= 50; i ++) {
            System.out.print('*');
            if (i % 10 ==0) {
                System.out.println();
            }
        }

        System.out.println();
        counter = 5;
        while (counter > 0) {
            int counter2 = counter;
            while (counter2 > 0) {
                System.out.print('#');
                counter2--;
            }
            System.out.println();
            counter--;
        }

        counter = 0;
        do {
            int counter2 = counter;
            if (counter2 != 0) {
                do {
                    System.out.print('$');
                    counter2--;
                } while(counter2 > 0);
            }
            if (counter == 3) {
                reverse = true;
            }
            if (reverse) {
                counter--;
            } else {
                counter++;
            }
            System.out.println();
        } while(counter > 0);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("Символы, идущие до цифр и имеющие нечетные коды:");
        System.out.println("Dec  Char");
        for (int i = 0; i < 48; i++) {
            if (i % 2 != 0) {
                System.out.printf("%3d%3c\n", i, (char) i);
            }
        }
        System.out.println("Маленькие английские буквы, имеющие четные коды:");
        System.out.println("Dec  Char");
        for (int i = 97; i < 123; i++) {
            if (i % 2 == 0) {
                System.out.printf("%3d%3c\n", i, (char) i);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int num8 = 1234321;
        int copyNum8 = num8;
        int reverseNum = 0;
        while (copyNum8 != 0) {
            int digit = copyNum8 % 10;
            reverseNum = reverseNum * 10 + digit;
            copyNum8 /= 10;
        }
        if (num8 == reverseNum) {
            System.out.println("Число " + num8 + " является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        int num9 = 124304;
        int copyNum9 = num9;
        int sumFirst = 0;
        int sumLast = 0;
        int lastNum = 0;
        int firstNum = 0;
        reverseNum = 0;
        int j = 0;
        while (copyNum9 != 0) {
            j++;
            int digit = copyNum9 % 10;
            if (j > 3) {
                sumFirst += digit;
                firstNum = firstNum * 10 + digit;
            } else {
                sumLast += digit;
                lastNum = lastNum * 10 + digit;
            }
            copyNum9 /= 10;
        }
        System.out.println("Сумма цифр " + firstNum + " = " + sumFirst);
        System.out.println("Сумма цифр " + lastNum + " = " + sumLast);
        if (sumFirst == sumLast) {
            System.out.println("Число " + num9 + " является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        int result = 0;
        boolean firsIteration = true;
        for (int i = 0; i < 10; i++) {
            if (i > 1) {
                System.out.printf("%3d", i);
            } else if (i == 1) {
                System.out.print('|');
            } else {
                System.out.printf("%3c", ' ');
            }
        }
        System.out.println();
        for (int i = 0; i < 9; i++) {
            System.out.printf("%3c", '-');
        }
        System.out.println();
        for (int i = 2; i < 10; i++) {
            System.out.printf("%3d" + '|', i);
            for (int k = 2; k < 10; k++) {
                result = i * k;
                System.out.printf("%3d", result);
            }
            System.out.println();
        }
    }
}