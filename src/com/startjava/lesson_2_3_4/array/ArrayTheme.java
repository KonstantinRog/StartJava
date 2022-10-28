package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {2, 5, 4, 1, 3, 7, 6};
        for (int num : intArr) {
            System.out.print(num + " ");
        }
        intArr = reverseArray(intArr);
        System.out.println();
        for (int num : intArr) {
            System.out.print(num + " ");
        }

        System.out.println("\n\n2. Вывод произведения элементов массива");
        int[] intArr2 = new int[10];
        int result = 1;
        for (int i = 0; i < intArr2.length; i++) {
            intArr2[i] = i;
            result *= (i == 0 || i == 9) ? 1 : intArr2[i];
        }
        String answer = "";
        for (int i = 1; i < intArr2.length - 1; i++) {
            answer += (i == 8) ? intArr2[i] + " = " : intArr2[i] + " * ";
        }
        System.out.println(answer + result);
        System.out.println(intArr2[0]);
        System.out.println(intArr2[9]);

        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        System.out.println("Исходный массив:");
        for (int i = 0; i < doubleArr.length; i++) {
            double randomNum = Math.random();
            doubleArr[i] = randomNum;
            if (i == 8) {
                System.out.println();
            }
            System.out.printf("%.3f ", doubleArr[i]);
        }
        double averageNum = doubleArr[doubleArr.length / 2];
        int zeroedNum = 0;
        System.out.println("\nИзмененный массив:");
        for (int i = 0; i < doubleArr.length; i++) {
            if (averageNum < doubleArr[i]) {
                doubleArr[i] = 0;
                zeroedNum++;
            }
            if (i == 8) {
                System.out.println();
            }
            System.out.printf("%.3f ", doubleArr[i]);
        }
        System.out.println();
        System.out.println("Количество обнуленных ячеек: " + zeroedNum);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] charArr = new char[26];
        for (int i = 0, j = 65; j < charArr.length + 65; i++, j++) {
            charArr[i] = (char) j;
        }
        for (int i = 1; i < 27; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(charArr[charArr.length - j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        int[] intArr3 = new int[30];
        for (int i = 0; i < intArr3.length; i++) {
            while (true) {
                int num = (int) (60 + Math.random() * 40);
                for (int k : intArr3) {
                    num *= (num == k) ? 0 : 1;
                }
                if (num != 0) {
                    intArr3[i] = num;
                    break;
                }
            }
        }
        boolean sort = false;
        while (!sort) {
            sort = true;
            for (int i = 0; i < intArr3.length - 1; i++){
                if (intArr3[i] > intArr3[i + 1]) {
                    int tempNum = intArr3[i];
                    intArr3[i] = intArr3[i + 1];
                    intArr3[i + 1] = tempNum;
                    sort = false;
                }
            }
        }
        for (int i = 0; i < intArr3.length; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(intArr3[i] + " ");
        }

        System.out.println("\n\n6. Сдвиг элементов массива");
        String[] strArr = new String[]{"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int length = 0;
        for (String s : strArr) {
            if (!s.trim().equals("")) {
                length++;
            }
            System.out.print(s + " ");
        }
        String[] strArr2 = new String[length];
        int firstPos = 0;
        int secondPos = 0;
        int copiedIndex = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].trim().equals("") && (copiedIndex < i || firstPos == 0)) {
                firstPos = i;
                int copyNum = 0;
                for (int j = i; j < strArr.length; j++) {
                    if (strArr[j].trim().equals("")) {
                        System.arraycopy(strArr, firstPos, strArr2, secondPos, copyNum);
                        secondPos += copyNum;
                        copiedIndex = j - 1;
                        break;
                    }
                    copyNum++;
                }
            }
        }
        System.out.println();
        for (String string : strArr2) {
            System.out.print(string + " ");
        }
    }
    private static int[] reverseArray(int[] array) {
        int[] copyArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copyArray[array.length - i - 1] = array[i];
        }
        return  copyArray;
    }
}
