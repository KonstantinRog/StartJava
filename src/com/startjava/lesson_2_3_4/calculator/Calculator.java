package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private String[] expression = new String[3];
    private int firstNumber;
    private int secondNumber;
    private char sign;

    public void setExpression(String expression) {
        this.expression = expression.split(" ");
    }

    public void calculate() {
        firstNumber = Integer.parseInt(expression[0]);
        sign = expression[1].charAt(0);
        secondNumber = Integer.parseInt(expression[2]);
        int result;
        switch(sign) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("Ошибка вычислений");
                    return;
                } else {
                    result = firstNumber / secondNumber;
                }
                break;
            case '^':
                result = (int) Math.pow(firstNumber, secondNumber);
                break;
            case '%':
                result = (int) (Math.IEEEremainder(firstNumber, secondNumber));
                break;
            default:
                System.out.println("Ошибка вычислений");
                return;
        }
        System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + result);
    }
}