public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 26;
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
        int num3 = 777;
        if (num3 > 0 ) {
            if (num3 % 2 == 0) {
                System.out.println("Число " + num3 + " больше 0 и четное");
            } else {
                System.out.println("Число " + num3 + " больше 0 и нечетное");
            }
        } else if (num3 < 0) {
            if (num3 % 2 == 0) {
                System.out.println("Число " + num3 + " меньше 0 и четное");
            } else {
                System.out.println("Число " + num3 + " меньше 0 и нечетное");
            }
        } else {
            System.out.println("Число равно 0");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num4 = 345;
        int num5 = 365;
        int[] split = splitNumb(num4);
        int[] split2 = splitNumb(num5);
        System.out.println("Исходные числа: " + num4 + " и " + num5);
        if (split[0] == split2[0]) {
            System.out.println("Одинаковая цифра " + split[0] + " в 3 разряде");
        }
        if (split[1] == split2[1]) {
            System.out.println("Одинаковая цифра " + split[1] + " во 2 разряде");
        }
        if (split[2] == split2[2]) {
            System.out.println("Одинаковая цифра " + split[2] + " в 1 разряде");
        }

        System.out.println("\n5.Определение буквы, числа или символа по их коду");
        char ch = '\u0057';
        if ((int) ch >= 48 && (int) ch <= 57) {
            System.out.println(ch + " - число"); 
        } else if ((int) ch >= 65 && (int) ch <= 90) {
            System.out.println(ch + " - большая буква"); 
        } else if ((int) ch >= 97 && (int) ch <= 122) {
            System.out.println(ch + " - маленькая буква"); 
        } else {
            System.out.println(ch + " - не буква и не число"); 
        }

        System.out.println("\n 6.Определение суммы вклада и начисленных банком %");
        float cont = 300000f;
        float percent = 0f;
        float allSum = 0f;
        if (cont < 100000) {
            percent = (cont / 100) * 5;
        } else if (cont >= 100000 && cont <= 300000) {
            percent = (cont / 100) * 7;
        } else {
            percent = (cont / 100) * 10;
        }
        allSum = cont + percent;
        System.out.print("Сумма вклада: " + cont + " Начисленный процент: " + percent);
        System.out.print(" Итоговая сумма: " + allSum);

        System.out.println("\n\n7.Определение оценки по предметам");
        int history = 59;
        int prog = 91;
        int markHist = 0;
        int markProg = 0;
        float averMark = 0f;
        float averPerc = 0f;
        if (history <= 60) {
            markHist = 2;
        } else if (history > 91) {
            markHist = 3;
        } else if (history > 73) {
            markHist = 4;
        } else if (history > 60) {
            markHist = 5;
        }
        if (prog <= 60) {
            markProg = 2;
        } else if (prog > 92) {
            markProg = 3;
        } else if (prog > 73) {
            markProg = 4;
        } else if (prog > 60) {
            markProg = 5;
        }
        averMark = (markProg + markHist) / 2;
        averPerc = (history + prog) / 2;
        System.out.println(markHist + " - история\n" + markProg + " - программирование");
        System.out.println("Средний балл оценок по предметам: " + averMark);
        System.out.println("Средний % по предметам: " + averPerc);

        System.out.println("\n8.Расчет прибыли");
        int arendPerMonth = 5000;
        int salePerMonth = 13000;
        int netCost = 9000;
        int yearProfit = 0;
        yearProfit = (salePerMonth - arendPerMonth - netCost) * 12;
        if (yearProfit > 0) {
            System.out.println("Прибыль за год: +" + yearProfit + " руб.");
        } else if (yearProfit < 0) {
            System.out.println("Прибыль за год: " + yearProfit + " руб.");
        }

        System.out.println("\n9.Подсчет количества банкнот");
        int takePrice = 567;
        int hundreds = 0;
        int tens = 0;
        int one = 0;
        int sum = 0;
        split = splitNumb(takePrice);
        hundreds = split[0];
        tens = split[1];
        one = split[2];
        if (tens > 5) {
            tens = 5;
            one += (split[1] - 5) * 10;
        }
        sum = hundreds * 100 + tens * 10 + one;
        System.out.println("Номинал: 100, " + "количество: " + hundreds);
        System.out.println("Номинал: 10, " + "количество: " + tens);
        System.out.println("Номинал: 1, " + "количество: " + one);
        System.out.println("Исходная сумма: " + sum);
    }

    public static int[] splitNumb(int num) {
        int[] split = new int[3];
        split[0] = num / 100;
        split[1] = num / 10 % 10;
        split[2] = num % 10;
        return split;
    }
}