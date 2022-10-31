package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {2, 5, 4, 1, 3, 7, 6};
        printIntArr(intArr);
        reverseArray(intArr);
        System.out.println();
        printIntArr(intArr);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        int len = 10;
        int[] intArr2 = new int[len];
        int multDigits = 1;
        for (int i = 0; i < len; i++) {
            intArr2[i] = i;
        }
        for (int i = 1; i < len - 1; i++) {
            multDigits *= intArr2[i];
            System.out.print(i + (i < len - 2 ? " * " : " = " + multDigits));
        }
        System.out.println("\n" + intArr2[0] + " " + intArr2[9]);

        System.out.println("\n3. Удаление элементов массива");
        len = 15;
        double[] doubleArr = new double[len];
        System.out.println("Исходный массив:");
        for (int i = 0; i < len; i++) {
            double randomNum = Math.random();
            doubleArr[i] = randomNum;
        }
        printDoubleArr(doubleArr);
        double middleNum = doubleArr[len / 2];
        int zeroedNum = 0;
        System.out.println("\nИзмененный массив:");
        for (int i = 0; i < len; i++) {
            if (middleNum < doubleArr[i]) {
                doubleArr[i] = 0;
                zeroedNum++;
            }
        }
        printDoubleArr(doubleArr);
        System.out.println("\nКоличество обнуленных ячеек: " + zeroedNum);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        len = 26;
        char[] engAlphArr = new char[len];
        for (int i = 0; i < len; i++) {
            engAlphArr[i] = (char) ('A' + i);
        }
        for (int i = 1; i < len + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(engAlphArr[engAlphArr.length - j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        len = 30;
        int[] intArr3 = new int[len];
        int randomNum;
        for (int i = 0; i < len; i++) {
            do {
                randomNum = (int) (60 + Math.random() * 40);
                for (int k : intArr3) {
                    if (randomNum == k) {
                        randomNum = 0;
                        break;
                    } else if (k == 0) {
                        break;
                    }
                }
                intArr3[i] = randomNum;
            } while(randomNum == 0);
        }
        int temp;
        for (int i = intArr3.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intArr3[j] > intArr3[j + 1]) {
                    temp = intArr3[j];
                    intArr3[j] = intArr3[j + 1];
                    intArr3[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < len; i++) {
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
    private static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tempNum = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tempNum;
        }
    }

    private static void printIntArr(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    private static void printDoubleArr(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 8) {
                System.out.println();
            }
            System.out.printf("%.3f ", array[i]);
        }
    }
}
