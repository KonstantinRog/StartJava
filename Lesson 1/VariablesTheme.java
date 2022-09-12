
public class VariablesTheme {
    public static void main(String[] args) {
        boolean twoMonitors = true;
        short psu = 700;
        byte videoMemory = 8;
        int price = 150000;
        long priceLong = (long) price;
        long priceForBillion;
        char ddr = '4';
        float cpuFreq = 4.6f;
        double gpuFreq = 1750.94234234d;
        priceForBillion = priceLong * 1000000000;
        System.out.println("1. Создание переменных и вывод их значений на консоль");
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
        float sumDisc = (penPrice + bookPrice) / 100 * discount;
        float sumGoods = penPrice + bookPrice - sumDisc;
        System.out.println("Сумма скидки: " + sumDisc);
        System.out.println("Сумма товаров со скидкой: " + sumGoods + "\n");

        System.out.println("3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a     \n   J   a a  v   v  a a    ");
        System.out.println("J  J  aaaaa  V V  aaaaa    \n JJ  a     a  V  a     a");

        System.out.println("\n4. Отображение min и max значений числовых типов данных");
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807l;
        b++;
        System.out.println(b);
        b--;
        System.out.println(b);
        s++;
        System.out.println(s);
        s--;
        System.out.println(s);
        i++;
        System.out.println(i);
        i--;
        System.out.println(i);
        l++;
        System.out.println(l);
        l--;
        System.out.println(l);

        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        int num3 = 3;
        System.out.println("С помощью третьей переменной:");
        System.out.println("Исходные значения переменных: " + num1 + " и " + num2);
        num1 = num1 + num3;
        num2 = num2 - num3;
        System.out.println("Новые значения переменных: " + num1 + " и " + num2);

        System.out.println("С помощью арифметических операций:");
        System.out.println("Исходные значения переменных: " + num1 + " и " + num2);
        num1 = -num1 + 7;
        num2 = -num2 + 7;
        System.out.println("Новые значения переменных: " + num1 + " и " + num2);

        System.out.println("С помощью побитовой операции:");
        System.out.println("Исходные значения переменных: " + num1 + " и " + num2);
        num1 = 10 >> 1;
        num2 = 1 << 1;
        System.out.println("Новые значения переменных: " + num1 + " и " + num2 );

        System.out.println("\n6. Вывод символов и их кодов");
        char ch1 = 35;
        char ch2 = 38;
        char ch3 = 64;
        char ch4 = 94;
        char ch5 = 95;
        System.out.println(ch1);
        System.out.println("Код символа: " + (int) ch1 + " " + ch1);
        System.out.println("Код символа: " + (int) ch2 + " " + ch2);
        System.out.println("Код символа: " + (int) ch3 + " " + ch3);
        System.out.println("Код символа: " + (int) ch4 + " " + ch4);
        System.out.println("Код символа: " + (int) ch5 + " " + ch5);

        System.out.println("\n7. Отображение количества сотен, десятков и единиц числа");
        int val = 123;
        int[] split = splitNumb(val);
        System.out.println("Число " + val + " содержит:\n" + split[0] + " сотен");
        System.out.println(split[1] + " десятков\n" + split[2] + " единиц"); 

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        //???
        var sr = '/';
        char sl = '\\';
        char uL = '_';
        char sp = ' ';
        char lBr = '(';
        char rBr = ')';
        System.out.printf("%c%c%c%c%c%c\n", sp, sp, sp, sp, sr, sl);
        System.out.printf("%c%c%c%c%c%c%c\n", sp, sp, sp, sr, sp, sp, sl);
        System.out.printf("%c%c%c%c%c%c%c%c\n", sp, sp, sr, uL, lBr, sp, rBr, sl);
        System.out.printf("%c%c%c%c%c%c%c%c%c\n", sp, sr, sp, sp, sp, sp, sp, sp, sl);
        System.out.printf("%c%c%c%c%c%c%c%c%c%c\n", sr, uL, uL, uL, uL, sr, sl, uL, uL, sl);

        System.out.println("\n9. Произведение и сумма цифр числа");
        val = 345;
        split = splitNumb(val);
        int sum = split[0] + split[1] + split[2];
        int pr = split[0] * split[1] * split[2];
        System.out.println("Сумма цифр числа " + val + " = " + sum);
        System.out.println("Произведение цифр числа " + val + " = " + pr);

        System.out.println("\n10. Преобразование секунд");
        int sec = 86399;
        int hours = sec / 3600;
        int minutes = (sec - (hours * 3600)) / 60;
        int secNew = (sec - (hours * 3600) - (minutes * 60)) % 60;
        String out = String.format("%02d:%02d:%02d", hours, minutes, secNew);
        System.out.println(out);
    }
    
    public static int[] splitNumb(int num) {
        int[] split = new int[3];
        split[0] = num / 100;
        split[1] = num / 10 % 10;
        split[2] = num % 10;
        return split;
    }
    
}