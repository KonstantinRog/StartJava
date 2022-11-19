package com.startjava.lesson_1.base;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 26;
        int check = 4;
        boolean male = true;
        float height = 1.82f;
        String name = "Konstantin";
        if (age > 20) {
            System.out.println("Возраст больше 20 лет");
        } else {
            System.out.println("Возраст меньше 21 года");
        }

        if (!male) {
            System.out.println("Женский пол");
        } else {
            System.out.println("Мужской пол");
        }

        if (height < 1.80) {
            System.out.println("Рост меньше 1 м 80 см");
        } else {
            System.out.println("Рост больше 1 м 79 см");
        }

        char firstLetter = name.charAt(0);
        if (firstLetter == 'M') {
            System.out.println("Первая буква имени M");
        } else if (firstLetter == 'I') {
            System.out.println("Первая буква имени I");
        } else {
            System.out.println("Первая буква имени " + firstLetter); 
        }

        System.out.println("\n2. Поиск max и min числа");
        var num1 = 356;
        var num2 = 143;
        if (num1 > num2) {
            System.out.println("Минимальное число: " + num2 + ", максимальное " + num1);
        } else if (num1 == num2) {
            System.out.println(num1 + " = " + num2);
        } else {
            System.out.println("Минимальное число: " + num1 + ", максимальное " + num2);
        }

        System.out.println("\n3. Работа с числом");
        int num3 = 746;
        if (num3 != 0) {
            if (num3 % 2 == 0) {
                if (num3 > 0) {
                    System.out.println("Число " + num3 + " больше 0 и четное");
                } else {
                    System.out.println("Число " + num3 + " меньше 0 и четное");
                }
            } else {
                if (num3 > 0) {
                    System.out.println("Число " + num3 + " больше 0 и нечетное");
                } else {
                    System.out.println("Число " + num3 + " меньше 0 и нечетное");
                }
            }
        } else {
            System.out.println("Число равно 0");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num4 = 345;
        int num5 = 365;
        int numOfHundreds1 = num4 / 100;
        int numOfTens1 = num4 / 10 % 10;
        int numOfOne1 = num4 % 10;
        int numOfHundreds2 = num5 / 100;
        int numOfTens2 = num5 / 10 % 10;
        int numOfOne2 = num5 % 10;
        System.out.println("Исходные числа: " + num4 + " и " + num5);
        if (numOfHundreds1 == numOfHundreds2) {
            System.out.println("Одинаковая цифра " + numOfHundreds1 + " в 3 разряде");
        }
        if (numOfTens1 == numOfTens2) {
            System.out.println("Одинаковая цифра " + numOfTens2 + " во 2 разряде");
        }
        if (numOfOne1 == numOfOne2) {
            System.out.println("Одинаковая цифра " + numOfOne1 + " в 1 разряде");
        }

        System.out.println("\n5.Определение буквы, числа или символа по их коду");
        char someChar = '\u0057';
        if (someChar >= '0' && someChar <= '9') {
            System.out.println(someChar + " - число"); 
        } else if (someChar >= 'A' && someChar <= 'Z') {
            System.out.println(someChar + " - большая буква"); 
        } else if (someChar >= 'a' && someChar <= 'z') {
            System.out.println(someChar + " - маленькая буква"); 
        } else {
            System.out.println(someChar + " - не буква и не число"); 
        }

        System.out.println("\n6.Определение суммы вклада и начисленных банком %");
        float deposit = 300000f;
        float percent = 0f;
        if (deposit < 100000) {
            percent = (deposit / 100) * 5;
        } else if (deposit >= 100000 && deposit <= 300000) {
            percent = (deposit / 100) * 7;
        } else {
            percent = (deposit / 100) * 10;
        }
        float allSum = deposit + percent;
        System.out.print("Сумма вклада: " + deposit + " Начисленный процент: " + percent);
        System.out.print(" Итоговая сумма: " + allSum);

        System.out.println("\n\n7.Определение оценки по предметам");
        int historyPercent = 59;
        int programmingPercent = 91;
        int markHist = 0;
        int markProg = 0;
        if (historyPercent > 91) {
            markHist = 5;
        } else if (historyPercent > 73) {
            markHist = 4;
        } else if (historyPercent > 60) {
            markHist = 3;
        } else {
            markHist = 2;
        }
        if (programmingPercent > 91) {
            markProg = 5;
        } else if (programmingPercent > 73) {
            markProg = 4;
        } else if (programmingPercent > 60) {
            markProg = 3;
        } else {
            markProg = 2;
        }
        float averMark = (markProg + markHist) / 2;
        float averPerc = (historyPercent + programmingPercent) / 2;
        System.out.println(markHist + " - история\n" + markProg + " - программирование");
        System.out.println("Средний балл оценок по предметам: " + averMark);
        System.out.println("Средний % по предметам: " + averPerc);

        System.out.println("\n8.Расчет прибыли");
        int arendPerMonth = 5000;
        int salePerMonth = 13000;
        int netCost = 9000;
        int yearProfit = (salePerMonth - arendPerMonth - netCost) * 12;
        if (yearProfit > 0) {
            System.out.println("Прибыль за год: +" + yearProfit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + yearProfit + " руб.");
        }

        System.out.println("\n9.Подсчет количества банкнот");
        int takePrice = 567;
        numOfHundreds1 = takePrice / 100;
        numOfTens1 = takePrice / 10 % 10;
        numOfOne1 = takePrice % 10;
        if (numOfTens1 > 5) {
            numOfOne1 += (numOfTens1 - 5) * 10;
            numOfTens1 = 5;
        }
        int sum = numOfHundreds1 * 100 + numOfTens1 * 10 + numOfOne1;
        System.out.println("Номинал: 100, " + "количество: " + numOfHundreds1);
        System.out.println("Номинал: 10, " + "количество: " + numOfTens1);
        System.out.println("Номинал: 1, " + "количество: " + numOfOne1);
        System.out.println("Исходная сумма: " + sum);
    }
}