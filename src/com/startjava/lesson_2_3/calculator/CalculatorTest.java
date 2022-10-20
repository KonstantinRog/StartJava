package com.startjava.lesson_2_3.calculator;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer = "";

        do {
            System.out.println("Введите первое число:");
            calculator.setFirstNumber(scan.nextInt());
            System.out.println("Введите знак математической операции:");
            scan.nextLine();
            calculator.setSign(scan.nextLine().charAt(0));
            System.out.println("Введите второе число: ");
            calculator.setSecondNumber(scan.nextInt());
            calculator.calculate();

            scan.nextLine();
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scan.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while(answer.equals("yes"));
    }
}