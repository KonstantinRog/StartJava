public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int even = 0;
        int odd = 0;
        for (int i = -10; i <= 21; i ++) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.print("В промежутке [-10, 21] сумма четных чисел ");
        System.out.print("= " + even + ", а нечетных: " + odd);

        System.out.println("\n\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = 0;
        int min = 0;
        if (num1 > num2) {
            max = num1;
            min = num2;
        }
        if (max < num3) {
            max = num3;
        } else if (min > num3) {
            min = num3;
        }
        for (int i = max - 1; i > min; i--) {
            if (i == min + 1) {
                System.out.print(i + ".");
            } else {
                System.out.print(i + ", ");
            }
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int j = 0;
        int num4 = 1234;
        int sum = 0;
        int numReverse = 0;
        int numCheck = num4;
        int del = 0;
        while (numCheck != 0) {
            del = numCheck % 10;
            sum += del;
            numReverse = numReverse * 10 + del;
            numCheck /= 10;
        }
        System.out.println("Число в обратном порядке: " + numReverse);
        System.out.println("Сумма цифр: " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int iteration = 0;
        for (int i = 1; i < 24; i += 2) {
            iteration++;
            if (iteration == 5) {
                System.out.printf("%2d \n", i);
                iteration = 0;
            } else {
                System.out.printf("%2d ", i);
            }
        }
        for ( int i = 5 - iteration; i > 0; i--) {
            System.out.printf("%2d ", 0);
        }

        System.out.println("\n\n5. Проверка количества единиц на четность");
        int num5 = 3141591;
        int num6 = 0;
        int numbOne = 0;
        numCheck = num5;
        numReverse = 0;
        while (numCheck != 0) {
            del = numCheck % 10;
            numCheck /= 10;
            if (del == 1) {
                numbOne++;
            }
        }
        if (numbOne % 2 == 0) {
            System.out.println("Число " + num5 + " содержит четное количество единиц");
        } else {
            System.out.println("Число " + num5 + " содержит нечетное количество единиц");
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
        numCheck = numFirst;
        del = 0;
        while (numCheck != 0) {
            del = numCheck % 10;
            numReverse = numReverse * 10 + del;
            numCheck = numCheck / 10;
        }
        if (numFirst == numReverse) {
            System.out.println("Число является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        int num7 = 124304;
        int intToPrint = num7;
        int sumFirst = 0;
        int sumLast = 0;
        int numForCheck = 0;
        numCheck = num7;
        numReverse = 0;
        while (num7 / 100 > 9) {
            sumLast += num7 % 10;
            numReverse = numReverse * 10 + num7 % 10;
            num7 /= 10;
        }
        while (numReverse != 0) {
            numForCheck = numForCheck * 10 + numReverse % 10;
            numReverse /= 10;
        }
        numCheck = num7;
        while (numCheck != 0) {
            sumFirst += numCheck % 10;
            numCheck = numCheck / 10;
        }
        System.out.println(num7);
        System.out.println(numForCheck);
        System.out.println("Сумма цифр " + num7 + " = " + sumFirst);
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