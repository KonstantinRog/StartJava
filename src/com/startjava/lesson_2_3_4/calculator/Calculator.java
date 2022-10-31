package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char sign;

    public void setExpression(String expr) {
        String[] expression;
        expression = expr.split(" ");
        firstNumber = Integer.parseInt(expression[0]);
        sign = expression[1].charAt(0);
        secondNumber = Integer.parseInt(expression[2]);
    }

    public int calculate(String expression) {
        setExpression(expression);
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
                    return 0;
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
                return 0;
        }
        return result;
    }
}