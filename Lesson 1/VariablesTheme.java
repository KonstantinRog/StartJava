public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        boolean twoMonitors = true;
        short psu = 700;
        byte videoMemory = 8;
        int price = 150000;
        long priceForBillion = (long) price * 1000000000;
        char ddr = '4';
        float cpuFreq = 4.6f;
        double gpuFreq = 1750.94234234d;
        System.out.println("Характеристики ПК:");
        System.out.println("Блок питания: " + psu + " ватт");
        System.out.println("Два монитора: " + twoMonitors);
        System.out.println("Количество видеопамяти: " + videoMemory + " ГБ");
        System.out.println("Стоимость ПК: " + price);
        System.out.println("Цена за миллиард таких ПК:" + priceForBillion);
        System.out.println("Сокет памяти: DDR" + ddr);
        System.out.println("Частота процессора: " + cpuFreq + " ГГц");
        System.out.println("Частота видеоадаптера: " + gpuFreq + " МГц");

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        float penPrice = 100;
        float bookPrice = 200;
        float discount = 11;
        float sumDiscount = (penPrice + bookPrice) / 100 * discount;
        float discountPrice = penPrice + bookPrice - sumDiscount;
        System.out.println("Сумма скидки: " + sumDiscount);
        System.out.println("Сумма товаров со скидкой: " + discountPrice + "\n");

        System.out.println("3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a     \n   J   a a  v   v  a a    ");
        System.out.println("J  J  aaaaa  V V  aaaaa    \n JJ  a     a  V  a     a");

        System.out.println("\n4. Отображение min и max значений числовых типов данных");
        byte numForByte = 127;
        short numForShort = 32767;
        int numForInt = 2147483647;
        long numForLong = 9223372036854775807l;
        System.out.println(++numForByte);
        System.out.println(--numForByte);
        System.out.println(++numForShort);
        System.out.println(--numForShort);
        System.out.println(++numForInt);
        System.out.println(--numForInt);
        System.out.println(++numForLong);
        System.out.println(--numForLong);

        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        int num3 = 0;
        System.out.println("С помощью третьей переменной:");
        System.out.println("Исходные значения переменных: " + num1 + " и " + num2);
        num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("Новые значения переменных: " + num1 + " и " + num2);

        System.out.println("С помощью арифметических операций:");
        System.out.println("Исходные значения переменных: " + num1 + " и " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Новые значения переменных: " + num1 + " и " + num2);

        System.out.println("С помощью побитовой операции:");
        System.out.println("Исходные значения переменных: " + num1 + " и " + num2);
        num1 = num1 ^ num2;
        num2 = num2 ^ num1;
        num1 = num1 ^ num2;
        System.out.println("Новые значения переменных: " + num1 + " и " + num2 );

        System.out.println("\n6. Вывод символов и их кодов");
        char ch1 = 35;
        char ch2 = 38;
        char ch3 = 64;
        char ch4 = 94;
        char ch5 = 95;
        System.out.println("Код символа: " + (int) ch1 + " " + ch1);
        System.out.println("Код символа: " + (int) ch2 + " " + ch2);
        System.out.println("Код символа: " + (int) ch3 + " " + ch3);
        System.out.println("Код символа: " + (int) ch4 + " " + ch4);
        System.out.println("Код символа: " + (int) ch5 + " " + ch5);

        System.out.println("\n7. Отображение количества сотен, десятков и единиц числа");
        int val = 123;
        int numOfHundreds = val / 100;
        int numOfTens = val / 10 % 10;
        int numOfOne = val % 10;
        System.out.println("Число " + val + " содержит:\n" + numOfHundreds + " сотен");
        System.out.println(numOfTens + " десятков\n" + numOfOne + " единиц"); 

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        //???
        var sl = '/';
        char bs = '\\';
        char uL = '_';
        char sp = ' ';
        char lBr = '(';
        char rBr = ')';
        System.out.printf("%c%c%c%c%c%c\n", sp, sp, sp, sp, sl, bs);
        System.out.printf("%c%c%c%c%c%c%c\n", sp, sp, sp, sl, sp, sp, bs);
        System.out.printf("%c%c%c%c%c%c%c%c\n", sp, sp, sl, uL, lBr, sp, rBr, bs);
        System.out.printf("%c%c%c%c%c%c%c%c%c\n", sp, sl, sp, sp, sp, sp, sp, sp, bs);
        System.out.printf("%c%c%c%c%c%c%c%c%c%c\n", sl, uL, uL, uL, uL, sl, bs, uL, uL, bs);

        System.out.println("\n9. Произведение и сумма цифр числа");
        int originNum = 345;
        int sum = originNum / 100 + originNum / 10 % 10 + originNum % 10;
        int pr = (originNum / 100) * (originNum / 10 % 10) * (originNum % 10);
        System.out.println("Сумма цифр числа " + originNum + " = " + sum);
        System.out.println("Произведение цифр числа " + originNum + " = " + pr);

        System.out.println("\n10. Преобразование секунд");
        int sec = 86399;
        int hours = sec / 3600;
        int minutes = (sec % 3600) / 60;
        int secNew = (sec % 3600) % 60;
        System.out.printf("%02d:%02d:%02d", hours, minutes, secNew);
    }
}