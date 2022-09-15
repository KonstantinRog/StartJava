public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int sumEven = 0;
        int sumOdd = 0;
        int j = -10;
        do {
            if (j % 2 == 0) {
                sumEven += j;
            } else {
                sumOdd += j;
            }
            j++;
        } while(j <= 21);
        System.out.print("В промежутке [-10, 21] сумма четных чисел ");
        System.out.print("= " + sumEven + ", а нечетных: " + sumOdd);

        System.out.println("\n\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num2;
        if (max < num3) {
            max = num3;
        }
        if (min > num3) {
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
                System.out.print(" \n");
            }
            count++;
            System.out.printf("%2d ", i);
        }
        for (int i = 5 - count; i > 0; i--) {
            System.out.printf("%2d ", 0);
        }

        System.out.println("\n\n5. Проверка количества единиц на четность");
        num4 = 3141591;
        int numbOne = 0;
        copyNum4 = num4;
        while (copyNum4 != 0) {
            int digit = copyNum4 % 10;
            copyNum4 /= 10;
            if (digit == 1) {
                numbOne++;
            }
        }
        if (numbOne % 2 == 0) {
            System.out.println("Число " + num4 + " содержит четное количество единиц");
        } else {
            System.out.println("Число " + num4 + " содержит нечетное количество единиц");
        }

        System.out.println("\n6. Отображение фигур в консоли");
        char ch1 = '*';
        char ch2 = '#';
        char ch3 = '$';
        boolean reverse = false;
        for (int i = 1; i <= 50; i ++) {
            if (i % 10 == 0) {
                System.out.print(ch1 + "\n");
            } else {
                System.out.print(ch1);
            }
        }
        System.out.print("\n");
        j = 5;
        while (j > 0) {
            for (int i = j; i > 0; i--){
                System.out.print(ch2);
            }
            System.out.print("\n");
            j--;
        }
        System.out.print("\n");
        j = 0;
        do {
            if ((j < 3) && (reverse == false)) {
                for (int i = j; i > 0; i--) {
                    System.out.print(ch3);
                }
                j++;
                System.out.print("\n");
            } else {
                reverse = true;
                for (int i = j; i > 0; i--) {
                    System.out.print(ch3);
                }
                System.out.print("\n");
                j--;
            }
        } while(j > 0); 

        System.out.println("\n7. Отображение ASCII-символов");
        char ch4 = 0;
        System.out.println("Все символы:");
        for (int i = 0; i < 127; i++) {
            ch4 = (char) i;
            System.out.printf("Dec: %3d, Char: %3c\n", i, ch4);
        }
        System.out.println("Символы, идущие до цифр и имеющие нечетные коды:");
        for (int i = 0; i < 48; i++) {
            ch4 = (char) i;
            if (i % 2 != 0) {
                System.out.printf("Dec: %3d, Char: %3c\n", i, ch4);
            }
        }
        System.out.println("Маленькие английские буквы, имеющие четные коды:");
        for (int i = 97; i < 123; i++) {
            ch4 = (char) i;
            if (i % 2 == 0) {
                System.out.printf("Dec: %3d, Char: %3c\n", i, ch4);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int numFirst = 1234321;
        int copyNumFirst = numFirst;
        int numReverse = 0;
        while (copyNumFirst != 0) {
            int digit = copyNumFirst % 10;
            numReverse = numReverse * 10 + digit;
            copyNumFirst = copyNumFirst / 10;
        }
        if (numFirst == numReverse) {
            System.out.println("Число является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        num4 = 124304;
        int intToPrint = num4;
        int sumFirst = 0;
        int sumLast = 0;
        int numForCheck = 0;
        copyNum4 = num4;
        numReverse = 0;
        while (num4 / 100 > 9) {
            sumLast += num4 % 10;
            numReverse = numReverse * 10 + num4 % 10;
            num4 /= 10;
        }
        while (numReverse != 0) {
            numForCheck = numForCheck * 10 + numReverse % 10;
            numReverse /= 10;
        }
        copyNum4 = num4;
        while (copyNum4 != 0) {
            sumFirst += copyNum4 % 10;
            copyNum4 = copyNum4 / 10;
        }
        System.out.println(num4);
        System.out.println(numForCheck);
        System.out.println("Сумма цифр " + num4 + " = " + sumFirst);
        System.out.println("Сумма цифр " + numForCheck + " = " + sumLast);
        if (sumFirst == sumLast) {
            System.out.println("Число " + intToPrint + " является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        int result = 0;
        char ch5 = '|';
        char ch6 = '_';
        char ch8 = 0;
        char ch9 = '-';
        boolean firsIteration = true;
        for (int i = 0; i < 10; i++) {
            if (i > 1) {
                System.out.printf("%3d", i);
            } else if (i == 1) {
                System.out.print(ch5);
            } else {
                System.out.printf("%3c", ch8);
            }
        }
        System.out.print("\n");
        for (int i = 0; i < 9; i++) {
            System.out.printf("%3c", '-');
        }
        System.out.print("\n");
        for (int i = 2; i < 10; i++) {
            System.out.printf("%3d" + ch5, i);
            for (int m = 2; m < 10; m++) {
                result = i * m;
                System.out.printf("%3d", result);
            }
            System.out.print("\n");
        }
    }
}